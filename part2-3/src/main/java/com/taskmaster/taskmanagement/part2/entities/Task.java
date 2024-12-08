package com.taskmaster.taskmanagement.part2.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "tasks")
public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String title;
    private String description;

    @ManyToMany
    @JoinTable(name = "categories",
            joinColumns = {@JoinColumn(name = "id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "candidateSkills_id", referencedColumnName = "id")})

    private List<Category> categories;

    private Priority priority;
    private Date dueDate;

    private String completionStatus;

    public List<Category> getCategories() {
        return this.categories;
    }
}
