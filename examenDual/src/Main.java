package com.politecnico.coches;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		String atrDni, atrNombre, atrApellidos, atrEmail, atrTfno;
		int atrNTarjeta, resp;
		Scanner sc = new Scanner(System.in);
		
		
		boolean bucle = true;
		
		while(bucle==true) {
			System.out.println("Bienvenido a la empresa de alquiler de coche politécnico. ¿Que desea hacer?");
			System.out.println("1. Agregar un vehículo");
			System.out.println("2. Dar de alta un cliente");
			System.out.println("3. Alquilar un vehículo");
			System.out.println("4. devolver un vehículo");
			System.out.println("5. mostrar lista de los vehículos");
			System.out.println("6. Eliminar un vehículo");
			System.out.println("7. Eliminar un cliente");
			System.out.println("8. Salir");
		
			resp = Integer.valueOf(sc.nextLine());
				
			switch(resp){
				case 1:
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				case 8:
					bucle = false;
			}
			
			
		}
		
	}
