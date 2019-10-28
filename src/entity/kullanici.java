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
public class kullanici {
    private int kno;
    private String kkullaniciadi;
    private String ksifre;
    private int sicil;
    private String renk;

    public int getKno() {
        return kno;
    }

    public void setKno(int kno) {
        this.kno = kno;
    }

    public String getKkullaniciadi() {
        return kkullaniciadi;
    }

    public void setKkullaniciadi(String kkullaniciadi) {
        this.kkullaniciadi = kkullaniciadi;
    }

    public String getKsifre() {
        return ksifre;
    }

    public void setKsifre(String ksifre) {
        this.ksifre = ksifre;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    @Override
    public String toString() {
        return "kullanici{" + "kno=" + kno + ", kkullaniciadi=" + kkullaniciadi + ", ksifre=" + ksifre + ", sicil=" + sicil + ", renk=" + renk + '}';
    }

    public kullanici(int kno, String kkullaniciadi, String ksifre, int sicil, String renk) {
        this.kno = kno;
        this.kkullaniciadi = kkullaniciadi;
        this.ksifre = ksifre;
        this.sicil = sicil;
        this.renk = renk;
    }

    public kullanici() {
    }

}
