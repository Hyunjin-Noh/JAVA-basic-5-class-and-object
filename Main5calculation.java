/*p.246 실습문제11
다수의 클래스를 만들고 활용하는 연습을 해보자.
더하기(+), 빼기(-), 곱하기(*), 나누기(/)를 수행하는 각 클래스 Add, Sub, Mul, Div를 만들어라. 
이들은 모두 다음 필드와 메소드를 가진다.

-int 타입의 a, b필드 : 2개의 피연산자
-void setValue(int a, int b) : 피연산자 값을 객체 내에 저장한다.
-int calculate() : 클래스의 목적에 맞는 연산을 실행하고 결과를 리턴한다.

예시 입력 1 
두 정수와 연산자를 입력하시오>>5 7 *
예시 출력 1
35
예시 입력 2 
두 정수와 연산자를 입력하시오>>5 7 %
예시 출력 2
해당하는 연산이 없습니다.
예시 입력 3 
두 정수와 연산자를 입력하시오>>5 7 -
예시 출력 3
-2
*/

import java.util.Scanner;

public class Main5calculation {
    public static void main(String[] args) {
        System.out.print("두 정수와 연산자를 입력하시오>>");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        char ch = sc.next().charAt(0);
         
        switch(ch){
        case '+':
            Add a = new Add();
            a.setValue(x, y);
            System.out.println(a.calculate());
            break;
        case '-':
            Sub s = new Sub();
            s.setValue(x, y);
            System.out.println(s.calculate());
            break;
        case '*':
            Mul m = new Mul();
            m.setValue(x, y);
            System.out.println(m.calculate());
            break;
        case '/':
            Div d = new Div();
            d.setValue(x, y);
            System.out.println(d.calculate());
            break;
        default:
            System.out.println("해당하는 연산이 없습니다.");
            break;
        }
        sc.close();
    }
}
 
class Add{
    int a,b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    int calculate(){
        return a+b;}
}
class Sub{
    int a,b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    int calculate(){
        return a-b;}
}
class Mul{
    int a,b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    int calculate(){
        return a*b;}
}
class Div{
    int a,b;
    void setValue(int a, int b){
        this.a = a;
        this.b = b;}
    int calculate(){
        return a/b;}
}
