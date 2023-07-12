package com.sample.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.demo.model.SubmissionDTO;
import com.sample.demo.repo.SubmissionRepository;

import java.util.List;

@Service
public class SubmissionServiceImp implements SubmissionService {
@Autowired
    private SubmissionRepository submissionRepository;



    @Override
    public SubmissionDTO getSubmission(String id) {
        return submissionRepository.getSubmission(id);
    }

    @Override
    public SubmissionDTO addSubmission(SubmissionDTO submission) {
        return submissionRepository.addSubmission(submission);
    }

    @Override
    public SubmissionDTO updateSubmission(SubmissionDTO submission) {
        return submissionRepository.updateSubmission(submission);
    }

    @Override
    public boolean deleteSubmission(String id) {
        return submissionRepository.deleteSubmission(id);
    }

    @Override
    public List<SubmissionDTO> getAll() {
        return submissionRepository.getAll();
    }
}
