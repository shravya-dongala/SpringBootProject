package com.sample.demo.repo;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sample.demo.model.SubmissionDTO;
import com.sample.demo.repo.SubmissionRepo;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class SubmissionRepoTest {

    static SubmissionRepo sRep;
    @BeforeAll
    public static void init(){
         sRep= new SubmissionRepo();
    }


    @Test
    public void test_addSubmission() throws Exception{

        SubmissionDTO dto= getSubmission("07-12","mithili","java","Shree","Roe");
        Class<?> myClass = SubmissionRepo.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        int size=hm.size();

        SubmissionDTO result = sRep.addSubmission(dto);

        Assertions.assertNotNull(result);
        Assertions.assertEquals("mithili",result.getSalesPersonName());
        Assertions.assertEquals("Shree",result.getVendorName());
        Assertions.assertEquals(size+1,hm.size());
    }

    @Test
    public void test_updateSubmission() throws NoSuchFieldException, IllegalAccessException {
        SubmissionDTO dto= getSubmission("07-12","mithili","java","Ram","Roe");
        Class<?> myClass = SubmissionRepo.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);
        SubmissionDTO dto1= getSubmission("07-12","mithili","java","Shree","Roe");
        dto1.setId("id-1");
        SubmissionDTO result = sRep.updateSubmission(dto1);

        //check whether the vendorname updated from  uday to srihari

        Assertions.assertEquals("Shree",hm.get("id-1").getVendorName());

        Assertions.assertNotNull(result);

    }

    @Test
    public void test_delSubmission() throws Exception{
        SubmissionDTO dto= getSubmission("07-12","mithili","java","Shree","Roe");
        Class<?> myClass = SubmissionRepo.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);

        boolean result= sRep.deleteSubmission("Shree");

        Assertions.assertTrue(result);
        //Assertions.assertEquals(0,hm.size());

    }
    @Test
    public void test_getSubmission() throws Exception{
        SubmissionDTO dto= getSubmission("07-12","mithili","java","Shree","Roe");
        Class<?> myClass = SubmissionRepo.class;
        Field privateField = myClass.getDeclaredField("submissions");
        privateField.setAccessible(true);
        HashMap<String,SubmissionDTO> hm = (HashMap<String, SubmissionDTO>) privateField.get(sRep);
        hm.put("id-1",dto);

        SubmissionDTO result=sRep.getSubmission("id-1");
        Assertions.assertEquals("mithili",result.getSalesPersonName());
    }

    public static SubmissionDTO getSubmission(String date,String salesPersonName,String technology, String vendorName,String consultantName){
        SubmissionDTO dto = new SubmissionDTO();
        dto.setSubmissionDate(date);
        dto.setSalesPersonName(salesPersonName);
        dto.setTechnology(technology);
        dto.setVendorName(vendorName);
        dto.setConsultantName(consultantName);
        return dto;
    }
}
