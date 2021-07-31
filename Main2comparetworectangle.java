/*p.242 실습문제4
예시 입력 1 
2 2 8 7 5 5 6 6
예시 출력 1
(2,2)에서 크기가 8x7인 사각형
s의 면적은 36
t는 r을 포함합니다.
*/

import java.util.Scanner;

public class Main2comparetworectangle{
	public static void main(String[] arg) { //실행을 위한 메인 메소드
        int x, y, w, h;
        Scanner sc = new Scanner(System.in);
        Rectangle t = new Rectangle(1, 1, 10, 10);
        
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        Rectangle r = new Rectangle(x, y, w, h);
        
        x = sc.nextInt();
        y = sc.nextInt();
        w = sc.nextInt();
        h = sc.nextInt();
        Rectangle s = new Rectangle(x, y, w, h);
        //t, r, s는 레퍼런스변수
      
        r.show();//점 연산자 이용해서 멤버 메소드에 접근하여 실행
        System.out.println("s의 면적은 "+s.square());//점 연산자 이용해서 멤버 메소드에 접근하여 실행
        if(t.contains(r)) System.out.println("t는 r을 포함합니다.");
        if(t.contains(s)) System.out.println("t는 s를 포함합니다.");
        sc.close();
    }
}

class Rectangle {
    private int x, y, w, h;
    
    public Rectangle(int x, int y, int w, int h){//매개변수 받아 필드 초기화하는 생성자. 생성자도 메소드므로 중괄호 꼭 필요
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public void show(){//사각형 좌표와 넓이 한번에 출력하는 멤버 메소드
        System.out.println("("+x+","+y+")에서 크기가 "+w+"x"+h+"인 사각형");
    }
    
    public int square(){//넓이 반환 멤버 메소드
        return w*h;
    }
    
    public boolean contains(Rectangle r){//매개변수로 받은 사각형 r이 현 사각형 안에 있으면 true 리턴.
        if(this.x < r.x && this.y < r.y)
            if((this.x+this.w) > (r.x+r.w) && (this.y+this.h) > (r.y+r.h)) return true;
        return false;
    }
}
