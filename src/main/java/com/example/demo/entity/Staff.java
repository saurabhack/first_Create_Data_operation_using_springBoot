package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name="staff")
public class Staff {
    //define field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;

    @Column(name="email")
    private String email;
    @Column(name="hire_date")
    private String hireDate;

    @Column(name="salary")
    private double salary;

    public Staff(String firstName, String lastName, String email, String hireDate, double salary){
        this.firstName=firstName;
        this.lastName=lastName;
        this.email=email;
        this.hireDate= String.valueOf(hireDate);
        this.salary=salary;
    }
    public int getId(){
        return id;
    }
    public void setId(){
        this.id=id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(){
        this.firstName=firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(){
        this.lastName=lastName;
    }
    public String getEmail(){
        return email;
    }
    public void setEmail(){
        this.email=email;
    }
    public String getHireDate(){
        return hireDate;
    }
    public void setHireDate(){
        this.hireDate=hireDate;
    }
    public double getSalary(){
        return salary;
    }
    public void setSalary(){
        this.salary=salary;
    }
    @Override
    public String toString(){
        return "Staff{"+"id="+id+
                ",firstName='"+firstName+'\''+
                ",lastName="+lastName+'\''+
                ",email='"+email+'\''+
                ",salary='"+salary+'\''+"}";
    }
    public Staff(){

    }
}
