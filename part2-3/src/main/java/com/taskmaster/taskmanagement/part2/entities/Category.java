package com.taskmaster.taskmanagement.part2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    String name;

    public Category() {

    }

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
}
