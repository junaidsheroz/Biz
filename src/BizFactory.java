public class BizFactory {

   public Business newBiz(String id, String operation, String name, String address, Integer r, Integer misc) {
      Business biz = null; 
      
      //TODO: Use operation field (Hotel, Diner, PetShop) to create an object
      // TODO: Load the data into the object and return it to caller
      if (operation.compareTo("PetStore")==0)  {
         // TODO: new and initialize a PetStore
         PetStore pet = new PetStore(id, operation, misc);
         pet.setNumberOfCats(misc);
         pet.setAddress(address);
         pet.setRating(r);
         pet.setName(name);
         
         biz = pet;

      }
      
      else if (operation.compareTo("Diner")==0) {
        // TODO: new and initialize a Diner
         Diner diner = new Diner(id, operation, misc);
         diner.setTables(misc);
         diner.setAddress(address);
         diner.setName(name);
         diner.setRating(r);
         biz= diner;
      
      }
      
      else if (operation.compareTo("Hotel")==0) {
         // TODO: new and initialize a Hotel
         Hotel hotel = new Hotel(id, operation, misc);
         hotel.setName(name);
         hotel.setAddress(address);
         hotel.setNumberRooms(misc);         
         hotel.setRating(r);
         
         biz = hotel;
      }
      return biz; 
   }

}

