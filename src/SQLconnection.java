import java.sql.*;
import java.util.ArrayList;



public class SQLconnection {
    
 public  void connector() {
        String database = "jdbc:mysql://localhost/appCalculadora";
    
        try {
    
            //Class.forName("com.mysql..jdbc.Driver");
        
            Connection conexaoMySQL = DriverManager.getConnection(database, "root", "adimn");        
         
            Statement consulta = conexaoMySQL.createStatement();
    
            ResultSet resultado =  consulta.executeQuery("select * from orcarmento");
    
            ArrayList<Orcarmento> finalOrcarmentos = new ArrayList<Orcarmento>();
    
    
            while(resultado.next()){
                Orcarmento orcarmento = new Orcarmento(); 

                orcarmento.projetoId = resultado.getInt("idorcarmento");
                orcarmento.totalhoras = resultado.getInt("totalHoras");
                orcarmento.orcarmentoFinal = resultado.getDouble("orcarmentototal");   
                
                finalOrcarmentos.add(orcarmento);
            
            }
    
            conexaoMySQL.close();

            System.out.println("Dados adicionados a tabela");
    
        } catch(Exception e) {
            System.out.println(e);
    
        }
}
}

