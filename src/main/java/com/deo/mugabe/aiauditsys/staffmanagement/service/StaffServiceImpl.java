package com.deo.mugabe.aiauditsys.staffmanagement.service;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.JobTitle;
import com.deo.mugabe.aiauditsys.staffmanagement.domain.Staff;
import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.request.StaffRequest;
import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.response.StaffResponse;
import com.deo.mugabe.aiauditsys.staffmanagement.errors.NotFoundException;
import com.deo.mugabe.aiauditsys.staffmanagement.repository.JobTitleRepository;
import com.deo.mugabe.aiauditsys.staffmanagement.repository.StaffRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
@Slf4j
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;
    private final JobTitleRepository jobTitleRepository;

    @Override
    public List<StaffResponse> getAllStaff() {
        return staffRepository.findAll()
                .stream()
                .map(StaffResponse::from)
                .toList();
    }

    @Override
    public void createStaff(StaffRequest staffRequest) {
        Staff staff = new Staff();
        staff.setFirstName(staffRequest.getFirstName());
        staff.setLastName(staffRequest.getLastName());


        JobTitle jobTitle = jobTitleRepository.findById(staffRequest.getJobTitleId()).orElseThrow(() ->{
            log.error("Job Title not found: {}", staffRequest.getJobTitleId());
            return new NotFoundException("Job Title not found");
        }
        );

            staff.setJobTitle(jobTitle);

            staffRepository.save(staff);
        }

}