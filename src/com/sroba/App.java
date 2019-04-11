package com.sroba;

import com.sroba.model.CarList;

public class App {

	public static void main(String[] args) {
		
		CarList list = CarList.getInstancia();
		list.makeVehicle();
		System.out.println(list instanceof CarList);

	}

}
