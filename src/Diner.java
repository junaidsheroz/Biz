public class Diner extends Business {
   private Integer tables; 
   
   public Diner(String id, String operation, Integer tables)
   {
       super(id, operation); 
       this.tables = tables ;
   }

   public void setTables(Integer t) {
      tables = t;
   }
   
   public Integer getTables() {
      return tables;
   }
   
   public String getDescription() {
     //TODO: call super.getDescription() to get the basic information description string from parent class
      // super.getDescription();
      // String temp = super.getDescription() + "misc=" + tables;
      // id+" "+operation+" \'"+name+"\' ["+address+"] rating="+ rating + " misc=" + misc);
      return super.getDescription() +this.getRating() +" misc=" + tables;
   }

}