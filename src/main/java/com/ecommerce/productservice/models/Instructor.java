package com.ecommerce.productservice.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.List;

@Entity
@Getter
@Setter
public class Instructor extends User{
    private Double salary;
    private String skill;
    @OneToMany(mappedBy = "instructor", cascade = CascadeType.REMOVE)
    @Fetch(FetchMode.JOIN)
    private List<Batch> batch;
}
