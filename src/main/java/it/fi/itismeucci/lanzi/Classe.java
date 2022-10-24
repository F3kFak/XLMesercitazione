package it.fi.itismeucci.lanzi;

import java.util.ArrayList;

public class Classe {
    public int numero;
    public String sezione;
    public String aula;
    public ArrayList<Alunno> listaAlunni;


    public Classe() {
    }

    public Classe(int numero, String sezione, String aula, ArrayList<Alunno> listaAlunni) {
        this.numero = numero;
        this.sezione = sezione;
        this.aula = aula;
        this.listaAlunni = listaAlunni;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSezione() {
        return this.sezione;
    }

    public void setSezione(String sezione) {
        this.sezione = sezione;
    }

    public String getAula() {
        return this.aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }

    public ArrayList<Alunno> getListaAlunni() {
        return this.listaAlunni;
    }

    public void setListaAlunni(ArrayList<Alunno> listaAlunni) {
        this.listaAlunni = listaAlunni;
    }

    public Classe numero(int numero) {
        setNumero(numero);
        return this;
    }

    public Classe sezione(String sezione) {
        setSezione(sezione);
        return this;
    }

    public Classe aula(String aula) {
        setAula(aula);
        return this;
    }

    public Classe listaAlunni(ArrayList<Alunno> listaAlunni) {
        setListaAlunni(listaAlunni);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " numero='" + getNumero() + "'" +
            ", sezione='" + getSezione() + "'" +
            ", aula='" + getAula() + "'" +
            ", listaAlunni='" + getListaAlunni() + "'" +
            "}";
    }

}
