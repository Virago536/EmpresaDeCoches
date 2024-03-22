package com.politecnico.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Empresa implements GestorCliente{
	private String nombre;
	
	public ArrayList<Vehiculo> listaVehiculos;
	public ArrayList<Coche> listaCoches;
	public ArrayList<Furgoneta> listaFurgonetas;
	public ArrayList<Camion> listaCamiones;
	public Map <String, Cliente> mapaClientes = new HashMap<String, Cliente>();
 
	
	public Empresa(String nombre) {
		this.nombre = nombre;
		listaCoches = new ArrayList<>();
		listaFurgonetas = new ArrayList<>();
		listaCamiones = new ArrayList<>();
		mapaClientes = new HashMap<>();
	}
	
	public boolean addFurgoneta(String matricula, String modelo, String marca, String motor, int kms_recorridos, float precio_dia, String conductor, int dias_alquilado, int carga, int asientos) {
		Furgoneta furgoNueva = new Furgoneta(matricula, modelo, marca, motor, kms_recorridos, precio_dia, conductor, dias_alquilado, carga, asientos);
		if(!this.estaFurgoneta(matricula)) {
		listaFurgonetas.add(furgoNueva);
		return true;
		}
		else return false;
	} 
	
	public boolean estaFurgoneta(String matricula) {
		return (buscaFurgoneta(matricula)!=null);
	}
	
	
	public Furgoneta buscaFurgoneta(String matricula) {
		for(Furgoneta cualquierFurgo: listaFurgonetas) {
			if(cualquierFurgo.getMatricula().equals(matricula)) {
				return cualquierFurgo;
			}
		}
		return null;
	}
	
	public boolean removeFurgoneta(String matricula) {
		for(Furgoneta cualquierFurgo: listaFurgonetas) {
			if(cualquierFurgo.getMatricula().equals(matricula)) {
				listaFurgonetas.remove(cualquierFurgo);
				return true;
			}
		}
		return false;
	}
	
	public Furgoneta[] listarLasFurgonetas() {
		Furgoneta[] nuevaListaFurgos = new Furgoneta[listaFurgonetas.size()];
		
		for(int i = 0; i<nuevaListaFurgos.length; i++) {
			nuevaListaFurgos[i] = listaFurgonetas.get(i);
		}
		return nuevaListaFurgos;
		
	}
	
	public boolean addCoche(String matricula, String modelo, String marca, String motor, int kms_recorridos, float precio_dia, String conductor, int dias_alquilado, int plazas, int puertas, int v_maletero, String tipo) {
		Coche cocheNuevo = new Coche(matricula, modelo, marca, motor, kms_recorridos, precio_dia, conductor, dias_alquilado, plazas, puertas, v_maletero, tipo);
		if(!this.estaCoche(matricula)) {
		listaCoches.add(cocheNuevo);
		return true;
		}
		else return false;
	} 
	
	public boolean estaCoche(String matricula) {
		return (buscaCoche(matricula)!=null);
	}
	
	
	public Coche buscaCoche(String matricula) {
		for(Coche cualquierCoche: listaCoches) {
			if(cualquierCoche.getMatricula().equals(matricula)) {
				return cualquierCoche;
			}
		}
		return null;
	}
	
	public boolean removeCoche(String matricula) {
		for(Coche cualquierCoche: listaCoches) {
			if(cualquierCoche.getMatricula().equals(matricula)) {
				listaCoches.remove(cualquierCoche);
				return true;
			}
		}
		return false;
	}
	
	public Coche[] listarLosCoches() {
		Coche[] nuevaListaCoches = new Coche[listaCoches.size()];
		
		for(int i = 0; i<nuevaListaCoches.length; i++) {
			nuevaListaCoches[i] = listaCoches.get(i);
		}
		return nuevaListaCoches;
		
	}
	
	public boolean addCamion(String matricula, String modelo, String marca, String motor, int kms_recorridos, float precio_dia, String conductor, int dias_alquilado, int carga, int longitud) {
		Camion camionNuevo = new Camion(matricula, modelo, marca, motor, kms_recorridos, precio_dia, conductor, dias_alquilado, carga, longitud);
		if(!this.estaCamion(matricula)) {
		listaCamiones.add(camionNuevo);
		return true;
		}
		else return false;
	} 
	
	public boolean estaCamion(String matricula) {
		return (buscaCoche(matricula)!=null);
	}
	
	
	public Camion buscaCamion(String matricula) {
		for(Camion cualquierCamion: listaCamiones) {
			if(cualquierCamion.getMatricula().equals(matricula)) {
				return cualquierCamion;
			}
		}
		return null;
	}
	
	public boolean removeCamion(String matricula) {
		for(Coche cualquierCoche: listaCoches) {
			if(cualquierCoche.getMatricula().equals(matricula)) {
				listaCoches.remove(cualquierCoche);
				return true;
			}
		}
		return false;
	}
	
	public Camion[] listarLosCamiones() {
		Camion[] nuevaListaCamiones = new Camion[listaCamiones.size()];
		
		for(int i = 0; i<nuevaListaCamiones.length; i++) {
			nuevaListaCamiones[i] = listaCamiones.get(i);
		}
		return nuevaListaCamiones;
		
	}

	public boolean addCliente(Cliente c) {
		if(c != null && !mapaClientes.containsValue(c)) {
			mapaClientes.put(c.getDni(), c);
			return true;
		}
		else return false;
	}

	public boolean removeCliente(Cliente c) {
		if(c != null && mapaClientes.containsValue(c)) {
			mapaClientes.remove(c.getDni(), c);
			return true;
		}
		return false;
	}

	public Cliente buscarCliente(String dni) {
		if(dni!= null) {
			return mapaClientes.get(dni); 
		}
		else return null;
	}

}

