package com.sample.demo.repo;

import java.util.List;

import com.sample.demo.model.SubmissionDTO;

public interface SubmissionRepository {

    SubmissionDTO getSubmission(String id);

    List<SubmissionDTO> getAll();
    SubmissionDTO addSubmission(SubmissionDTO submission);
    SubmissionDTO updateSubmission(SubmissionDTO submission);
    boolean deleteSubmission(String id);

}
