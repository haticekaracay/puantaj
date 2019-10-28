/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author haticeozbakir
 */
public class bgtatil {
    private int bgno;
    private int sicil;
    private int gun;
    private int ay;
    private int yil;
    private String durum;

    public int getBgno() {
        return bgno;
    }

    public void setBgno(int bgno) {
        this.bgno = bgno;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public int getGun() {
        return gun;
    }

    public void setGun(int gun) {
        this.gun = gun;
    }

    public int getAy() {
        return ay;
    }

    public void setAy(int ay) {
        this.ay = ay;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "bgtatil{" + "bgno=" + bgno + ", sicil=" + sicil + ", gun=" + gun + ", ay=" + ay + ", yil=" + yil + ", durum=" + durum + '}';
    }

    public bgtatil(int bgno, int sicil, int gun, int ay, int yil, String durum) {
        this.bgno = bgno;
        this.sicil = sicil;
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
        this.durum = durum;
    }

    public bgtatil() {
    }
    
    
}
