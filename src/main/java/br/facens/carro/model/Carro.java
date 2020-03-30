package br.facens.carro.model;

/**
 * Carro
 */
public class Carro {
    private int id;
    private String marca;
    private String modelo;
    private int ano;
    private double valor;
    private String thumb;
    private String foto;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public Carro(int id, String marca, String modelo, int ano, double valor, String foto, String thumb) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.valor = valor;
        this.foto = foto;
        this.thumb = thumb;
    }

    @Override
    public String toString() {
        return "Carro [ano=" + ano + ", foto=" + foto + ", thumb=" + thumb + ", id=" + id + ", marca=" + marca + ", modelo=" + modelo
                + ", valor=" + valor + "]";
    }
    
}