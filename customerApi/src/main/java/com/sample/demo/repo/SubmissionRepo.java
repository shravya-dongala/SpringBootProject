package com.sample.demo.repo;

import java.util.*;

import org.springframework.stereotype.Repository;

import com.sample.demo.model.SubmissionDTO;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Repository
public class SubmissionRepo implements SubmissionRepository {

    private  Map<String, SubmissionDTO> submissions = new HashMap<>();

    @Override
    public SubmissionDTO getSubmission(String id) {

        return submissions.get(id);
    }

    @Override
    public List<SubmissionDTO> getAll() {
        return new ArrayList<>(submissions.values());
    }

    @Override
    public SubmissionDTO addSubmission(SubmissionDTO submission) {
        String id = UUID.randomUUID().toString();
        submission.setId(id);

        submissions.put(id, submission);
        return submission;
    }

    @Override
    public SubmissionDTO updateSubmission(SubmissionDTO submission) {
        String id = submission.getId();
        if (submissions.containsKey(id)) {
            submissions.put(id, submission);
            return submission;
        }
        return null;
    }

    @Override
    public boolean deleteSubmission(String id) {


         submissions.entrySet().stream().filter(es -> {
            if(es.getValue().getConsultantName().equals(id)){
                return true;
            }
            return false;
        }).map(k -> k.getKey()).forEach(submissions::remove);



        return true;
    }
}