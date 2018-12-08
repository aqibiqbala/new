
package qiauz;

    public class apperal extends Product {

    private String seasonName;
    private day date;
    private double seasonDiscount;
    private int seasonDiscountPercent;
    private double neww;
    private double last;
    private int totalPrice;
    
        public apperal(day date,String name ,double price,double percent,String seasonName,double seasonDiscountPercent ){
        
        super(date,name,price,percent);
        this.seasonName=seasonName;
        this.seasonDiscount=getPrice()*seasonDiscountPercent;
        System.out.println(this);
        
        
    }
    public String  getSeasonName(){
        
        return seasonName;
    }
    public void seasonDiscount(){
            
          this.seasonDiscount=super.getPrice()*seasonDiscountPercent;
          
      }
    public double getSeasonDiscount(){
        return seasonDiscount;
            
    }
    public double  overAllDiscount()
    {
        
        return super.getDiscountPrice()+getSeasonDiscount();
        
    }
    public double newprice()
    {
        return  getDiscountPrice()-getSeasonDiscount();
        
    }
    public double  newwvalue()
    {
      return super.getPrice()-overAllDiscount();
    }
  
    
    @Override
    public String toString(){
        return String.format("%s%n Season name :%s%n Season Discount :%.2f%n Overall discount is %.2f%n DISCOUNT PRICE IS :%.2f", super.toString(),getSeasonName(),getSeasonDiscount(),overAllDiscount(),newwvalue());
    }
    }