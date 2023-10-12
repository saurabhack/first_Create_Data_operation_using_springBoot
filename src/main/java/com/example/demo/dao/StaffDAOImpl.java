package com.example.demo.dao;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.Staff;
import com.example.demo.dao.StaffDAO;
@Repository
public class StaffDAOImpl implements StaffDAO {
    private EntityManager entityManager;

    @Autowired
    public StaffDAOImpl(EntityManager entityManager){
        this.entityManager=entityManager;
    }
    @Override
    @Transactional
    public void save(Staff theStaff){
        entityManager.persist(theStaff);


    }
    @Override
    public Staff findById(Integer id){
        return entityManager.find(Staff.class, id);
    }
}
