package structural.bridge;

public class Bridge {
	public static void main(String[] args) {
		Computer dell = new Dell(new Producer(), new Assembler());
		dell.manufacture();
		Computer apple = new Apple(new Producer(), new Assembler());
		apple.manufacture();
	}
}

 