public class BizFactory {

   public Business newBiz(String id, String operation, String name, String address, Integer r, Integer misc) {
      Business biz = null; 
      
      //TODO: Use operation field (Hotel, Diner, PetShop) to create an object
      //TODO: Load the data into the object and return it to caller
      if (operation.compareTo("PetStore")==0)  {
        // TODO: new and initialize a PetStore

        }
      
      else if (operation.compareTo("Diner")==0) {
        // TODO: new and initialize a Diner
      
      }
      
      else if (operation.compareTo("Hotel")==0) {
         // TODO: new and initialize a Hotel
      }
      return biz ; 
   }

}

