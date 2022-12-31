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
        megaValue.setMegaBallWhite4(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallWhite5(generateMega(MEGA_WHITE_BALL_BOUND));
        megaValue.setMegaBallCountLast(generateMega(MEGA_BALL_BOUND));

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
        powerValue.setPowerBallWhite4(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallWhite5(generateMega(POWER_WHITE_BALL_BOUND));
        powerValue.setPowerBallCountLast(generateMega(POWER_BALL_BOUND));

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
