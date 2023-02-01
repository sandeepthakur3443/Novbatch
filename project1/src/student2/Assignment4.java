package student2;

public class Assignment4 {

	public Assignment4() 
	{
		
	System.out.println("defalt constructor");
	}
    public Assignment4(int a) {
		this(1,2,3);
		System.out.println("one parameterized constructor");
		}

	public Assignment4(int c, int b) {
		this(1);
		System.out.println("two paramaterized constructor");
	}

	public Assignment4(int a, int b, int c) {
		
		System.out.println("three paramaterized constructor");
	}

	public Assignment4(int a, int b, int c, int d) {
		this(1,2);
		System.out.println("four paramaterized constructor");
	}

	public static void main(String[] args) {
		
		Assignment4 obj1 = new Assignment4(1,2,3,4);	

	}

}
