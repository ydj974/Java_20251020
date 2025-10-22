package Test;

public class Example01 {

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

		String name = "윤동준";
		System.out.println("이름 : " + name);
		
		int age;
		age = 33;
		System.out.println("나이 : " + age);
		
		String address = "서울시 천호동";
		System.out.println("주소 : " + address);

		double weight;
		weight = 77.5;
		System.out.println("몸무게 : " + weight + "kg");
		
	}

}
