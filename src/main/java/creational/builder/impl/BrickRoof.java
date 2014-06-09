package creational.builder.impl;

import creational.builder.interfaces.Roof;

public class BrickRoof implements Roof {

	@Override
	public String getRepresentation() {
		return "creating BrickRoof";
	}

}
