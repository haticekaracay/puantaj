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
public class gegitimgorev {
    private int gegno;
    private int sicil;
    private Date bastarihi;
    private Date bittarihi;
    private String durum;

    public int getGegno() {
        return gegno;
    }

    public void setGegno(int gegno) {
        this.gegno = gegno;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public Date getBastarihi() {
        return bastarihi;
    }

    public void setBastarihi(Date bastarihi) {
        this.bastarihi = bastarihi;
    }

    public Date getBittarihi() {
        return bittarihi;
    }

    public void setBittarihi(Date bittarihi) {
        this.bittarihi = bittarihi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    @Override
    public String toString() {
        return "gegitimgorev{" + "gegno=" + gegno + ", sicil=" + sicil + ", bastarihi=" + bastarihi + ", bittarihi=" + bittarihi + ", durum=" + durum + '}';
    }

    public gegitimgorev(int gegno, int sicil, Date bastarihi, Date bittarihi, String durum) {
        this.gegno = gegno;
        this.sicil = sicil;
        this.bastarihi = bastarihi;
        this.bittarihi = bittarihi;
        this.durum = durum;
    }

    public gegitimgorev() {
    }
    
    
}
