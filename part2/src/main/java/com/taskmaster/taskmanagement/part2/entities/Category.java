package com.taskmaster.taskmanagement.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    Integer categoryId;
    String name;

    public Category(){

    }

    public Category(String name){
        this.name = name;
    }
}
