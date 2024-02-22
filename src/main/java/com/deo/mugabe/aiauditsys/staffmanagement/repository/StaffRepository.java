package com.deo.mugabe.aiauditsys.staffmanagement.repository;

import com.deo.mugabe.aiauditsys.staffmanagement.domain.Staff;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StaffRepository extends JpaRepository<Staff, Long> {
}
