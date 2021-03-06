package ex03;

public class Trabalhador {
    private String nome;
    private double salarioPorHora;
    private int horasTrabalhadas;
    private double salarioTotal;

    public Trabalhador(String nome, double salarioPorHora, int horasTrabalhadas) {
        this.nome = nome;
        this.salarioPorHora = salarioPorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public double getSalarioTotal(){
        double salarioTotal = this.getHorasTrabalhadas() * this.getSalarioPorHora();
        System.out.println("O salário total de: " +this.getNome() + " é: " +this.salarioTotal);

        return salarioTotal;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setSalarioTotal(double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }
}
