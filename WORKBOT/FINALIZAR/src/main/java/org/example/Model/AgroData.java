package org.example.Model;

import jakarta.persistence.*;

@Entity
public class AgroData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String Pais;
    private String Sigla;
    private String Clima_Predominante;
    @Column(name = "municipio")
    private String municipio;
    private String CodigoIbge;
    private String tiposolo;
    private String semente_ideal_solo;
    private String ph_min_solo;
    private String ph_max_solo;
    private String Desc;
    private String EspacamentoMi;
    private String EspacamentoMax;
    private String Tempo;
    private String Umidade;
    private String Despesa;
    private String Lucro;
    private String qtdProduzidaPe;
    private String Estacao;
    private String Valor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getSigla() {
        return Sigla;
    }

    public void setSigla(String sigla) {
        Sigla = sigla;
    }

    public String getClima_Predominante() {
        return Clima_Predominante;
    }

    public void setClima_Predominante(String clima_Predominante) {
        Clima_Predominante = clima_Predominante;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getCodigoIbge() {
        return CodigoIbge;
    }

    public void setCodigoIbge(String codigoIbge) {
        CodigoIbge = codigoIbge;
    }

    public String getTiposolo() {
        return tiposolo;
    }

    public void setTiposolo(String tiposolo) {
        this.tiposolo = tiposolo;
    }

    public String getSemente_ideal_solo() {
        return semente_ideal_solo;
    }

    public void setSemente_ideal_solo(String semente_ideal_solo) {
        this.semente_ideal_solo = semente_ideal_solo;
    }

    public String getPh_min_solo() {
        return ph_min_solo;
    }

    public void setPh_min_solo(String ph_min_solo) {
        this.ph_min_solo = ph_min_solo;
    }

    public String getPh_max_solo() {
        return ph_max_solo;
    }

    public void setPh_max_solo(String ph_max_solo) {
        this.ph_max_solo = ph_max_solo;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String desc) {
        Desc = desc;
    }

    public String getEspacamentoMi() {
        return EspacamentoMi;
    }

    public void setEspacamentoMi(String espacamentoMi) {
        EspacamentoMi = espacamentoMi;
    }

    public String getEspacamentoMax() {
        return EspacamentoMax;
    }

    public void setEspacamentoMax(String espacamentoMax) {
        EspacamentoMax = espacamentoMax;
    }

    public String getTempo() {
        return Tempo;
    }

    public void setTempo(String tempo) {
        Tempo = tempo;
    }

    public String getUmidade() {
        return Umidade;
    }

    public void setUmidade(String umidade) {
        Umidade = umidade;
    }

    public String getDespesa() {
        return Despesa;
    }

    public void setDespesa(String despesa) {
        Despesa = despesa;
    }

    public String getLucro() {
        return Lucro;
    }

    public void setLucro(String lucro) {
        Lucro = lucro;
    }

    public String getQtdProduzidaPe() {
        return qtdProduzidaPe;
    }

    public void setQtdProduzidaPe(String qtdProduzidaPe) {
        this.qtdProduzidaPe = qtdProduzidaPe;
    }

    public String getEstacao() {
        return Estacao;
    }

    public void setEstacao(String estacao) {
        Estacao = estacao;
    }

    public String getValor() {
        return Valor;
    }

    public void setValor(String valor) {
        Valor = valor;
    }
}
