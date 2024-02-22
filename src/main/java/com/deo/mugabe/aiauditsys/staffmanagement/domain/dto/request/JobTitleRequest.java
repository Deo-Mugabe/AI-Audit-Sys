package com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.request;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class JobTitleRequest {
    @NotBlank
    private String jobTitle;
}
