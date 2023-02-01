package student2;

public class Assignment2 {
//(((((10*2)-2)+2)-2)/2)
	public int sum (int a, int b ) {
		int result = a+b;
		System.out.println(result);
	return result;}
	
	public int sub(int a, int b) {
		int result = a-b;
		System.out.println(result);
			return result;}
	
 public int mul (int a, int b) {
		int result = a*b;
		System.out.println(result);
		return result;
		}
 
	public void div (int a, int b) {
	
		
		int result =a/b;
	System.out.println(result);
	}
		public static void main(String[] args) {
		
Assignment2 obj = new Assignment2();
int sum_result=obj.sum(10, 2);
//sum_result =obj.sum(sum_result,2);
int sub_result=obj.sub(sum_result, 2);
int mul_result=obj.mul(sub_result, 2);
obj.div(mul_result, 2);
	}

}
