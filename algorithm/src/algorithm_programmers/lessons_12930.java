package algorithm_programmers;

public class lessons_12930 {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		String s = "AAAAA  aaaaa ";
		String[] answer = s.split(" ",-1); //split 음수 확인하기
		String result; 
		String a;
		char str;
		
		for (int i = 0; i < answer.length; i++) {
			result = answer[i]; // result값은 String 이다.
			for (int j = 0; j < result.length(); j++) {  //String형은 인덱스로 접근 X
				if(j%2 == 0) {
					
					str = result.charAt(j);
					a =String.valueOf(str);					
					sb.append(a.toUpperCase());
					
				}else if(j%2==1) {
					
					str = result.charAt(j);
					a =String.valueOf(str);
					sb.append(a.toLowerCase());
					
				}
			}
			if(i < answer.length-1)
				{
				sb.append(" ");
				}
			System.out.println(sb.toString());
		}
		
	}
}
