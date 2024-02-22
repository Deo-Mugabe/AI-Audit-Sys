package com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.request;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.JobTitle;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.Set;

@Data
public class StaffRequest {


    @NotBlank
    private String  firstName;

    @NotBlank
    private String lastName;

    @Email
    @NotBlank
    private String email;

    @NotNull
    private Long jobTitleId;

    private Set<ExpertiseRequest> expertise; //= new HashSet<>();;
}
