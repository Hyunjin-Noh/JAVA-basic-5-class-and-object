class TV {
    private String brand;
    private int year;
    private int inch;
    
    public TV(String b, int y, int i) { //�Ű������� ������ ������. �����ڵ� �޼ҵ���!
        brand = b;
        year = y;
        inch = i;
    }
    
    public void show(){
        System.out.println(brand+"���� ���� "+year+"���� "+inch+"��ġ TV");
    }
}

public class Main1tvclass
{
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);//Ŭ����  TV�� ��ü�� ���Ͽ� ���۷��� ����  myTV ����, ���ο� TV Ÿ���� ��ü�� ����. 
		                                 //Ŭ���� TV���� ���ǵ� �����ڿ� ���� ����.
		myTV.show(); //show() �޼ҵ� ����
	}
}