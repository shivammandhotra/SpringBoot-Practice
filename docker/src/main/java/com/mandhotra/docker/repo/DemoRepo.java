package com.mandhotra.docker.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mandhotra.docker.entity.DemoEntity;

@Repository
public interface DemoRepo extends JpaRepository<DemoEntity,Integer>{

}
