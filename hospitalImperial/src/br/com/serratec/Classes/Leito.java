package br.com.serratec.Classes;

public class Leito {

    private int idLeito;
    private String status;
    private int idAla;

    public Leito() {
    }

    public Leito(String status, int idAla) {
        this.status = status;
        this.idAla = idAla;
    }

    public int getIdLeito() {
        return idLeito;
    }

    public void setIdLeito(int idLeito) {
        this.idLeito = idLeito;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdAla() {
        return idAla;
    }

    public void setIdAla(int idAla) {
        this.idAla = idAla;
    }

    @Override
    public String toString() {
        return "Leito [idLeito=" + idLeito + ", status=" + status + ", idAla=" + idAla + "]";
    }

}
