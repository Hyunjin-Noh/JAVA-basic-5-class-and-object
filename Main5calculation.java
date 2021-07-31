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