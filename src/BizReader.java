import java.util.List;
import java.util.ArrayList; 
import java.io.BufferedReader;  
import java.io.FileReader;  
import java.io.IOException; 

public class BizReader {

      String line = "";  
      Integer lineCount=0;
      //TODO: create (new) a ArrayList to hold the business objects
      List<Business> bizList = new ArrayList<Business>();

      //TODO: create (new) a BizFactory to supply correct type of objects 
      BizFactory bizFactory = new BizFactory();
      
      public void LoadCSV(String fileName) {
         try {  
            BufferedReader br = new BufferedReader(new FileReader(fileName));  
            while ((line = br.readLine()) != null)   {  
               String[] tokens = line.split(","); 
               if (lineCount == 0) {
                   // this is the CSV header line, its not used  by the program 
                   //System.out.println( "HEADER: "+line );  
               }
               else {    
                  String id         = tokens[0] ;
                  String operation  = tokens[1] ;
                  String name       = tokens[2] ;
                  String address    = tokens[3] ;
                  String result     = tokens[4].replaceAll("\\s", ""); // conversion to int wont tolerate spaces
                  Integer rating    = Integer.parseInt(result);
                  Integer misc      = 0;
                  if (tokens.length > 5) {
                      String temp = tokens[5].replaceAll("\\s", ""); // conversion to int wont tolerate spaces
                      misc = Integer.parseInt(temp);
                  }
                      
                  //TODO: Use the values from the tokens array to call the BizFactory 
                  Business biz = bizFactory.newBiz(id, operation, name, address, rating, misc);
                  //TODO: The BizFactory is responsible for creation and initialization of the objects
                  //TODO: The BizFacotry must create an object of the correct type: Diner, Hotel or PetStore and return it
                  //TODO: you must eliminate below println, this printing must be moved to main.java and use the getDescription method 
                  System.out.println(id+" "+operation+" \'"+name+"\' ["+address+"] rating="+ rating + " misc=" + misc); 
                  //TODO: add the current Business object to the ArrayList here, then eliminate the above println
                  bizList.add(biz);   
               }
               lineCount++; 
            }  
            br.close();
         }   
         catch (IOException e) {  
            e.printStackTrace();  
         }
         //TODO: return the ArrayList of business objects to the caller here ;

         return;
     }
}

