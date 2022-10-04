package ch02;
public class CharBoolDemo {
    public static void main(String[] args){
        char ga1= '가';
        char ga2='\uac00';  //유니코드 

        boolean cham = true;
        boolean geojit = false;


        System.out.println(ga1);
        System.out.println((int)ga1); //문자 '가'의 정숫값 출력
        System.out.println(ga2);
        System.out.println(++ga2);//문자 '가'의 다음값 출력
        System.out.println(cham +"가 아니면"+geojit+"입니다.");
    }
}
