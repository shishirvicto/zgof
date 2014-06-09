package creational.builder.interfaces;

public abstract class HouseBuilder {
	protected House house;
	protected Roof roof;
	protected Wall wall;
	protected Floor floor;
	
	public abstract House createHouse();
	public abstract Floor createFloor();
	public abstract Wall createWall();
	public abstract Roof createRoof();
	
}
