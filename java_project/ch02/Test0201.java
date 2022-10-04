package ch02;
public class Test0201 {

    public static void main(String[] args){
       int beverage1=100;
       int beverage2=200;
       
        
       System.out.println("1부터 10의 합 : "+sum(10));
       System.out.println("음료값의 총합 : "+((beverage1*2)+(beverage2*5)));
       

    }
    public static int sum(int n) {
        if (n <= 1)			
            return n;		
        else
            return sum(n-1) + n;	
    }

}

