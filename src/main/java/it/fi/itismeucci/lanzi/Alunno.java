package it.fi.itismeucci.lanzi;

import java.util.Date;

public class Alunno {
    public String nome;
    public String cognome;
    public Date nascita;

    public Alunno() {

    }

    public Alunno(String nome, String cognome, Date nascita) {
        this.nome = nome;
        this.cognome = cognome;
        this.nascita = nascita;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return this.cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public Date getNascita() {
        return this.nascita;
    }

    public void setNascita(Date nascita) {
        this.nascita = nascita;
    }

}
