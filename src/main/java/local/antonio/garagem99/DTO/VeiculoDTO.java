package local.antonio.garagem99.DTO;

import local.antonio.garagem99.entities.Veiculos;

/**
 *
 * @author sesideva
 */
public class VeiculoDTO {
    
    private long id;
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private double KM;
    private String linkimagem;

    public VeiculoDTO() {
    }

    public VeiculoDTO(long id, String marca, String modelo, String cor, int ano, double KM, String linkimagem) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
        this.ano = ano;
        this.KM = KM;
        this.linkimagem = linkimagem;
    }

    public VeiculoDTO(Veiculos veiculo) {
        this.id = veiculo.getId();
        this.marca = veiculo.getMarca();
        this.modelo = veiculo.getModelo();
        this.cor = veiculo.getCor();
        this.ano = veiculo.getAno();
        this.KM = veiculo.getKM();
        this.linkimagem = veiculo.getLinkImagem();
    }

    public long getId() {
        return id;
    }


    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public int getAno() {
        return ano;
    }

    public double getKM() {
        return KM;
    }

    public String getlinkimagem() {
        return linkimagem;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setKM(double KM) {
        this.KM = KM;
    }

    public void setLinkimagem(String linkimagem) {
        this.linkimagem = linkimagem;
    }
}
 