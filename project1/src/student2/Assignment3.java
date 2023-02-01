package student2;

public class Assignment3 {
	 public Assignment3() 
	        {
		    this(14,15);
	        System.out.println("defalt constructor");
	       
			}
	      
			public Assignment3(int a)
			{
				
			System.out.println("one parameterized constructor");
			}
			public Assignment3(int c,int b)
			{
			     this(15);
			System.out.println("two parameterized constructor");
			}
			public Assignment3(int a,int b,int c)
			{
				this();
			System.out.println("three parameterized constructor");
			
			}
			
			public Assignment3(int a,int b,int c,int d)
			{
				this(14,15);
			System.out.println("four parameterized constructor");
			}
			public static void main(String[] args) {
				
		    
		
			Assignment3 ref = new Assignment3(1,3,4);
			        
			}

	

	}


