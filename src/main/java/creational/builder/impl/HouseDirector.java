package creational.builder.impl;

import creational.builder.interfaces.House;
import creational.builder.interfaces.HouseBuilder;


public class HouseDirector {
	public House constructHouse(HouseBuilder houseBuilder)
	{
		House house = houseBuilder.createHouse();
		System.out.println(house.getRepresentation());
		house.setFloor(houseBuilder.createFloor());
		System.out.println(house.getFloor().getRepresentation());
		house.setWall(houseBuilder.createWall());
		System.out.println(house.getWall().getRepresentation());
		house.setRoof(houseBuilder.createRoof());
		System.out.println(house.getRoof().getRepresentation());
		return house;
	}
}
