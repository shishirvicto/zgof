package structural.bridge;

public interface WorkShop {
	 abstract public void work();
}

class Producer implements WorkShop{

	@Override
	public void work() {
		System.out.print(" Produced ");
	}
	
}

class Assembler implements WorkShop{

	@Override
	public void work() {
		System.out.println(" Assembled ");
	}
	
}
