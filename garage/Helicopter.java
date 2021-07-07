package com.qa.garage;

public class Helicopter extends Vehicle {

	private int maxAltitude;

	public Helicopter(String make, String engineSize, int maxAltitude) {
		setMake(make);
		setEngineSize(engineSize);
		setNoOfWheels(0);
		setFly(true);
		setMaxAltitude(maxAltitude);
	}

	public int getMaxAltitude() {
		return maxAltitude;
	}

	public void setMaxAltitude(int maxAltitude) {
		this.maxAltitude = maxAltitude;
	}

}
