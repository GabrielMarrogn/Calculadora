import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Profissional profissional = new Profissional();
        Items items = new Items();
        Orcarmento orcarmento = new Orcarmento();
        SQLconnection sqLconnection = new SQLconnection();
       
        int calculo = 0;
        
       
        //Inseir os dados 
        System.out.println("Insira seu nome:");
        String nome = sc.nextLine();
        System.out.println("Insira seu salario desejado:");
        double salario = sc.nextDouble();
        System.out.println("Insira a quantidade de horas dispovives você tem no dia:");
        int horas = sc.nextInt();
        System.out.println();

        System.out.println("Crie um id para o projeto:");
        int id = sc.nextInt();
        System.out.println();

        System.out.println("Insira quantos items deseja adicionar:");
        int objetos = sc.nextInt();
        System.out.println();

        //Intruções para adicionar objetos 
        System.out.println("A ou a para adicionar Telas com entradas e saídas de dados");
        System.out.println("B ou b para adicionar Telas de consultascom informação de dados");
        System.out.println("C ou c para adicionar Gravação de dados");
        System.out.println();

        
          
        //Loop pra adicionar objetos
        for(int i = 1; i <= objetos; i++){
         System.out.println("Insira o nome do item:");
         String itemname = sc.next();
         System.out.println("Insira o tipo do item");
         String itemType = sc.next();
         System.out.println("Insira a complexidade");
         int itemcomplexidade = sc.nextInt();

         items.setNomeItem(itemname);
         items.setTipoItem(itemType);
         items.setComplexidade(itemcomplexidade);
        
         calculo = calculo + items.CalcularQuantidadesHoras();
        
         System.out.println("Horas totais: " +calculo);
        }
        //fim do loop
        
        //Atribuindo valor ao objetos
        profissional.setNome(nome);
        profissional.setSalarioMensal(salario);
        profissional.setHorasDisponiveis(horas);
        profissional.CalculaValorHora();

        //Calculando o valor total do projeto mais os 30%
        double valordasHoras = (profissional.CalculaValorHora() * calculo);
        double valorSistema = valordasHoras + (valordasHoras * 0.3);

        orcarmento.setDadosProfissional(profissional);
        orcarmento.setItems(items);
        orcarmento.setTotalhoras(calculo);
        orcarmento.setOrcarmentoFinal(valorSistema);
        orcarmento.setProjetoId(id);
        


        //Metodo usado pra mostra todas a imformações
        orcarmento.PrintOrcarmento();

        //Metodo pra conectar com o banco de dados
        sqLconnection.connector();

        sc.close();
    }
}
