/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author haticeozbakir
 */
public class arkamesai {

    private int amesaino;
    private int sicil;
    private int gun;
    private int ay;
    private int yil;
    private String durum;
    private float msure;

    public arkamesai(int amesaino, int sicil, int gun, int ay, int yil, String durum, float msure) {
        this.amesaino = amesaino;
        this.sicil = sicil;
        this.gun = gun;
        this.ay = ay;
        this.yil = yil;
        this.durum = durum;
        this.msure = msure;
    }

    public arkamesai() {
    }

    public int getAmesaino() {
        return amesaino;
    }

    public void setAmesaino(int amesaino) {
        this.amesaino = amesaino;
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

    public float getMsure() {
        return msure;
    }

    public void setMsure(float msure) {
        this.msure = msure;
    }

    @Override
    public String toString() {
        return "arkamesai{" + "amesaino=" + amesaino + ", sicil=" + sicil + ", gun=" + gun + ", ay=" + ay + ", yil=" + yil + ", durum=" + durum + ", msure=" + msure + '}';
    }
   
   
}
