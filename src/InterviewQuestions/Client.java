package InterviewQuestions;

public class Client {

	public static void main(String[] args) {
	/*
		Phone p1=new LandLine();
	p1.call();
	p1.text();
	
	p1.connectToInternet();
	*/
	Phone p2=new SamsungPhone();

	p2.call();
	p2.text();
	
	p2.connectToInternet();
	}

}
