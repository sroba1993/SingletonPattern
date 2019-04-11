package com.sroba.model;

public class CarList {
	
	//declaración
	private static CarList instancia;
	//private static CarList instancia = new CarList()
	
	//para evitar instancia mediante "new"
	private CarList() {
		
	}
	
	//para obtener la instancia únicamente por éste método
	public static CarList getInstancia() {
		if (instancia == null) {
			instancia = new CarList();
		}
		return instancia;
	}

	//método de prueba
	public void makeVehicle() {
		System.out.println("Carro fabricado");
	}
}
