package com.it.code.LoggerLot.model;

import javax.persistence.*;
import java.io.Serializable;
import javax.persistence.Entity;

@Entity
public class PowerBall implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String gameNAme;
    private int powerBallCountLast;
    private int powerBallWhite1;
    private int powerBallWhite2;
    private int powerBallWhite3;
    private int powerBallWhite4;
    private int powerBallWhite5;

    public PowerBall() {
    }

    public PowerBall(Long id, String gameNAme, int powerBallCountLast, int powerBallWhite1, int powerBallWhite2, int powerBallWhite3, int powerBallWhite4, int powerBallWhite5) {
        this.id = id;
        this.gameNAme = gameNAme;
        this.powerBallCountLast = powerBallCountLast;
        this.powerBallWhite1 = powerBallWhite1;
        this.powerBallWhite2 = powerBallWhite2;
        this.powerBallWhite3 = powerBallWhite3;
        this.powerBallWhite4 = powerBallWhite4;
        this.powerBallWhite5 = powerBallWhite5;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getGameNAme() {
        return gameNAme;
    }

    public void setGameNAme(String gameNAme) {
        this.gameNAme = gameNAme;
    }

    public int getPowerBallCountLast() {
        return powerBallCountLast;
    }

    public void setPowerBallCountLast(int powerBallCountLast) {
        this.powerBallCountLast = powerBallCountLast;
    }

    public int getPowerBallWhite1() {
        return powerBallWhite1;
    }

    public void setPowerBallWhite1(int powerBallWhite1) {
        this.powerBallWhite1 = powerBallWhite1;
    }

    public int getPowerBallWhite2() {
        return powerBallWhite2;
    }

    public void setPowerBallWhite2(int powerBallWhite2) {
        this.powerBallWhite2 = powerBallWhite2;
    }

    public int getPowerBallWhite3() {
        return powerBallWhite3;
    }

    public void setPowerBallWhite3(int powerBallWhite3) {
        this.powerBallWhite3 = powerBallWhite3;
    }

    public int getPowerBallWhite4() {
        return powerBallWhite4;
    }

    public void setPowerBallWhite4(int powerBallWhite4) {
        this.powerBallWhite4 = powerBallWhite4;
    }

    public int getPowerBallWhite5() {
        return powerBallWhite5;
    }

    public void setPowerBallWhite5(int powerBallWhite5) {
        this.powerBallWhite5 = powerBallWhite5;
    }

    @Override
    public String toString() {
        return "PowerBall{" +
                "id=" + id +
                ", gameNAme='" + gameNAme + '\'' +
                ", powerBallCountLast=" + powerBallCountLast +
                ", powerBallWhite1=" + powerBallWhite1 +
                ", powerBallWhite2=" + powerBallWhite2 +
                ", powerBallWhite3=" + powerBallWhite3 +
                ", powerBallWhite4=" + powerBallWhite4 +
                ", powerBallWhite5=" + powerBallWhite5 +
                '}';
    }
}
