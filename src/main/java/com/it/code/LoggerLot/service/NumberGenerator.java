package com.it.code.LoggerLot.service;

import com.it.code.LoggerLot.model.MegaBall;
import com.it.code.LoggerLot.model.PowerBall;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class NumberGenerator {
    public NumberGenerator() {
    }

    private final String MEGA_BALL = "MegaBall";
    private final String POWER_BALL = "PowerBall";
    private final int MEGA_WHITE_BALL_BOUND = 71;
    private final int MEGA_BALL_BOUND = 26;
    private final int POWER_WHITE_BALL_BOUND = 70;
    private final int POWER_BALL_BOUND = 27;


    public int generateMega(int ball) {

        Random random = new Random();

        return random.nextInt(ball);
    }

    public void setMBalls(MegaBall megaValue) {

        megaValue.setGameNAme(MEGA_BALL);
        megaValue.setMegaBallWhite1(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallWhite2(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallWhite3(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallWhite4(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallWhite5(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallCountLast(generateMega(MEGA_BALL_BOUND));

        Set<Integer> megaSet = new HashSet<>();

        megaSet.add(megaValue.getMegaBallWhite1());
        megaSet.add(megaValue.getMegaBallWhite2());
        megaSet.add(megaValue.getMegaBallWhite3());
        megaSet.add(megaValue.getMegaBallWhite4());
        megaSet.add(megaValue.getMegaBallWhite5());

        if (megaSet.size() == 5 && !megaSet.contains(0)) {
            megaValue.setGameNAme(MEGA_BALL);
            megaValue.setMegaBallWhite1( megaValue.getMegaBallWhite1());
            megaValue.setMegaBallWhite2(megaValue.getMegaBallWhite2());
            megaValue.setMegaBallWhite3(megaValue.getMegaBallWhite3());
            megaValue.setMegaBallWhite4(megaValue.getMegaBallWhite4());
            megaValue.setMegaBallWhite5(megaValue.getMegaBallWhite5());
            megaValue.setMegaBallCountLast(generateMega(MEGA_BALL_BOUND));
        } else {

           try {
               setMBalls( megaValue);
           }catch (Exception e) {

               System.out.println(e.getMessage());
           }
        }
    }


    public Set<MegaBall> generateMegaNumber() {

        MegaBall megaValue = new MegaBall();
        setMBalls(megaValue);

        Set<MegaBall> result = new HashSet<>();

        if (megaValue.getMegaBallWhite1() != 0 || megaValue.getMegaBallWhite2() != 0 ||
                megaValue.getMegaBallWhite3() != 0 || megaValue.getMegaBallWhite4() != 0 ||
                megaValue.getMegaBallWhite5() != 0 || megaValue.getMegaBallCountLast() != 0) {

            result.add(megaValue);
        } else {
            setMBalls(megaValue);
        }

        return result;

    }

    public void setPBalls(PowerBall powerValue) {

        powerValue.setGameNAme(POWER_BALL);
        powerValue.setPowerBallWhite1(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallWhite2(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallWhite3(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallWhite4(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallWhite5(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallCountLast(generateMega(POWER_BALL_BOUND));

        Set<Integer> powerSet = new HashSet<>();

        powerSet.add(powerValue.getPowerBallWhite1());
        powerSet.add(powerValue.getPowerBallWhite2());
        powerSet.add(powerValue.getPowerBallWhite3());
        powerSet.add(powerValue.getPowerBallWhite4());
        powerSet.add(powerValue.getPowerBallWhite5());

        if (powerSet.size() == 5 && !powerSet.contains(0)) {
            powerValue.setGameNAme(MEGA_BALL);
            powerValue.setPowerBallWhite1( powerValue.getPowerBallWhite1());
            powerValue.setPowerBallWhite2(powerValue.getPowerBallWhite2());
            powerValue.setPowerBallWhite3(powerValue.getPowerBallWhite3());
            powerValue.setPowerBallWhite4(powerValue.getPowerBallWhite4());
            powerValue.setPowerBallWhite5(powerValue.getPowerBallWhite5());
            powerValue.setPowerBallCountLast(generateMega(MEGA_BALL_BOUND));
        } else {

            try {
                setPBalls( powerValue);
            }catch (Exception e) {

                System.out.println(e.getMessage());
            }
        }

    }

    public Set<PowerBall> generatePowerNumber() {

        PowerBall powerValue = new PowerBall();
        setPBalls(powerValue);

        Set<PowerBall> result = new HashSet<>();

        if (powerValue.getPowerBallWhite1() != 0 || powerValue.getPowerBallWhite2() != 0 ||
                powerValue.getPowerBallWhite3() != 0 || powerValue.getPowerBallWhite4() != 0 ||
                powerValue.getPowerBallWhite5() != 0 || powerValue.getPowerBallCountLast() != 0) {

            result.add(powerValue);
        } else {
            setPBalls(powerValue);
        }

        return result;

    }
}
