package creational.builder.impl;

import creational.builder.interfaces.Floor;
import creational.builder.interfaces.House;
import creational.builder.interfaces.HouseBuilder;
import creational.builder.interfaces.Roof;
import creational.builder.interfaces.Wall;

public class BrickBuilder extends HouseBuilder {

	@Override
	public House createHouse() {
		House house = new BrickHouse();
		return house;
	}

	@Override
	public Floor createFloor() {
		Floor floor = new BrickFloor();
		return floor;
	}

	@Override
	public Wall createWall() {
		Wall wall = new BrickWall();
		return wall;
	}

	@Override
	public Roof createRoof() {
		Roof roof = new BrickRoof();
		return roof;
	}

}
