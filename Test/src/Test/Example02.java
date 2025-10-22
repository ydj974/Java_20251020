package Test;

import java.util.Scanner;

public class Example02 {

	public static void main(String[] args) {
		/*
		 * 
		 * -------------출력 예시-------------
		 *  이름 : 본인이름 : name                                          : String name = :"윤동준"
		 *                                                                System.out.println("이름 : " name");
		 *  나이 : 25 : age
		 *  주소: 서울시 천호동 : address
		 *  몸무게 : 77.5kg
		 * 
		 
		 */

		/*
		String name = "윤동준";
		int age=33;
		String address = "서울시 천호동";
		double weight =77.5;
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("주소 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		*/
		
		Scanner sc = new Scanner(System.in);
		
		String name = sc.nextLine();
		//Long Double Integer
		int age = sc.nextInt();
		String address = sc.nextLine();
		double weight = sc.nextDouble();
		
		System.out.println("이름은 : " + name);
		System.out.println("나이는 : " + age);
		System.out.println("주소는 : " + address);
		System.out.println("몸무게 : " + weight + "kg");
		
		System.out.println("end!!");
		
	
		
		
	}

}
