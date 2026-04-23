package br.com.serratec.Classes;

import br.com.serratec.Enums.TipoLab;

public class Laboratorio {
    private Integer idLaboratorio;
    private String nome;
    private TipoLab tipo;

    public Laboratorio(Integer idLaboratorio, String nome, TipoLab tipo) {
        this.idLaboratorio = idLaboratorio;
        this.nome = nome;
        this.tipo = tipo;
    }
    
    @Override
    public String toString() {
        return "ID Laboratório: " + idLaboratorio + ", Nome: " + nome + ", Tipo: " + tipo;
    }

    public Integer getId_laboratorio() {
        return idLaboratorio;
    }

    public String getNome() {
        return nome;
    }

    public TipoLab getTipo() {
        return tipo;
    }
    
}