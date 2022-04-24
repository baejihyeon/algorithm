package algorithm_programmers;

import java.util.Arrays;

//level2 전화번호목록
public class lessons_42577 {
	public static void main(String[] args) {
        boolean answer = true;       
        String[] phone_book = {"119", "97674223", "1195524421"};
        Arrays.sort(phone_book);       //정렬이 문제였다.
        for(int i=0; i<phone_book.length; i++){
            if(i == phone_book.length -1) break;
            if(phone_book[i+1].startsWith(phone_book[i])){
                answer = false;
                break;
            }
        }        
        System.out.println(answer);	
	}	
}

/*	이렇게 풀면 효율성문제 생김 . 짱남. ㅠ-ㅠ
		String[] phone_book = {"119", "97674223", "1195524421"};
		String tmp = null;
		boolean answer = true;
		for(int i =0; i<phone_book.length; i++)
		{
			tmp = phone_book[i];
			ArrayList<String> list = new ArrayList<>();
			for(int j=0; j<phone_book.length; j++) {
				if(tmp.length() < phone_book[j].length()) {
					
					list.add(phone_book[j]);
					
					for(String z : list) { 
						if(z.startsWith(tmp)) {
							answer = false;
							break;
						}
					}					
				}
			}			 
		}*/