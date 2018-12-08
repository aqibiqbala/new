
    package qiauz;
    public class Product  {
 //VARIABLES ARE <
    private String  name;
    public double price;
    private day date;
    private double discountPrice;
    
    
    public Product (day date ,String name ,double price,double percent ){
        
        this.date=date;
        this.name=name;
        this.price=price;
        discountPrice=price*percent;
    }
   
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        
        return name;
    }
    public void setPrice(double price )
    {
        this.price=price;
        
    }    
    public double getPrice(){
        
        return price;
    }
    public void setDate(day date){
        this.date=date;
        
    }
    public void setDiscountedPrice(double percent){
        
           discountPrice=price*percent;
           
        
    }
    public double  getDiscountPrice(){
        return  discountPrice;
    }
    public day getdate(){
        
        return date;
         }
    @Override
    public String toString (){
        
        return String.format(" %s%n Name is : %s%n Price is %.2f %n Discount :%.2f ",date,name,price,getDiscountPrice());
        
    }
    
}





    
