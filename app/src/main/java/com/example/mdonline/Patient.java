package com.example.mdonline;

public class Patient {
    private String id;
    private String email;
    private String phone;
    private String name;
    private Doctor doctor;

    public Patient(String id, String email, String phone, String name, Doctor doctor) {
        this.id = id;
        this.email = email;
        this.phone = phone;
        this.name = name;
        this.doctor = doctor;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
