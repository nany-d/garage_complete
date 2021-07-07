package com.qa.garage;

public class Bike extends Vehicle {

	private String coolness;

	public Bike(String make, String engineSize, String coolness) {
		setMake(make);
		setEngineSize(engineSize);
		setNoOfWheels(2);
		setFly(false);
		setCoolness(coolness);
	}

	public String getCoolness() {
		return coolness;
	}

	public void setCoolness(String coolness) {
		this.coolness = coolness;
	}

}
