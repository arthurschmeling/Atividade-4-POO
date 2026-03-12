
package br.ulbra;

public class veiculo {
    public String Marca;
    public String Modelo;
    public int Ano;
    public double Preco;

    public void setMarca(String marca){
        this.Marca = marca;
    }

    public void setModelo(String modelo){
        this.Modelo = modelo;
    }

    public void setAno(int ano){
        this.Ano = ano;
    }

    public void setPreco(double preco){
        this.Preco = preco;
    }

    public String getMarca(){
        return Marca;
    }

    public String getModelo(){
        return Modelo;
    }

    public int getAno(){
        return Ano;
    }

    public double getPreco(){
        return Preco;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + Marca);
        System.out.println("Modelo: " + Modelo);
        System.out.println("Ano: " + Ano);
        System.out.println("Preço: " + Preco);
    }
}