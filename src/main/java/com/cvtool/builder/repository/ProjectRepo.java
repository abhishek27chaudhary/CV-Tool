package com.cvtool.builder.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cvtool.builder.entity.Project;

public interface ProjectRepo extends JpaRepository<Project, Long>{

}
