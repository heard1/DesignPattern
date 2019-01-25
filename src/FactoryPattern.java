
// Factory Pattern
public class FactoryPattern implements Print {
	
	@Override
	public void print() {
		System.out.println("Hello World!");
	}

	public static void main0(String[] args) {
		FactoryPattern tem = new FactoryPattern();
		tem.print();

	}
}