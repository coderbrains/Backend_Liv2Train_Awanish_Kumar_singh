package com.demo.mvp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.mvp.model.TrainingCenter;

@Repository
public interface TrainingCenterRepo extends JpaRepository<TrainingCenter, Integer>{

}
