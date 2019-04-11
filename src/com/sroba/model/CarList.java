package com.sroba.model;

public class CarList {
	
	//declaraci�n
	private static CarList instancia;
	//private static CarList instancia = new CarList()
	
	//para evitar instancia mediante "new"
	private CarList() {
		
	}
	
	//para obtener la instancia �nicamente por �ste m�todo
	public static CarList getInstancia() {
		if (instancia == null) {
			instancia = new CarList();
		}
		return instancia;
	}

	//m�todo de prueba
	public void makeVehicle() {
		System.out.println("Carro fabricado");
	}
}
