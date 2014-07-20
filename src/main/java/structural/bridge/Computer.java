package structural.bridge;

abstract public class Computer {

	protected WorkShop workShop1;
	protected WorkShop workShop2;

	public Computer(WorkShop work1, WorkShop work2) {
		this.workShop1 = work1;
		this.workShop2 = work2;
	}

	abstract public void manufacture();
}

class Dell extends Computer {

	public Dell(WorkShop work1, WorkShop work2) {
		super(work1, work2);
	}

	@Override
	public void manufacture() {
		System.out.print(" Dell ");
		workShop1.work();
		workShop2.work();

	}

}

class Apple extends Computer {
	public Apple(WorkShop work1, WorkShop work2) {
		super(work1, work2);
	}

	@Override
	public void manufacture() {
		System.out.print(" Apple ");
		workShop1.work();
		workShop2.work();

	}
}