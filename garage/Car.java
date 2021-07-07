package com.qa.garage;

public class Car extends Vehicle {

	private String bootSize;

	public Car(String make, String engineSize, String bootSize) {
		super();
		// optional^
		setMake(make);
		setEngineSize(engineSize);
		setNoOfWheels(4);
		setFly(false);
		setBootSize(bootSize);
	}

	public String getBootSize() {
		return bootSize;
	}

	public void setBootSize(String bootSize) {
		this.bootSize = bootSize;
	}

}
