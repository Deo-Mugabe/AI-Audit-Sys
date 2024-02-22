package com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.response;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.JobTitle;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class JobTitleResponse {

    private Long id;
    private String jobTitle;


    static JobTitleResponse from(JobTitle jobTitle){
        JobTitleResponse jobTitleResponse =new JobTitleResponse();
        jobTitleResponse.id = jobTitle.getId();
        jobTitleResponse.jobTitle= jobTitle.getJobTitle();

        return jobTitleResponse;
    }
}
