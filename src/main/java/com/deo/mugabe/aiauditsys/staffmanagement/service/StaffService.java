package com.deo.mugabe.aiauditsys.staffmanagement.service;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.request.StaffRequest;
import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.response.StaffResponse;

import java.util.List;

public interface StaffService {
    List<StaffResponse> getAllStaff();

    void createStaff(StaffRequest staffRequest);
}
