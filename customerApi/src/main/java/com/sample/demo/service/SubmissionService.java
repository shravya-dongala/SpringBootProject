package com.sample.demo.service;

import java.util.List;

import com.sample.demo.model.SubmissionDTO;

public interface SubmissionService {
    SubmissionDTO getSubmission(String id);

    SubmissionDTO addSubmission(SubmissionDTO submission);

    SubmissionDTO updateSubmission(SubmissionDTO submission);

    boolean deleteSubmission(String id);

    List<SubmissionDTO> getAll();

}
