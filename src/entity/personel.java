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
public class personel {
  private int sirano;
  private int sicil;
  private String adsoyad;
  private String unvan;
  private String statu;
  private int ano;

    public int getSirano() {
        return sirano;
    }

    public void setSirano(int sirano) {
        this.sirano = sirano;
    }

    public int getSicil() {
        return sicil;
    }

    public void setSicil(int sicil) {
        this.sicil = sicil;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public String getUnvan() {
        return unvan;
    }

    public void setUnvan(String unvan) {
        this.unvan = unvan;
    }

    public String getStatu() {
        return statu;
    }

    public void setStatu(String statu) {
        this.statu = statu;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "personel{" + "sirano=" + sirano + ", sicil=" + sicil + ", adsoyad=" + adsoyad + ", unvan=" + unvan + ", statu=" + statu + ", ano=" + ano + '}';
    }

    public personel(int sirano, int sicil, String adsoyad, String unvan, String statu, int ano) {
        this.sirano = sirano;
        this.sicil = sicil;
        this.adsoyad = adsoyad;
        this.unvan = unvan;
        this.statu = statu;
        this.ano = ano;
    }

    public personel() {
    }
  
}
