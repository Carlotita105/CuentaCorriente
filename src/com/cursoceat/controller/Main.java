package com.cursoceat.controller;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Indique el nombre->");
		String nombre=new Scanner(System.in).nextLine();
		System.out.println("Indique el DNI->");
		String midni=new Scanner(System.in).nextLine();
		CuentaCorriente miCta=new CuentaCorriente(nombre, midni);
		//preguntamos el importe a ingresar
		System.out.println("Cuanto quieres ingresar");
		double miIngreso=new Scanner(System.in).nextDouble();
		//actualiza el saldo segun el importe ingresado
		miCta.ingreso(miIngreso);
		
		//pregunto el banco
		System.out.print("Nombre del Banco");
		CuentaCorriente.setNombreBanco(new Scanner(System.in).nextLine());
		//preguntamos importe a retirar
		System.out.println("Cuanto quieres retirar");
		double miEgreso=new Scanner(System.in).nextDouble();
		//actualizamos el saldo restando el importe retirado
		miCta.egreso(miEgreso);
		//creamos el gestor 1
		Gestor miGestor1=new Gestor("Jose Luis" ,"5845485M");
		miCta.miGestor=miGestor1;
		
		//mostramos la informacion
		miCta.mostrarInformacion();
		// creo mi objeto 2-> miCta2
		System.out.println("******Creo objeto 2*****");
		System.out.println("Indique el DNI->");
		midni=new Scanner(System.in).nextLine();
		System.out.println("Indique el saldo inicial al crea la cta->");
		double saldoInicial=new Scanner(System.in).nextDouble();
		CuentaCorriente micta2=new CuentaCorriente(midni, saldoInicial);
		System.out.println("Indique el nombre->");
		micta2.nombre=new Scanner(System.in).nextLine(); //llamar
		//Creo mi gestor 2
		Gestor miGestor2=new Gestor("Beatriz López", "5454548D");
		
		System.out.println("datos de la cuenta 1");
		miCta.mostrarInformacion();
		System.out.println("Datos de la cuenta 2");
		micta2.mostrarInformacion();
		/////////////////////////////////////////////////////////////////////
		
	}

}
