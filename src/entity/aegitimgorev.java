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
public class aegitimgorev {
    private int aegno;
    private int sicil;
    private int gun;
    private int ay;
    private int yil;
    private String durum;

    public int getAegno() {
        return aegno;
    }

    public void setAegno(int aegno) {
        this.aegno = aegno;
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
        return "aegitimgorev{" + "aegno=" + aegno + ", sicil=" + sicil + ", gun=" + gun + ", ay=" + ay + ", yil=" + yil + ", durum=" + durum + '}';
    }

    public aegitimgorev(int aegno, int sicil, int gun, int ay, int yil, String durum) {
        this.aegno = aegno;
        this.sicil = sicil;
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
        this.durum = durum;
    }

    public aegitimgorev() {
    }
    
}
