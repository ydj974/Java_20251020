package ex01;

public class ForEx02 {

	public static void main(String[] args) {

		int sum=0;

        /*
         * 1~100까지 짝수 합
         */
		
		
		
		for( int i=1 ; i<=100 ; i++ ) {
			if(i % 2 == 0)
			{
		 sum += i;
			}
			
		}
		
		System.out.println("합 : " +sum);
	}

}
