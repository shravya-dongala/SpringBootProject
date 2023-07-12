package com.sample.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.sample.demo.model.JustString;
import com.sample.demo.service.DemoService;

import java.util.List;

@RestController
@RequestMapping("/demo")
public class ControllerDemo {
    @Autowired
    private DemoService ds;
    @GetMapping(path="/getS")
    public List<String> getuser(){
        return ds.getNames();
    }

    @PostMapping(path="/postS")
    public boolean postS(@RequestBody JustString j){
        return ds.postName(j.getName());
    }


    @PutMapping(path="/putS")
    public boolean putS(@RequestBody JustString j){
        return ds.putName(j.getName());
    }


    @DeleteMapping(path="/delS")
    public boolean delS(@RequestParam String name){
        return ds.deleteName(name);
    }
}
