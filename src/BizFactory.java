public class BizFactory {

   public Business newBiz(String id, String operation, String name, String address, Integer r, Integer misc) {
      Business biz = null; 
      
      //TODO: Use operation field (Hotel, Diner, PetShop) to create an object
      // TODO: Load the data into the object and return it to caller
      if (operation.compareTo("PetStore")==0)  {
         // TODO: new and initialize a PetStore
         PetStore ps = new PetStore(id, operation, misc);
         ps.setNumberOfCats(misc);
         biz = ps;

      }
      
      else if (operation.compareTo("Diner")==0) {
        // TODO: new and initialize a Diner
         Diner d = new Diner(id, operation, misc);
         d.setTables(misc);
         biz= d;
      
      }
      
      else if (operation.compareTo("Hotel")==0) {
         // TODO: new and initialize a Hotel
         Hotel h = new Hotel(id, operation, misc);
         h.setNumberRooms(misc);
         biz = h;
      }
      return biz; 
   }

}

