public class Items {
   private String nomeItem;
   private String tipoItem;
   private int complexidade = 1;

   //Começo do metodo
   int  CalcularQuantidadesHoras(){
    int qtdHoras = 0;
    if (tipoItem.equals("A") || tipoItem.equals("a")){
        // A = Telas com entradas e saídas de dados
        if (complexidade == 1){
            qtdHoras = 8;
        }
        else if(complexidade == 2){
            qtdHoras = 12;
        }
        else if(complexidade == 3){
            qtdHoras = 3;
        }
        else {
            qtdHoras = 0;
        }
    }
    else if (tipoItem.equals("B") || tipoItem.equals("b")){
        // B = Telas de consultascom informação de dados
        if (complexidade == 1){
            qtdHoras = 4;
        }
        else if(complexidade == 2){
            qtdHoras = 6;
        }
        else if(complexidade == 3){
            qtdHoras = 8;
        }
        else {
            qtdHoras = 0;
        }
    }
    else if (tipoItem.equals("C") || tipoItem.equals("c")){
        // C = Gravação de dados
        if (complexidade == 1){
            qtdHoras = 16;
        }
        else if(complexidade == 2){
            qtdHoras = 24;
        }
        else if(complexidade == 3){
            qtdHoras = 36;
        }
        else {
            qtdHoras = 0;
        }
    }
    else {
        System.out.println("Erro dados invalidos");
    }

    return qtdHoras;
   }
 //Fim do metodo


 //Setters
 public void setComplexidade(int complexidade) {
     this.complexidade = complexidade;
 }
 public void setNomeItem(String nomeItem) {
     this.nomeItem = nomeItem;
 }
 public void setTipoItem(String tipoItem) {
     this.tipoItem = tipoItem;
 }

 //Getters
 public int getComplexidade() {
     return complexidade;
 }
 public String getNomeItem() {
     return nomeItem;
 }
 public String getTipoItem() {
     return tipoItem;
 }

}
