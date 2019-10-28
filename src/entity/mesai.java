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
public class mesai {
    private int mesaino;
    private String altigunksaat;
    private String vardiyaprim;
    private String gunlukfazlacalisma;
    private String hftsnfzlcalisma;
    private String byrmguncalisma;
    private String geneltaatilclsm;
    private String gunubirgecgunsayi;

    public int getMesaino() {
        return mesaino;
    }

    public void setMesaino(int mesaino) {
        this.mesaino = mesaino;
    }

    public String getAltigunksaat() {
        return altigunksaat;
    }

    public void setAltigunksaat(String altigunksaat) {
        this.altigunksaat = altigunksaat;
    }

    public String getVardiyaprim() {
        return vardiyaprim;
    }

    public void setVardiyaprim(String vardiyaprim) {
        this.vardiyaprim = vardiyaprim;
    }

    public String getGunlukfazlacalisma() {
        return gunlukfazlacalisma;
    }

    public void setGunlukfazlacalisma(String gunlukfazlacalisma) {
        this.gunlukfazlacalisma = gunlukfazlacalisma;
    }

    public String getHftsnfzlcalisma() {
        return hftsnfzlcalisma;
    }

    public void setHftsnfzlcalisma(String hftsnfzlcalisma) {
        this.hftsnfzlcalisma = hftsnfzlcalisma;
    }

    public String getByrmguncalisma() {
        return byrmguncalisma;
    }

    public void setByrmguncalisma(String byrmguncalisma) {
        this.byrmguncalisma = byrmguncalisma;
    }

    public String getGeneltaatilclsm() {
        return geneltaatilclsm;
    }

    public void setGeneltaatilclsm(String geneltaatilclsm) {
        this.geneltaatilclsm = geneltaatilclsm;
    }

    public String getGunubirgecgunsayi() {
        return gunubirgecgunsayi;
    }

    public void setGunubirgecgunsayi(String gunubirgecgunsayi) {
        this.gunubirgecgunsayi = gunubirgecgunsayi;
    }

    @Override
    public String toString() {
        return "mesai{" + "mesaino=" + mesaino + ", altigunksaat=" + altigunksaat + ", vardiyaprim=" + vardiyaprim + ", gunlukfazlacalisma=" + gunlukfazlacalisma + ", hftsnfzlcalisma=" + hftsnfzlcalisma + ", byrmguncalisma=" + byrmguncalisma + ", geneltaatilclsm=" + geneltaatilclsm + ", gunubirgecgunsayi=" + gunubirgecgunsayi + '}';
    }

    public mesai(int mesaino, String altigunksaat, String vardiyaprim, String gunlukfazlacalisma, String hftsnfzlcalisma, String byrmguncalisma, String geneltaatilclsm, String gunubirgecgunsayi) {
        this.mesaino = mesaino;
        this.altigunksaat = altigunksaat;
        this.vardiyaprim = vardiyaprim;
        this.gunlukfazlacalisma = gunlukfazlacalisma;
        this.hftsnfzlcalisma = hftsnfzlcalisma;
        this.byrmguncalisma = byrmguncalisma;
        this.geneltaatilclsm = geneltaatilclsm;
        this.gunubirgecgunsayi = gunubirgecgunsayi;
    }

    public mesai() {
    }
    
    
}
