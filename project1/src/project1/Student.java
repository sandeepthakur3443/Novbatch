package project1;

public class Student {


	

       int rollno,age;
		
		public void display1()
		{
			System.out.println("Welcome to all of you");
		}
		public void display2()
		{
			System.out.println("Automation is very easy");
		}

		public static void main(String[] args)
		{
			Student assigment = new Student();
			int age=20;
			int rollno=1;
			assigment.display1();
			
			assigment.display2();
			System.out.println("Age :" +age);
			System.out.println("Roll no:" +rollno);
		}
	}

	

	


