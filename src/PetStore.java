public class PetStore extends Business {
    private Integer NumberOfCats;
    
    public PetStore(String id, String operation, Integer NumberOfCats)
    {
        super(id, operation); 
        this.NumberOfCats = NumberOfCats; 
    }
    
    public void setNumberOfCats(int m) {
       NumberOfCats = m;
    }
    
    public Integer getNumberOfCats() {
       return NumberOfCats;
    }
    
     public String getDescription() {
        super.getDescription();
        String temp =  "NumberOfCats=" + NumberOfCats;
        return temp;
    }
}

