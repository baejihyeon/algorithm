package algorithm_programmers;

public class Test {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();  //스트링빌더 
		int answer=0;
        char result =0;
        String s  = "AB";
        int n = 1;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) >= 'a' && s.charAt(i) <='z')
            {
                answer = (s.charAt(i)+ n -'a')%26;
                result = (char) (answer + 'a'); 
                sb.append(result);
            }else if(s.charAt(i) >= 'A' && s.charAt(i) <='Z'){
                answer = (s.charAt(i)+ n -'A')%26; //계산을 생각해내는게 문제.
                result = (char) (answer + 'A');
                sb.append(result);
            }else if(s.charAt(i) == ' ') 
                sb.append(' ');
        }
       System.out.println(sb.toString());
    }
}

//폰캔몬 