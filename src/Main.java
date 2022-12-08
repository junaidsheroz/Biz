import java.util.List;
import java.util.ArrayList;

public class Main {
   public static void main(String[] args) {
     BizReader source = new BizReader();  
     
      // this reads a csv file from  \Biz\classes subdir of the current project 
      //TODO: make the source.LoadCSV return an ArrayList of Business objects 
      source.LoadCSV("BusinessList.csv") ;
      
      //TODO: iterate the bizlist and call getDescription on each item in the list to print the list details
      // solution
      List<Business> bizList = source.bizList;
      for (Business biz : bizList) {;
         System.out.println(biz.getDescription());
      }
        
   }  
} 

 
 