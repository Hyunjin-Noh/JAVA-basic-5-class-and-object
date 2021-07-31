/*p.245 실습문제8
이름(name), 전화번호(tel) 필드와 생성자 등을 가진 Phone클래스를 작성하고, 
실행 예시와 같이 작동하는 PhoneBook클래스를 작성하라.
예시 입력 1 
인원수>>-2
인원수>>0
인원수>>3
이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>황기태 777-7777
이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>나명품 999-9999
이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>최자바 333-1234
검색할 이름>>황기순
검색할 이름>>최자바
검색할 이름>>그만
예시 출력 1
저장되었습니다...
황기순 이 없습니다.
최자바의 번호는 333-1234 입니다.
*/


import java.util.Scanner;

public class Main3phonebooktotal{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    //PhoneBook 클래스의 PhoneBook()타입=즉 생성자 객체를 생성하는데, 그걸 가리키는 레퍼런스 변수가 phonebook이다.
    phonebook.run(); //그 레퍼런스 변수가 그 클래스의 멤버 메소드 run()에 접근한다.
  }
}
class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) { //매개변수를 가지는 생성자. 생성자도 메소드임!
        this.name = name;
        this.tel = tel;
    }
	public String getName() {return name;}//name 필드 반환하는 멤버 메소드
	public String getTel() {return tel;}//tel 필드 반환하는 멤버 메소드
}
class PhoneBook {
	private int num;
	private Phone phones[];
	PhoneBook() { }
	void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("인원수>>"); 
		    try{
		    	this.num = scanner.nextInt();
			    this.phones = new Phone[num]; 
			    }catch (NegativeArraySizeException e) {System.out.print("");}
			//num행짜리 Phone클래스의 객체 배열 칸의 생성.
		    if(num>0) {
		    	for (int i=0;i<num;i++) {
					System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
					String name = scanner.next();
					String tel = scanner.next();
					phones[i]=new Phone(name, tel);}
				//초기화 끝남.
				System.out.println("저장되었습니다...");
				
				int i;
				for( ; ; ) {
					System.out.print("검색할 이름>>");
					String nameinput= scanner.next();
					if (nameinput.equals("그만")) break;
					for(i=0;i<num;i++) {
						if (nameinput.equals(phones[i].getName())) {
							System.out.println(nameinput+"의 번호는 "+phones[i].getTel()+" 입니다.");
							break;}}
					if(i==num) System.out.println(nameinput+" 이  없습니다.");}
			scanner.close();
			break;
	        }
	   }
	}
}
