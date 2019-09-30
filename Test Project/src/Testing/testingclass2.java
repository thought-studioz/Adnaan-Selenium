package Testing;

public class testingclass2 {
	private static testingclass2 testingclass2;
	public int sum(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("final result is" +c);
		return c;	
	}
	public int sub(int a,int b)
	{
		int c;
		c=a-b;
		System.out.println("final result is" +c);
		return c;
	}
	public int mul(int a, int b)
	{
		int c;
		c=a*b;
		System.out.println("final result is" +c);
		return c;
	}
	public void div(int a,int b)
	{
		int c;
		c=a/b;
		System.out.println("final result is" +c);
		}
	public static void main(String[] args) {
		testingclass2 obj=new testingclass2();
		
		int sum1=obj.sum(10, 2);
		int sub1=obj.sub(sum1, 2);
		int sum2=obj.sum(sub1, 2);
		int mul1=obj.mul(sum2, 2);
		obj.div(mul1, 2);
		
	}
}

