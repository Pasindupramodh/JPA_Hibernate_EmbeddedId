package org.example.entity;

import jakarta.persistence.*;
import org.example.entity.generators.UUIDGenerator;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Employee {
    @Id
    @Column(name = "id" ,length = 600)
    @GenericGenerator(name = "UUIDGenerator",type = UUIDGenerator.class)
    @GeneratedValue(generator = "UUIDGenerator")

    private String id;
    private String name;
    private String address;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
