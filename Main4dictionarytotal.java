import java.util.Scanner;
public class Main4dictionarytotal{
  public static void main(String [] arg) {
	  DicApp dicapp = new DicApp();
	  dicapp.run();
  }
}
class Dictionary {
  private static String [] kor = {"���", "�Ʊ�", "��", "�̷�", "���"};
  private static String [] eng = {"love", "baby", "money", "future", "hope"};
  public static String kor2Eng(String word) {
	  for(int i=0;i<kor.length;i++){
		  if(word.equals(kor[i])) {
	            if(i%2==0) 
	               System.out.print(word+"�� ");
	            else
	               System.out.print(word+"�� ");
	            return eng[i];}}
	  return null;
  }
}
class DicApp{
	DicApp() { }
	void run() {
		System.out.println("�ѿ� �ܾ� �˻� ���α׷��Դϴ�.");
		Scanner sc = new Scanner(System.in);
		while(true) {
		       System.out.print("�ѱ� �ܾ�?");
		       String koreaninput = sc.next();
		       
		       if(koreaninput.equals("�׸�")) break;
		       
		       String engresult = Dictionary.kor2Eng(koreaninput);
		       if(engresult == null) System.out.println(koreaninput+"�� ���� ������ �����ϴ�.");
		       else 
		          System.out.println(engresult);
		}
		sc.close();
    }
}