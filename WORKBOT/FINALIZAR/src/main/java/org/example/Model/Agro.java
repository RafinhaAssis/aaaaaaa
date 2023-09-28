package org.example.Model;

public class Agro {
    private String semente_ideal_solo;
    private String Desc;
    private String Clima_Predominante;

    private String qtd_Plantas_Hectar;

    private String Tempo;

    private String Despesas;

    private String Lucro;


    public String getLucro() {
        return Lucro;
    }

    public void setLucro(String lucro) {
        Lucro = lucro;
    }

    public String getDespesas() {
        return Despesas;
    }

    public void setDespesas(String despesas) {
        Despesas = despesas;
    }

    public String getQtd_Plantas_Hectar() {
        return qtd_Plantas_Hectar;
    }

    public void setQtd_Plantas_Hectar(String qtd_Plantas_Hectar) {
        this.qtd_Plantas_Hectar = qtd_Plantas_Hectar;
    }

    public String getSemente_ideal_solo() {
        return semente_ideal_solo;
    }

    public void setSemente_ideal_solo(String semente_ideal_solo) {
        this.semente_ideal_solo = semente_ideal_solo;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }
    public void setTempo(String temp) {
        Tempo = temp;
    }
    public String getClima_Predominante() {
        return Clima_Predominante;
    }

    public String getTempo() {
        return Tempo;
    }

    public void setClima_Predominante(String clima_Predominante) {
        Clima_Predominante = clima_Predominante;
    }
}
