public class Hotel extends Business {
   private Integer rooms;
   
   public Hotel(String id, String operation, Integer rooms)
   {
       super(id, operation); 
       this.rooms = rooms; 
   }
   
   public void setNumberRooms(int r) {
      rooms = r;
   }
   
   public Integer getNumberRooms() {
      return rooms;
   }
   
    public String getDescription() {
      //TODO: call super.getDescription() to get the basic information description string from parent class
      return super.getDescription();

      
      
   }

}