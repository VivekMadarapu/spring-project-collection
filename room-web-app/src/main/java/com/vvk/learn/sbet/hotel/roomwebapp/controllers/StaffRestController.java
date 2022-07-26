package com.vvk.learn.sbet.hotel.roomwebapp.controllers;

import com.vvk.learn.sbet.hotel.roomwebapp.models.Employee;
import com.vvk.learn.sbet.hotel.roomwebapp.services.StaffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/staff")
public class StaffRestController {

    private final StaffService staffService;

    public StaffRestController(StaffService staffService) {
        this.staffService = staffService;
    }

    @GetMapping
    public List<Employee> getAllStaff(){
        return staffService.getAllStaff();
    }
}
