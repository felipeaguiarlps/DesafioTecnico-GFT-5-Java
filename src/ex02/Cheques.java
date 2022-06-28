package ex02;

public class Cheques implements IRecebivel{
    private int prazo;

    public int getPrazo() {
        return prazo;
    }

    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

    @Override
    public void calcularValorRecebido(double valor) {
        if(this.prazo == 30){
            valor = valor - (valor * 0.05);
        } else if (this.prazo == 60) {
            valor = valor - (valor * 0.075);
        } else if (this.prazo == 90) {
            valor = valor - (valor * 0.1);
        } else if (prazo > 90) {
            valor = valor - (valor * 0.1) + (3*0.03);
        }
        System.out.println("O valor a ser recebido é de: " +valor);
    }
}
