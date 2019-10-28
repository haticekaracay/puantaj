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
public class admn {
    private int ano;
    private String akullaniciadi;
    private String asifre;

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAkullaniciadi() {
        return akullaniciadi;
    }

    public void setAkullaniciadi(String akullaniciadi) {
        this.akullaniciadi = akullaniciadi;
    }

    public String getAsifre() {
        return asifre;
    }

    public void setAsifre(String asifre) {
        this.asifre = asifre;
    }

    @Override
    public String toString() {
        return "admn{" + "ano=" + ano + ", akullaniciadi=" + akullaniciadi + ", asifre=" + asifre + '}';
    }

    public admn(int ano, String akullaniciadi, String asifre) {
        this.ano = ano;
        this.akullaniciadi = akullaniciadi;
        this.asifre = asifre;
    }

    public admn() {
    }
    
    
}
