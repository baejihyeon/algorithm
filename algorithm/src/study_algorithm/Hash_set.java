package study_algorithm;

import java.util.HashSet;
import java.util.Iterator;

public class Hash_set {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("�ڹ�");

		set.add("īǪġ��");

		set.add("����������");
		
		set.add("�ڹ�");

		set.add("����������");

		System.out.println("����� �������� ��  : " + set.size());

		Iterator<String> iterator = set.iterator();

		while (iterator.hasNext()) {

			String str = iterator.next();

			System.out.println(str);

		}

	}

}

