package Test;

public class Sample2 {

	public static void main(String[] args) {
	
       Person p = new Person();
       
       p.name = "윤동준";
       p.age = 20;
       
       System.out.println(p.name);
       System.out.println(p.age);
       
       Student s = new Student();
       s.학번 = "1234";
       s.학과 = "소프트웨어학과";
	}

}


class Person{
	
	String name;
	int age;
	
}

class Student{
	
    String 학번;
    String 학과;
}
