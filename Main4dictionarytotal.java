/*p.246 실습문제10
다음과 같은 Dictionary클래스가 있다. 
실행 결과와 같이 작동하도록 Dictionary클래스의 kor2Eng() 메소드와 DicApp클래스를 작성하라.
예시 입력 1 
한글 단어?희망
한글 단어?아가
한글 단어?아기
한글 단어?그만
예시 출력 1
희망은 hope
아가는 저의 사전에 없습니다.
아기는 baby
*/

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
