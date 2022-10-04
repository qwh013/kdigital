package ch02;
public class VarDemo {
    //var a=1 var은 메서드 내부에서만 사용할 수 있다
    public static void main(String[] args){
        int var =1; //var은 변수이름으로 사용가능
        var x =1;

        //var x =1, y=3, z=4; var은 한번에 여러개의 변수를 초기화 할 수 없다
        //var str =null; var 변수에는 널값 대입 불가능
        //var oops; var 변수를 바로 초기화하지 않으면 타입 추론 불가능(선언과 동시에 값을 대입해야함)
        //oops = 1;

        
    }
    //void test(var x){} 변수 x의 타입을 추론할 수 없다
}
