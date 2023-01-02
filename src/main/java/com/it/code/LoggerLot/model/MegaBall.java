package com.it.code.LoggerLot.model;


import jakarta.persistence.*;

@Entity
public class MegaBall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, updatable = false)
    private Long id;

    private String gameNAme;
    private int megaBallCountLast;
    private int megaBallWhite1;
    private int megaBallWhite2;
    private int megaBallWhite3;
    private int megaBallWhite4;
    private int megaBallWhite5;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public MegaBall() {
    }

    public MegaBall(Long id, String gameNAme, int megaBallCountLast, int megaBallWhite1, int megaBallWhite2, int megaBallWhite3, int megaBallWhite4, int megaBallWhite5) {
        this.id = id;
        this.gameNAme = gameNAme;
        this.megaBallCountLast = megaBallCountLast;
        this.megaBallWhite1 = megaBallWhite1;
        this.megaBallWhite2 = megaBallWhite2;
        this.megaBallWhite3 = megaBallWhite3;
        this.megaBallWhite4 = megaBallWhite4;
        this.megaBallWhite5 = megaBallWhite5;
    }

    public String getGameNAme() {
        return gameNAme;
    }

    public void setGameNAme(String gameNAme) {
        this.gameNAme = gameNAme;
    }

    public int getMegaBallCountLast() {
        return megaBallCountLast;
    }

    public void setMegaBallCountLast(int megaBallCountLast) {
        this.megaBallCountLast = megaBallCountLast;
    }

    public int getMegaBallWhite1() {
        return megaBallWhite1;
    }

    public void setMegaBallWhite1(int megaBallWhite1) {
        this.megaBallWhite1 = megaBallWhite1;
    }

    public int getMegaBallWhite2() {
        return megaBallWhite2;
    }

    public void setMegaBallWhite2(int megaBallWhite2) {
        this.megaBallWhite2 = megaBallWhite2;
    }

    public int getMegaBallWhite3() {
        return megaBallWhite3;
    }

    public void setMegaBallWhite3(int megaBallWhite3) {
        this.megaBallWhite3 = megaBallWhite3;
    }

    public int getMegaBallWhite4() {
        return megaBallWhite4;
    }

    public void setMegaBallWhite4(int megaBallWhite4) {
        this.megaBallWhite4 = megaBallWhite4;
    }

    public int getMegaBallWhite5() {
        return megaBallWhite5;
    }

    public void setMegaBallWhite5(int megaBallWhite5) {
        this.megaBallWhite5 = megaBallWhite5;
    }

    @Override
    public String toString() {
        return "MegaBall{" +
                "id=" + id +
                ", gameNAme='" + gameNAme + '\'' +
                ", megaBallCountLast=" + megaBallCountLast +
                ", megaBallWhite1=" + megaBallWhite1 +
                ", megaBallWhite2=" + megaBallWhite2 +
                ", megaBallWhite3=" + megaBallWhite3 +
                ", megaBallWhite4=" + megaBallWhite4 +
                ", megaBallWhite5=" + megaBallWhite5 +
                '}';
    }
}
