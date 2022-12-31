package com.it.code.LoggerLot.repo;

import com.it.code.LoggerLot.model.PowerBall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface PBall extends JpaRepository<PowerBall,Long> {
    Set<PowerBall> getPowerBalls();
}
