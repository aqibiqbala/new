 
package qiauz;

public class book extends Product
{
    private String author;
    private day date;
    
    public  book(day date,String name ,double price,double percent,String author ){
        
           super(date,name,percent,price);
           this.author=author;
        }
    public void setAuthor(){
        this.author=author;
    }
    public String getAuthor(){
        
        return author;
        
    }
    public String toString(){
        
        return String.format("%s%n Author is :%s",super.toString(),getAuthor());
    }
}


