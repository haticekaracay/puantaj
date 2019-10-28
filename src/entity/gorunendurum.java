/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import com.toedter.calendar.JDateChooser;
import java.util.Date;

/**
 *
 * @author haticeozbakir
 */
public class gorunendurum {
    private int gorno;
    private int sicil;
    private Date bastarihi;
    private Date bittarihi;
    private String durum;

    public int getGorno() {
        return gorno;
    }

    public void setGorno(int gorno) {
        this.gorno = gorno;
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
        return "gorunendurum{" + "gorno=" + gorno + ", sicil=" + sicil + ", bastarihi=" + bastarihi + ", bittarihi=" + bittarihi + ", durum=" + durum + '}';
    }

    public gorunendurum(int gorno, int sicil, Date bastarihi, Date bittarihi, String durum) {
        this.gorno = gorno;
        this.sicil = sicil;
        this.bastarihi = bastarihi;
        this.bittarihi = bittarihi;
        this.durum = durum;
    }

    public gorunendurum() {
    }
}
