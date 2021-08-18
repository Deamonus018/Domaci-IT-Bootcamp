package Karatisti;

import java.util.Arrays;

public class Karatisti {
    private String Ime;
    private int godine;
    private String rang;
    private String[] kata;

    public Karatisti(String ime, int godine, String rang, String[] kata) {
        Ime = ime;
        this.godine = godine;
        this.rang = rang;
        this.kata = kata;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public int getGodine() {
        return godine;
    }

    public void setGodine(int godine) {
        this.godine = godine;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }

    public String[] getKata() {
        return kata;
    }

    public void setKata(String[] kata) {
        this.kata = kata;
    }
    public String napadni(int index){
        return "Karatista: " + this.Ime + " napada sa " + Arrays.toString(this.kata) + "katom.";
    }

    public String vatreniNapad(){
        int randIdx = (int)Math.random();
        String randElem = kata[randIdx];
        return "Karatista: " + this.Ime + " napada sa " + randElem + " katom.";
    }
    public String log(){
        return "Karatista: " + this.Ime + ", " + this.godine + ", " + rang + " zna naredne kate " + Arrays.toString(this.kata) + ".";
    }
}
