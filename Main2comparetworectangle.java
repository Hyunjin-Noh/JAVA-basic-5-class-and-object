import java.util.Scanner;

public class Main2comparetworectangle{
	public static void main(String[] arg) { //������ ���� ���� �޼ҵ�
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
        //t, r, s�� ���۷�������
      
        r.show();//�� ������ �̿��ؼ� ��� �޼ҵ忡 �����Ͽ� ����
        System.out.println("s�� ������ "+s.square());//�� ������ �̿��ؼ� ��� �޼ҵ忡 �����Ͽ� ����
        if(t.contains(r)) System.out.println("t�� r�� �����մϴ�.");
        if(t.contains(s)) System.out.println("t�� s�� �����մϴ�.");
        sc.close();
    }
}

class Rectangle {
    private int x, y, w, h;
    
    public Rectangle(int x, int y, int w, int h){//�Ű����� �޾� �ʵ� �ʱ�ȭ�ϴ� ������. �����ڵ� �޼ҵ�Ƿ� �߰�ȣ �� �ʿ�
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
    }
    public void show(){//�簢�� ��ǥ�� ���� �ѹ��� ����ϴ� ��� �޼ҵ�
        System.out.println("("+x+","+y+")���� ũ�Ⱑ "+w+"x"+h+"�� �簢��");
    }
    
    public int square(){//���� ��ȯ ��� �޼ҵ�
        return w*h;
    }
    
    public boolean contains(Rectangle r){//�Ű������� ���� �簢�� r�� �� �簢�� �ȿ� ������ true ����.
        if(this.x < r.x && this.y < r.y)
            if((this.x+this.w) > (r.x+r.w) && (this.y+this.h) > (r.y+r.h)) return true;
        return false;
    }
}
