package com.politecnico.coches;

import java.util.Scanner;

public class Main {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);
		int resp = 0;
		String atrResp;
		
		//Atributos generales
		String atr;
		String atrMatricula;
		String atrModelo;
		String atrMarca;
		String atrMotor;
		String atrConductor;
		int atrKms_recorridos, atrDias_alquilado;
		float atrPrecio_dia;
		
		
		//Atributos de coche
		int atrPlazas;
		int atrPuertas;
		int atrV_maletero;
		String atrTipo;
		
		//Atributos de furgoneta
		int atrCarga;
		
		//Atributos de camion
		int atrLongitud;
		
		//Atributos cliente
		String atrNombre;
		String atrApellidos;
		String atrEmail;
		String atrTfno;
		String atrDni;
		int atrNtarjeta;
		float pago;
		int atrKms_cliente;
		
		//Atributos lista
		String xMotor;
		int nPlazas, xCarga, mLongitud;
		
		
		
		boolean loop = true;
		
		Empresa Opel = new Empresa("Opel");
		
		while(loop==true) {
			System.out.println("Bienvenido a la empresa de alquileres del politécnico:");
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("1. Dar de alta un vehículo");
			System.out.println("2. Eliminar un vehículo");
			System.out.println("3. Alquilar un vehículo");
			System.out.println("4. Devolver un vehículo");
			System.out.println("5. Mostrar lista de los vehiculos");
			System.out.println("6. Dar de alta un cliente");
			System.out.println("7. Eliminar un cliente");
			System.out.println("8. Salir");
			
			resp = Integer.valueOf(sc.nextLine());
			
			switch(resp) {
			case 1:
				System.out.println("¿Qué tipo de vehículo quiere dar de alta?");
				System.out.println("1. Dar de alta un coche");
				System.out.println("2. Dar de alta una furgoneta");
				System.out.println("3. Dar de alta un camión");
				atrResp = sc.nextLine();
				if(atrResp.compareTo("1")==0) {
					System.out.println("introduzca la matrícula: ");
					atrMatricula = sc.nextLine();
					
					if(Opel.buscaCoche(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaFurgoneta(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaCamion(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					
					System.out.println("introduzca el modelo: ");
					atrModelo = sc.nextLine();
					System.out.println("introduzca la marca: ");
					atrMarca = sc.nextLine();
					System.out.println("introduzca el tipo de motor(eléctrico, híbrido enchufable, híbrido, gasolina, diesel): ");
					atrMotor = sc.nextLine();
					System.out.println("introduzca su precio por día: ");
					atrPrecio_dia = Float.valueOf(sc.nextLine());
					System.out.println("introduzca el número de plazas: ");
					atrPlazas = Integer.valueOf(sc.nextLine());
					System.out.println("introduzca el número de puertas: ");
					atrPuertas = Integer.valueOf(sc.nextLine());
					System.out.println("introduzca el volumen del maletero: ");
					atrV_maletero = Integer.valueOf(sc.nextLine());
					System.out.println("introduzca el tipo: ");
					atrTipo = sc.nextLine();
					
					atrKms_recorridos = 0;
					atrDias_alquilado = 0;
					atrConductor = null;
					
					if(Opel.addCoche(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrPlazas, atrPuertas, atrV_maletero, atrTipo)== true) {
						System.out.println("El coche se agregó correctamente");
					}
					else {
						System.out.println("No se agregó la furgoneta");
					}
					Opel.addCoche(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrPlazas, atrPuertas, atrV_maletero, atrTipo);
					break;
				}
				else if(atrResp.compareTo("2")==0) {
					System.out.println("introduzca la matrícula: ");
					atrMatricula = sc.nextLine();
					
					if(Opel.buscaCoche(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaFurgoneta(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaCamion(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					
					System.out.println("introduzca el modelo: ");
					atrModelo = sc.nextLine();
					System.out.println("introduzca la marca: ");
					atrMarca = sc.nextLine();
					System.out.println("introduzca el tipo de motor(eléctrico, híbrido enchufable, híbrido, gasolina, diesel): ");
					atrMotor = sc.nextLine();
					System.out.println("introduzca su precio por día: ");
					atrPrecio_dia = Float.valueOf(sc.nextLine());
					System.out.println("introduzca su carga máxima: ");
					atrCarga = Integer.valueOf(sc.nextLine());
					System.out.println("introduzca el número de asientos: ");
					atrPlazas = Integer.valueOf(sc.nextLine());
					
					
					atrKms_recorridos = 0;
					atrDias_alquilado = 0;
					atrConductor = null;
					
					if(Opel.addFurgoneta(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrCarga, atrPlazas)== true) {
						System.out.println("La furgoneta se agregó correctamente");
					}
					else {
						System.out.println("No se agregó la furgoneta");
					}
					Opel.addFurgoneta(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrCarga, atrPlazas);
					break;
				}
				else {
					System.out.println("introduzca la matrícula: ");
					atrMatricula = sc.nextLine();
					
					if(Opel.buscaCoche(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaFurgoneta(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					if(Opel.buscaCamion(atrMatricula)!= null) {
						System.out.println("La matrícula ya existe");
						break;
					}
					
					System.out.println("introduzca el modelo: ");
					atrModelo = sc.nextLine();
					System.out.println("introduzca la marca: ");
					atrMarca = sc.nextLine();
					System.out.println("introduzca el tipo de motor(eléctrico, híbrido enchufable, híbrido, gasolina, diesel): ");
					atrMotor = sc.nextLine();
					System.out.println("introduzca su precio por día: ");
					atrPrecio_dia = Float.valueOf(sc.nextLine());
					System.out.println("introduzca su carga máxima: ");
					atrCarga = Integer.valueOf(sc.nextLine());
					System.out.println("introduzca la longitud: ");
					atrLongitud = Integer.valueOf(sc.nextLine());
					
					
					atrKms_recorridos = 0;
					atrDias_alquilado = 0;
					atrConductor = null;
					
					if(Opel.addCamion(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrCarga, atrLongitud)== true) {
						System.out.println("El camión se agregó correctamente");
					}
					else {
						System.out.println("No se agregó el camión");
					}
					Opel.addCamion(atrMatricula, atrModelo, atrMarca, atrMotor, atrKms_recorridos, atrPrecio_dia, atrConductor, atrDias_alquilado, atrCarga, atrLongitud);
					break;
				}
			case 2:
				System.out.println("Introduzca la matrícula del vehículo que desea eliminar: ");
				atrMatricula = sc.nextLine();
				if(Opel.buscaCoche(atrMatricula)!=null) {
					Opel.removeCoche(atrMatricula);
					System.out.println("Coche eliminado correctamente");
				}
				else if(Opel.buscaFurgoneta(atrMatricula)!=null) {
					Opel.removeFurgoneta(atrMatricula);
					System.out.println("Furgoneta eliminada correctamente");
				}
				else if(Opel.buscaCamion(atrMatricula)!=null) {
					Opel.removeCamion(atrMatricula);
					System.out.println("Camion eliminado correctamente");
				}
				else {
					System.out.println("No se pudo eliminar el vehículo");
				}
				break;
			case 3:
				System.out.println("Introduzca su dni: ");
				atrDni = sc.nextLine();
				
				if(Opel.buscarCliente(atrDni)== null) {
					System.out.println("El cliente no existe");
					break;
				}
				
				System.out.println("Introduzca La matrícula del vehículo que quiere alquilar: ");
				atrMatricula = sc.nextLine();
				System.out.println("Introduzca el número de dias que quiere alquilar el vehículo: ");
				atrDias_alquilado = Integer.valueOf(sc.nextLine());
				
				atrConductor = atrDni;
				
				if(Opel.buscaCamion(atrMatricula)!=null) {
					Camion ca = Opel.buscaCamion(atrMatricula);
					
					ca.setConductor(atrConductor);
					ca.setDias_alquilado(atrDias_alquilado);
					System.out.println("Camión alquilado correctamente");
				}
				else if(Opel.buscaFurgoneta(atrMatricula)!=null) {
					Furgoneta f = Opel.buscaFurgoneta(atrMatricula);
					f.setConductor(atrConductor);
					f.setDias_alquilado(atrDias_alquilado);
					System.out.println("Furgoneta alquilada correctamente");
				}
				else if(Opel.buscaCoche(atrMatricula)!=null) {
					Coche c = Opel.buscaCoche(atrMatricula);
					c.setConductor(atrConductor);
					c.setDias_alquilado(atrDias_alquilado);
					System.out.println("Coche alquilado correctamente");
				}
				else {
					System.out.println("No se pudo alquilar el vehículo");
				}
				break;
				
			case 4:
				System.out.println("Introduzca la matrícula del vehículo que desea devolver: ");
				atrMatricula = sc.nextLine();
				System.out.println("Introduzca el número de kilómetros hechos: ");
				atrKms_cliente = Integer.valueOf(sc.nextLine());
				
				if(Opel.buscaCamion(atrMatricula)!=null) {
					Camion ca = Opel.buscaCamion(atrMatricula);
					ca.setConductor(null);
					ca.setKms_recorridos(ca.getKms_recorridos()+atrKms_cliente);
					if((atrKms_cliente/ca.getDias_alquilado())>500) {
						pago = ca.getDias_alquilado() * (ca.getPrecio_dia()+(ca.getPrecio_dia()*20/100));
					}
					else {
						pago = ca.getDias_alquilado() * ca.getPrecio_dia();
					}
					
					
					System.out.println("Vehículo devuelto");
					System.out.println("Precio a pagar: "+ pago +" €");
				}
				else if(Opel.buscaFurgoneta(atrMatricula)!=null) {
					Furgoneta f = Opel.buscaFurgoneta(atrMatricula);
					f.setConductor(null);
					f.setKms_recorridos(f.getKms_recorridos()+atrKms_cliente);
					if((atrKms_cliente/f.getDias_alquilado())>500) {
						pago = f.getDias_alquilado() * (f.getPrecio_dia()+(f.getPrecio_dia()*20/100));
					}
					else {
						pago = f.getDias_alquilado() * f.getPrecio_dia();
					}
					
					System.out.println("Vehículo devuelto");
					System.out.println("Precio a pagar: "+ pago +" €");	
				}
				else if(Opel.buscaCoche(atrMatricula)!=null) {
					Coche c = Opel.buscaCoche(atrMatricula);
					c.setConductor(null);
					c.setKms_recorridos(c.getKms_recorridos()+atrKms_cliente);
					
					if((atrKms_cliente/c.getDias_alquilado())>500) {
						pago = c.getDias_alquilado() * (c.getPrecio_dia()+(c.getPrecio_dia()*20/100));
					}
					else {
						pago = c.getDias_alquilado() * c.getPrecio_dia();
					}
					
					System.out.println("Vehículo devuelto");
					System.out.println("Precio a pagar: "+ pago +" €");
				}
				else {
					System.out.println("No se pudo devolver el vehículo");
				}
				
				break;
				
			case 5: 
				System.out.println("Introduzca el número mínimo de plazas: ");
				nPlazas = Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca el tipo de motor que desea: ");
				xMotor = sc.nextLine();
				System.out.println("Introduzca la carga mínima: ");
				xCarga = Integer.valueOf(sc.nextLine());
				System.out.println("Introduzca la longitud máxima: ");
				mLongitud = Integer.valueOf(sc.nextLine());
				System.out.println("Coches: ");
				for(Coche cualquiera: Opel.listaCoches) {
					if(cualquiera.getPlazas()>= nPlazas && cualquiera.getMotor().compareTo(xMotor)==0) {
						System.out.println("// "+cualquiera.getMarca()+" "+cualquiera.getModelo()+" "+cualquiera.getMatricula()+": ");
						System.out.println("-número de plazas: "+cualquiera.getPlazas());
						System.out.println("-tipo de motor: "+cualquiera.getMotor());
						System.out.println("-volumen del maletero: "+ cualquiera.getV_maletero());
						System.out.println("-número de puertas: "+ cualquiera.getPuertas());
						System.out.println("-Precio por día: "+ cualquiera.getPrecio_dia()+ " €");
					}
				}
				System.out.println("Furgones: ");
				for(Furgoneta cualquiera: Opel.listaFurgonetas) {
					if(cualquiera.getCarga()>= xCarga && cualquiera.getAsientos()>= nPlazas) {
						System.out.println("// "+cualquiera.getMarca()+" "+cualquiera.getModelo()+" "+cualquiera.getMatricula()+": ");
						System.out.println("-Carga máxima: "+cualquiera.getCarga()+ " Kg");
						System.out.println("-número de asientos: "+cualquiera.getAsientos());
						System.out.println("-tipo de motor: "+cualquiera.getMotor());
						System.out.println("-Precio por día"+ cualquiera.getPrecio_dia()+ " €");
					}
				}
				System.out.println("Camiones: ");
				for(Camion cualquiera: Opel.listaCamiones) {
					if(cualquiera.getCarga()>= xCarga && cualquiera.getLongitud() <= mLongitud) {
						System.out.println("// "+cualquiera.getMarca()+" "+cualquiera.getModelo()+" "+cualquiera.getMatricula()+": ");
						System.out.println("-Carga máxima: "+cualquiera.getCarga()+ " Kg");
						System.out.println("-tipo de motor: "+cualquiera.getMotor());
						System.out.println("-Longitud: "+cualquiera.getLongitud()+ " m");
						System.out.println("-Precio por día"+ cualquiera.getPrecio_dia()+ " €");
					}
				}
				break;
			case 6:
				System.out.println("Introduzca su DNI: ");
				atrDni = sc.nextLine();
				
				if(Opel.buscarCliente(atrDni)!=null) {
					System.out.println("Ya existe un cliente con ese DNI");
					break;
				}	
				System.out.println("Introduzca su nombre: ");
				atrNombre = sc.nextLine();
				System.out.println("Introduzca sus apellidos: ");
				atrApellidos = sc.nextLine();
				System.out.println("Introduzca su email: ");
				atrEmail = sc.nextLine();
				System.out.println("Introduzca su teléfono: ");
				atrTfno = sc.nextLine();
				
				
				System.out.println("Introduzca su número de tarjeta: ");
				atrNtarjeta = Integer.valueOf(sc.nextLine());
				
				Cliente c = new Cliente(atrDni, atrNombre, atrApellidos, atrEmail, atrTfno, atrNtarjeta);
				
				if(Opel.addCliente(c)== true) {
					System.out.println("El cliente se creó correctamente");
				}
				else {
					System.out.println("No se creó el cliente");
				}
				Opel.addCliente(c);
				break;
			case 7:	
				System.out.println("Introduzca el DNI del cliente que quiere eliminar");
				atrDni = sc.nextLine();
				if(Opel.buscarCliente(atrDni)!=null) {
					c = Opel.buscarCliente(atrDni);
					Opel.removeCliente(c);
					System.out.println("El cliente se eliminó correctamente");
				}else {
					System.out.println("No se pudo eliminar el cliente");
				}
				break;
			case 8:
				System.out.println("Adios");
				loop = false;
				
			}
		}
		
			
	}
		
}
