
public class TestSIBandIIB {
	
	int a;
	static int b;

/*	static {
		b=11;
		System.out.println("I am from SIB1");
		
	}

	static {
		b=12;
		System.out.println("I am from SIB2");
	}*/

	{
		a=10;
		System.out.println("I am from IIB1" +a);
	}

	{

		System.out.println("I am from IIB2");
	}

	public static void main(String[] args) {

		TestSIBandIIB t = new TestSIBandIIB();
		TestSIBandIIB t1 = new TestSIBandIIB();
		System.out.println(t.a);
		//System.out.println(TestSIBandIIB.b);
	}

}
