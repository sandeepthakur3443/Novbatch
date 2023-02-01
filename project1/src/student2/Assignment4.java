package student2;

public class Assignment4 {

	public Assignment4() 
	{
		
	System.out.println("defalt constructor");
	}
    public Assignment4(int a) {
		this(11,22,33);
		System.out.println("one parameterized constructor");
		}

	public Assignment4(int c, int b) {
		this(11);
		System.out.println("two paramaterized constructor");
	}

	public Assignment4(int a, int b, int c) {
		
		System.out.println("three paramaterized constructor");
	}

	public Assignment4(int a, int b, int c, int d) {
		this(11,22);
		System.out.println("four paramaterized constructor");
	}

	public static void main(String[] args) {
		
		Assignment4 obj1 = new Assignment4(11,22,33,44);	

	}

}
