
package qiauz;
public class day
{ 
private int day;
private int month;
private int  year;

public day(int day,int month,int year){
    this.day=day;
    this.month=month;
    this.year=year;
    System.out.println(this);
}

    @Override
    public String toString()
    {
    
    return String.format("%d/%d/%d",day,month,year);
       
}
}
