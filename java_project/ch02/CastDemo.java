package ch02;
public class CastDemo {

    public static void main(String[] args){
        int i;
        double d;
        byte b;

        i = 7 /4;
        System.out.println(i);
        d= 7/4;
        System.out.println(d); //정수와 정수를 계산하면 정수가 나옴
        d = 7/(double)4;
        System.out.println(d); //정수와 실수를 계산하면 실수가 나옴
    
    
        i = 300;
        if(i<Byte.MIN_VALUE || i>Byte.MAX_VALUE)
            System.out.println("byte 타입으로 변환할 수 없습니다.");
        else
            b = (byte) i;
    
    
    }


    
}
