package com.it.code.LoggerLot.service;

import com.it.code.LoggerLot.model.MegaBall;
import com.it.code.LoggerLot.model.PowerBall;
import com.it.code.LoggerLot.repo.MBall;
import com.it.code.LoggerLot.repo.PBall;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

@Service
public class LottoService{

    private MBall mBall;
    private PBall pBall;

    @Autowired
    public LottoService(MBall megaBall,PBall powerBall){
        this.mBall = megaBall;
        this.pBall = powerBall;
    }

    public Set<MegaBall> getMegaBalls(){
        return mBall.getMegaBalls();
    }

    public Set<PowerBall> getPowerBalls(){
        return pBall.getPowerBalls();
    }

    public MegaBall addMegaBalls(){
        Iterator<MegaBall> ballsIterator=megaLotto().iterator();

        MegaBall megaBall=ballsIterator.next();

        Set<Integer> megaSet=new HashSet<>();

        megaSet.add(megaBall.getMegaBallWhite1());
        megaSet.add(megaBall.getMegaBallWhite2());
        megaSet.add(megaBall.getMegaBallWhite3());
        megaSet.add(megaBall.getMegaBallWhite4());
        megaSet.add(megaBall.getMegaBallWhite5());

        if(megaSet.size()==5) {return mBall.save(megaBall);}

        else {
        megaSet.add(megaBall.getMegaBallWhite1());
        megaSet.add(megaBall.getMegaBallWhite2());
        megaSet.add(megaBall.getMegaBallWhite3());
        megaSet.add(megaBall.getMegaBallWhite4());
        megaSet.add(megaBall.getMegaBallWhite5());
        }




        return  mBall.save(megaBall);

    }

    public PowerBall addPowerBalls(){
        Iterator<PowerBall> ballsIterator=powerLotto().iterator();

        PowerBall powerBall=ballsIterator.next();

        return pBall.save(powerBall);
    }

    public Set<MegaBall> megaLotto(){

        NumberGenerator numb= new NumberGenerator();

        return numb.generateMegaNumber();
    }

    public Set<PowerBall> powerLotto(){
        NumberGenerator numb= new NumberGenerator();

        return numb.generatePowerNumber();
    }

}
