package creational.builder.interfaces;

public abstract class House {
	
	protected Roof roof;
	protected Wall wall;
	protected Floor floor;
	
	public Roof getRoof() {
		return roof;
	}

	public Wall getWall() {
		return wall;
	}

	public Floor getFloor() {
		return floor;
	}

	public void setRoof(Roof roof) {
		this.roof = roof;
	}

	public void setWall(Wall wall) {
		this.wall = wall;
	}

	public void setFloor(Floor floor) {
		this.floor = floor;
	}

	public abstract String getRepresentation() ;
}
