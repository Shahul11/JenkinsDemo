
public class TestConstructor {
/*
	int a = 10;
	int b = 20;*/  //note if it is intilizied like this then, this takes precedense
	
	int a;
	int b;

	 TestConstructor() {
		System.out.println("Default constructor");

	}
	
	TestConstructor(int a) {
		System.out.println("One parametrized constructor");
		this.a=a;

	}
	
	

	TestConstructor(int a, int b) {
		this.a = a;
		this.b = b;
		System.out.println("Parametrized constrcutor");

	}
	
	void Display()
	{
		System.out.println("The value of a is: " +a);
	}
	
	void Sum()
	{
		int c=a+b;
		System.out.println("Addition of two numbers is:" +c);
	}

	public static void main(String[] args) {
		TestConstructor t1 = new TestConstructor();
		t1.Display();
		t1.Sum();
		
		TestConstructor t2 = new TestConstructor(5,91);
		t2.Display();
		t2.Sum();

	}

}
