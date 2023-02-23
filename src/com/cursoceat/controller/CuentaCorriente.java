package com.cursoceat.controller;

public class CuentaCorriente {
	Gestor miGestor; //gestor que administra la cuenta
	public String nombre;
	String dni;
	private double saldo;
	static private String nombreBanco="International Java Bank";
			
			
	//metodos getter y setter de nombreBanco
			public static String getNombreBanco() {
		return nombreBanco;
	}


	public static void setNombreBanco(String nombreBanco) {
		CuentaCorriente.nombreBanco = nombreBanco;
	}
	
	
	public CuentaCorriente(String nombre, String dni) {
		this.nombre = nombre;
		this.dni = dni;
		this.saldo=0;
	}


	

	public CuentaCorriente(String dni, double saldo) {
		this.dni = dni;
		this.saldo = saldo;
		this.nombre="Sin definir";
		
	}
	
	public CuentaCorriente(String nombre, String dni, double saldo,Gestor miGestor) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.saldo = saldo;
	}

	//asignar un nuevo objeto gestor a la Cta
	void setGestor(Gestor miGestor) {
		this.miGestor=miGestor;
	}

	boolean egreso(double cant) {
		boolean operacionPosible;
		if (saldo>=cant) {
			saldo-=cant;
			System.out.println("Tu nuevo saldo es->" +saldo);
			operacionPosible=true;
		}else {
			System.out.println("No tiene saldo!... Ingrese...");
			operacionPosible=false;
			
		}
		
		
		return operacionPosible;
		
		
		
	}
	void ingreso(double cant) {
		saldo+=cant;
		System.out.println("Tu saldo es->" +saldo);
		
		
	}
	void mostrarInformacion() {
		if (miGestor==null) { //La cuenta no tiene gestor
			System.out.println("La cuenta no tiene gestor asignado");
			
		}else {
			System.out.println("**Datos del Gestor**");
			miGestor.mostrarInfoGestor();
		}
			
		//Mostramos informacion de cta.
		System.out.println("Nombre-> "+nombre);
		System.out.println("DNI-> \t"+dni);
		System.out.println("Saldo-> \t"+saldo);
		System.out.println("Banco-> \t"+nombreBanco);
	}

}
