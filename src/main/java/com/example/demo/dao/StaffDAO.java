package com.example.demo.dao;
import com.example.demo.entity.Staff;
public interface StaffDAO {
    void save(Staff theStaff);

    Staff findById(Integer id);

}
