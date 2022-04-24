package algorithm_programmers;

import java.util.ArrayList;
import java.util.Arrays;

//level2 전화번호목록
public class lessons_42577 {
	public static void main(String[] args) {
		
		String[] phone_book = {"12","123","1235","567","88"};
		String tmp = null;
		boolean answer = true;

		
		int num = 0;
		for(int i =0; i<phone_book.length; i++)
		{
			tmp = phone_book[i];	
			System.out.println(tmp);
			ArrayList<String> list = new ArrayList<>();
			for(int j=0; j<phone_book.length; j++) {
				if(tmp.length() <= phone_book[j].length()) {
					
					list.add(phone_book[j].substring(0,tmp.length()));
			}
		}
			for(int z=1 ; z<list.size(); z++) { 
				if(list.get(1) == tmp) { // list 1번의 값 가져오기. 0번말구 
					 answer = false;
				   }
			}
			System.out.println(list);
			System.out.println("하나비교 끝");
			System.out.println(answer);
	}
  }	
}

/*		String[] phone_book = {"12","123","1235","567","88"};
String tmp = null;
String next =null;
int num = 0;
boolean answer = true;

for(int i=0 ; i<phone_book.length; i++)
{
	tmp = phone_book[i];

	//0~4까지 돌면서 비교를 할것
	System.out.println("tmp : " + tmp);
	System.out.println("tmp의 length : " + tmp.length());
	System.out.println();
	
	for(int j=0; j<phone_book.length; j++) {
		if(tmp.length() <= phone_book[j].length())
			next = phone_book[j].substring(0,tmp.length());

		
	}	
	System.out.println(next);
}

}*/

//if(phone_book[i] == phone_book[i+1].substring(0,phone_book[i].length()-1)) {
//answer = false;
//}

//if(phone_book[i] == phone_book[i+1].substring(0,phone_book[i].length()-1)) {
//answer = false;