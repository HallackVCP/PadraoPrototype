package org.example;

public class Motorista implements Cloneable{

    private String nome;

    private String cnh;

    private Veiculo veiculo;

    public Motorista(String nome, String cnh, Veiculo veiculo) {
        this.nome = nome;
        this.cnh = cnh;
        this.veiculo = veiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    @Override
    public Motorista clone() throws CloneNotSupportedException {
        Motorista motoristaClone = (Motorista) super.clone();
        motoristaClone.veiculo = (Veiculo) motoristaClone.veiculo.clone();
        return motoristaClone;
    }

    @Override
    public String toString() {
        return "Motorista{" +
                "CNH=" + cnh +
                ", nome='" + nome + '\'' +
                ", veiculo=" + veiculo.toString() +
                '}';
    }
}
