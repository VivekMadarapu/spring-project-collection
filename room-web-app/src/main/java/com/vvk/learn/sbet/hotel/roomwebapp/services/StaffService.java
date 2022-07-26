package com.vvk.learn.sbet.hotel.roomwebapp.services;

import com.vvk.learn.sbet.hotel.roomwebapp.models.Employee;
import com.vvk.learn.sbet.hotel.roomwebapp.models.Position;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {

    private static final List<Employee> staff = new ArrayList<>();
    static{
        staff.add(new Employee(UUID.randomUUID().toString(), "John", "Doe", Position.CONCIERGE));
        staff.add(new Employee(UUID.randomUUID().toString(), "Jane", "Doe", Position.FRONT_DESK));
        staff.add(new Employee(UUID.randomUUID().toString(), "Oliver", "Handle", Position.SECURITY));
        staff.add(new Employee(UUID.randomUUID().toString(), "Sammy", "Smith", Position.HOUSEKEEPING));
    }

    public List<Employee> getAllStaff(){
        return staff;
    }
}
