package ex01;

/*
 * ++AA: 선위 연산자
 * B++ " 후위 연산자
 * --A : 감소
 * B-- : 감소
 */


public class 증감연산자 {

	public static void main(String[] args) {
	
		int iNum = 10;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 1");
		iNum = iNum+1;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 2");
		iNum += 1;
		System.out.println(iNum);
		
		System.out.println("iNum 1증가 - 3");
		++iNum;
		System.out.println(iNum);

		System.out.println("iNum 1증가 - 4");
		iNum++;
		System.out.println(iNum);
		
		System.out.println("선위 연산자 1증가 - 5");
        int iNum2 = 1;
        int iA = ++iNum2;
        /*
         * iNum2 += 1;
         * int iA = iNum;
         * 
         */
		System.out.println(iA);
		System.out.println(iNum2);
		
		System.out.println("후위 연산자 1증가 - 6");
		iNum2 = 1;
		int iB = iNum2++;
		
		/*
		 * int iB = iNum2;
		 * iNum2 +=
		 * 
		 */
		
		System.out.println(iB);
		System.out.println(iNum2);
		
		
		
		
		
	}

}
