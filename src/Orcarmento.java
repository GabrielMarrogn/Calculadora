public class Orcarmento{
 private Profissional dadosProfissional;
 private Items items;
 int totalhoras;
 double orcarmentoFinal;
 int projetoId;

 //Metodo para mostra orçarmento
 public void PrintOrcarmento(){
    //Dados do desemvelvimento

    System.out.println();
    System.out.println("O profissional: " +dadosProfissional.getNome());
    System.out.println("Possui  " +dadosProfissional.getHorasDisponiveis() +" horas diponiveis no dia");
    System.out.println("Deseja receber R$" +dadosProfissional.getSalarioMensal() +" No mês");
    System.out.println();

    //Dados do sistema
    System.out.println("Seram necessarias " + totalhoras +" horas para comleatar o projeto");
    System.out.println("O valor total do projeto é de R$" +orcarmentoFinal);
    System.out.println();

 }

 //Setters
 public void setDadosProfissional(Profissional dadosProfissional) {
     this.dadosProfissional = dadosProfissional;
 }
public void setItems(Items items) {
    this.items = items;
}
public void setTotalhoras(int totalhoras) {
    this.totalhoras = totalhoras;
}
public void setOrcarmentoFinal(double orcarmentoFinal) {
    this.orcarmentoFinal = orcarmentoFinal;
}
public void setProjetoId(int projetoId) {
    this.projetoId = projetoId;
}

//Getters
public Profissional getDadosProfissional() {
    return dadosProfissional;
}
public Items getItems() {
    return items;
}
public int getTotalhoras() {
    return totalhoras;
}
public double getOrcarmentoFinal() {
    return orcarmentoFinal;
}
public int getProjetoId() {
    return projetoId;
}

 
//Construtor
    public Orcarmento(){
        items = new Items();
        dadosProfissional = new Profissional();
    }
    
    
}