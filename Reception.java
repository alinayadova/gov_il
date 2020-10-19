package com.example.gov.model;

public class Reception {
    private String city;
    private String department;


    public Reception setCity(String city) {
        this.city = city;
        return this;
    }


    public String getCity() {
        return city;
    }


    public Reception setDepartment(String department) {
        this.department = department;
        return this;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Reception{" +
                "city='" + city + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
