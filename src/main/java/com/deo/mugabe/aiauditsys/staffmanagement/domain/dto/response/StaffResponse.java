package com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.response;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.Staff;

import java.util.Set;

public class StaffResponse {

    private Long staffId;

    private String firstName;

    private String lastName;

    private String email;

    private Long jobTitleId;

    private Set<ExpertiseResponse> expertise;

    public static StaffResponse from(Staff staff){
        StaffResponse response = new StaffResponse();
        response.staffId = staff.getId();
        response.firstName = staff.getFirstName();
        response.lastName = staff.getLastName();
        response.email = staff.getEmail();
        response.jobTitleId = staff.getJobTitle().getId();

        return response;
    }
}
