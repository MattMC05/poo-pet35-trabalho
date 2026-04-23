package Classes;

public class Laboratorio {
    private Interger id_laboratorio;
    private String nome;
    private TipoLab tipo;
    public Laboratorio(Interger id_laboratorio, String nome, TipoLab tipo) {
        this.id_laboratorio = id_laboratorio;
        this.nome = nome;
        this.tipo = tipo;
    }
    public Interger getId_laboratorio() {
        return id_laboratorio;
    }
    public String getNome() {
        return nome;
    }
    public TipoLab getTipo() {
        return tipo;
    }
    @Override
    public String toString() {
        return "Laboratorio [id_laboratorio=" + id_laboratorio + ", nome=" + nome + ", tipo=" + tipo + "]";
    }

    
}