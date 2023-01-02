package com.it.code.LoggerLot;

import com.it.code.LoggerLot.model.MegaBall;
import com.it.code.LoggerLot.model.PowerBall;
import com.it.code.LoggerLot.service.LottoService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
@RequestMapping("/lotto")
public class LotteryController{
    private final LottoService lotSer;
    public LotteryController(LottoService lotSer) {
        this.lotSer = lotSer;
    }
    @GetMapping("/mega")
    public ResponseEntity<Set<MegaBall>> getMega(){
        Set<MegaBall> mBalls=lotSer.getMegaBalls();
        return new ResponseEntity<>(mBalls, HttpStatus.OK);
    }

    @GetMapping("/power")
    public ResponseEntity<Set<PowerBall>> getPower(){
        Set<PowerBall> pBalls=lotSer.getPowerBalls();
        return new ResponseEntity<>(pBalls, HttpStatus.OK);
    }

    @PostMapping("/addMega")
    public ResponseEntity<MegaBall> addMegaBall(){

        MegaBall newMBall=lotSer.addMegaBalls();

        return new ResponseEntity<>(newMBall, HttpStatus.CREATED);

    }

    @PostMapping("/addPower")
    public ResponseEntity<PowerBall> addPowerBall(){

        PowerBall newPBall=lotSer.addPowerBalls();

        return new ResponseEntity<>(newPBall, HttpStatus.CREATED);

    }



}
