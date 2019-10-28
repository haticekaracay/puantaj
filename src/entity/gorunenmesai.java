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
public class gorunenmesai {
    private int mesaino;
    private int sicil;
    private Date tarih;
    private String durum;
    private float msure;
    private String myer;
    private String mhakkinda;

    public gorunenmesai(int mesaino, int sicil, Date tarih, String durum, float msure, String myer, String mhakkinda) {
        this.mesaino = mesaino;
        this.sicil = sicil;
        this.tarih = tarih;
        this.durum = durum;
        this.msure = msure;
        this.myer = myer;
        this.mhakkinda = mhakkinda;
    }

    public gorunenmesai() {
    }

    public int getMesaino() {
        return mesaino;
    }

    public void setMesaino(int mesaino) {
        this.mesaino = mesaino;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public Date getTarih() {
        return tarih;
    }

    public void setTarih(Date tarih) {
        this.tarih = tarih;
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

    public String getMyer() {
        return myer;
    }

    public void setMyer(String myer) {
        this.myer = myer;
    }

    public String getMhakkinda() {
        return mhakkinda;
    }

    public void setMhakkinda(String mhakkinda) {
        this.mhakkinda = mhakkinda;
    }

    @Override
    public String toString() {
        return "gorunenmesai{" + "mesaino=" + mesaino + ", sicil=" + sicil + ", tarih=" + tarih + ", durum=" + durum + ", msure=" + msure + ", myer=" + myer + ", mhakkinda=" + mhakkinda + '}';
    }

    
}
