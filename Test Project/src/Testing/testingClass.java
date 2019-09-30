package Testing;

public class testingClass {
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
public void mul(int a, int b)
{
	int c;
	c=a*b;
	System.out.println("final result is" +c);
}
public static void main(String[]args)
{
	testingClass ref=new testingClass();
int sum_result= ref.sum(10,2);
int sub_result= ref.sub(100,80);
ref.mul(sum_result, sub_result);
}

}



