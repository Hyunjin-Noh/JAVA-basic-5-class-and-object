class TV {
    private String brand;
    private int year;
    private int inch;
    
    public TV(String b, int y, int i) { //매개변수를 가지는 생성자. 생성자도 메소드임!
        brand = b;
        year = y;
        inch = i;
    }
    
    public void show(){
        System.out.println(brand+"에서 만든 "+year+"년형 "+inch+"인치 TV");
    }
}

public class Main1tvclass
{
	public static void main(String[] args) {
		TV myTV = new TV("LG", 2017, 32);//클래스  TV의 객체에 대하여 레퍼런스 변수  myTV 선언, 새로운 TV 타입의 객체를 생성. 
		                                 //클래스 TV에서 정의된 생성자에 의해 생성.
		myTV.show(); //show() 메소드 실행
	}
}