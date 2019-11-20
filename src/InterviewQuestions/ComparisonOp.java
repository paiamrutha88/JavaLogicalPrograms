package InterviewQuestions;

public class ComparisonOp {

	public static void main(String[] args) {
	
		System.out.println(2==2);
		
		A a1 = new A();
		A a2=new A();
		a1.i=10;
		a2.i=10;
		System.out.println(a1==a2);//false
		System.out.println(a1.i==a2.i);
		
		String n[] = new String[2];
		char c[] = new char[5];
		
		final int i;
		
		
	}

}

class A
{
	int i;
}