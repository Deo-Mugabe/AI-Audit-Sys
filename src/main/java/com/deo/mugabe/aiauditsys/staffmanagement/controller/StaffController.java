package com.deo.mugabe.aiauditsys.staffmanagement.controller;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.request.StaffRequest;
import com.deo.mugabe.aiauditsys.staffmanagement.domain.dto.response.StaffResponse;
import com.deo.mugabe.aiauditsys.staffmanagement.service.StaffService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/staff")
@RequiredArgsConstructor
public class StaffController {

    private final StaffService staffService;

    @GetMapping
    public ResponseEntity<List<StaffResponse>> getAllStaff(){
        List<StaffResponse> staffResponses = staffService.getAllStaff();
        return new ResponseEntity<>(staffResponses, HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<?> createStaff(@RequestBody StaffRequest staffRequest){
         staffService.createStaff(staffRequest);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
