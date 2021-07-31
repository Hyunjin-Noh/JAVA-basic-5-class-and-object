import java.util.Scanner;
public class Main4dictionarytotal{
  public static void main(String [] arg) {
	  DicApp dicapp = new DicApp();
	  dicapp.run();
  }
}
class Dictionary {
  private static String [] kor = {"사랑", "아기", "돈", "미래", "희망"};
  private static String [] eng = {"love", "baby", "money", "future", "hope"};
  public static String kor2Eng(String word) {
	  for(int i=0;i<kor.length;i++){
		  if(word.equals(kor[i])) {
	            if(i%2==0) 
	               System.out.print(word+"은 ");
	            else
	               System.out.print(word+"는 ");
	            return eng[i];}}
	  return null;
  }
}
class DicApp{
	DicApp() { }
	void run() {
		System.out.println("한영 단어 검색 프로그램입니다.");
		Scanner sc = new Scanner(System.in);
		while(true) {
		       System.out.print("한글 단어?");
		       String koreaninput = sc.next();
		       
		       if(koreaninput.equals("그만")) break;
		       
		       String engresult = Dictionary.kor2Eng(koreaninput);
		       if(engresult == null) System.out.println(koreaninput+"는 저의 사전에 없습니다.");
		       else 
		          System.out.println(engresult);
		}
		sc.close();
    }
}