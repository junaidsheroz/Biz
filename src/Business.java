public abstract class Business {  // public abstract class Business
   private String operation;
   private String id; 
   private String name;
   private String address;
   private int rating; 
   
   public Business(String id, String operation) {
       this.id = id; 
       this.operation = operation; 
   }
   
   public String getOperation() {
      return operation;
   }
    
   public String getId() {
      return id;
   }  
   
   public void setName(String busName) { 
      name = busName; 
   }
   
   public void setAddress(String busAddress) {
      address = busAddress; 
   }
   
   public String getDescription() {
      String temp = id+" "+operation+" \'"+name+"\' [" +address+ "] rating="+rating; 
      return temp; 
   }

   public void setRating(int r) {
      rating = r;
   }
   
   public int getRating() {
      return rating;
   }
}