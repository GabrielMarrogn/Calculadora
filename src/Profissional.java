public class Profissional {
    private String nome;
    private double salarioMensal;
    private double horasDisponiveis;

 

    public double CalculaValorHora() {
        double valorHora= salarioMensal /(20 * horasDisponiveis);
        return valorHora;
    } 

    //Setters
    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setSalarioMensal(double salarioMensal) {
        this.salarioMensal = salarioMensal;
    }
    public void setHorasDisponiveis(double horasDisponiveis) {
        this.horasDisponiveis = horasDisponiveis;
    }

    //Getters
    public String getNome() {
        return nome;
    }
    public double getHorasDisponiveis() {
        return horasDisponiveis;
    }
    public double getSalarioMensal() {
        return salarioMensal;
    }
}
