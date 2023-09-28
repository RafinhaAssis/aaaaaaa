package com.example.WORKBOT.Model;

public class Inicio {
    private String TipoAtividade;
    private String Estado;
    private String Municipio;
    private String Pais;
    private String Cidade;
    private String TamanhoPropriedade;
    private String Nome;
    private String CPF;
    private String telefoneContato;
    private String email;

    public String getTipoAtividade() {
        return TipoAtividade;
    }

    public void setTipoAtividade(String tipoAtividade) {
        TipoAtividade = tipoAtividade;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String estado) {
        Estado = estado;
    }

    public String getMunicipio() {
        return Municipio;
    }

    public void setMunicipio(String municipio) {
        Municipio = municipio;
    }

    public String getPais() {
        return Pais;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public String getCidade() {
        return Cidade;
    }

    public void setCidade(String cidade) {
        Cidade = cidade;
    }

    public String getTamanhoPropriedade() {
        return TamanhoPropriedade;
    }

    public void setTamanhoPropriedade(String tamanhoPropriedade) {
        TamanhoPropriedade = tamanhoPropriedade;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getTelefoneContato() {
        return telefoneContato;
    }

    public void setTelefoneContato(String telefoneContato) {
        this.telefoneContato = telefoneContato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
