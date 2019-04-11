package br.com.digitalhouse;

public class  Aviao implements Voador{
    private String tipoDeAsa;
    private int qtdeAssentos;

    public Aviao(int quantidadeDeAssentos, String tipoAsa){
        qtdeAssentos = quantidadeDeAssentos;
        tipoDeAsa = tipoAsa;
    }

    public int getQtdeAssentos (){
        return qtdeAssentos;

            }
    public void setQtdeAssentos(int qtd){
        qtdeAssentos = qtd;
    }
    public String getTipoDeAsa(){
        return tipoDeAsa;
    }
    public void setTipoDeAsa (String tipoAsa){
        tipoDeAsa = tipoAsa;
    }

    @Override
    public void voar() {
        System.out.println("Voando como avião...");
    }
}
