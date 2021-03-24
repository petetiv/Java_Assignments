package inheritance;

public abstract class TestAbstractClass implements TestInterface{
	
	public abstract void abstractMethod();
	
	public void interfaceMethod() {
		System.out.println("Implemted Interface Method in Abstract Class");
	}
	
	
}
