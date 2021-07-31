import java.util.Scanner;

public class Main3phonebooktotal{
  public static void main(String [] arg) {
    PhoneBook phonebook = new PhoneBook();
    //PhoneBook Ŭ������ PhoneBook()Ÿ��=�� ������ ��ü�� �����ϴµ�, �װ� ����Ű�� ���۷��� ������ phonebook�̴�.
    phonebook.run(); //�� ���۷��� ������ �� Ŭ������ ��� �޼ҵ� run()�� �����Ѵ�.
  }
}
class Phone {
	private String name;
	private String tel;
	public Phone(String name, String tel) { //�Ű������� ������ ������. �����ڵ� �޼ҵ���!
        this.name = name;
        this.tel = tel;
    }
	public String getName() {return name;}//name �ʵ� ��ȯ�ϴ� ��� �޼ҵ�
	public String getTel() {return tel;}//tel �ʵ� ��ȯ�ϴ� ��� �޼ҵ�
}
class PhoneBook {
	private int num;
	private Phone phones[];
	PhoneBook() { }
	void run() {
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("�ο���>>"); 
		    try{
		    	this.num = scanner.nextInt();
			    this.phones = new Phone[num]; 
			    }catch (NegativeArraySizeException e) {System.out.print("");}
			//num��¥�� PhoneŬ������ ��ü �迭 ĭ�� ����.
		    if(num>0) {
		    	for (int i=0;i<num;i++) {
					System.out.print("�̸��� ��ȭ��ȣ(�̸��� ��ȣ�� �� ĭ���� �Է�)>>");
					String name = scanner.next();
					String tel = scanner.next();
					phones[i]=new Phone(name, tel);}
				//�ʱ�ȭ ����.
				System.out.println("����Ǿ����ϴ�...");
				
				int i;
				for( ; ; ) {
					System.out.print("�˻��� �̸�>>");
					String nameinput= scanner.next();
					if (nameinput.equals("�׸�")) break;
					for(i=0;i<num;i++) {
						if (nameinput.equals(phones[i].getName())) {
							System.out.println(nameinput+"�� ��ȣ�� "+phones[i].getTel()+" �Դϴ�.");
							break;}}
					if(i==num) System.out.println(nameinput+" ��  �����ϴ�.");}
			scanner.close();
			break;
	        }
	   }
	}
}