package creational.builder;

import creational.builder.impl.BrickBuilder;
import creational.builder.impl.HouseDirector;

public class HouseBuilderClient {

	public static void main(String[] args) {
		HouseDirector houseDirector = new HouseDirector();
		BrickBuilder brickBuilder = new BrickBuilder();
		houseDirector.constructHouse(brickBuilder);
	}
}
