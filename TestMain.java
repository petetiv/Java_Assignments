package inheritance;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass tc=new TestClass();
		tc.abstractMethod();
		tc.interfaceMethod();
		
		
		TestAbstractClass tac=new TestClass();
		tac.abstractMethod();
		tac.interfaceMethod();
		
		TestInterface ti=new TestClass();
		ti.interfaceMethod();
		
		
		
		
		
	}

}
