package creational.builder.impl;

import creational.builder.interfaces.House;

public class WoodHouse extends House {

	@Override
	public String getRepresentation() {
		String str = "creating WoodHouse";
		return str;
	}
	// TODO everything just like BrickHouse
	// TODO create woodfloor, roof, wall, builder etc
}
