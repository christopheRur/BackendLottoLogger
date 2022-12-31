package com.it.code.LoggerLot.repo;

import com.it.code.LoggerLot.model.MegaBall;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface MBall extends JpaRepository<MegaBall,Long> {
    Set<MegaBall> getMegaBalls();
}

        
