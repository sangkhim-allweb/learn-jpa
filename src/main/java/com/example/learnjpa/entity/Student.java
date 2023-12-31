package com.example.learnjpa.entity;

import com.example.learnjpa.entity.base.Auditor;
import com.example.learnjpa.entity.enums.Sex;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Entity
@Table(name = "students")
@Data
public class Student {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "name")
  private String name;

  @ManyToMany(mappedBy = "students")
  private List<Course> courses;

  @Column(name = "sex")
  @Enumerated(EnumType.STRING)
  private Sex sex;

  @Embedded private Auditor auditor;
}
