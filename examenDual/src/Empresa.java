package com.politecnico.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import com.politecnicomalaga.coches.Coche;

public class Empresa implements GestorCliente{
	String nombre;
	
	public Map <String,Cliente> mapaClientes = new HashMap<String, Cliente>();
	public ArrayList<Coche> listaCoches;
	public ArrayList<Furgoneta> listaFurgonetas;
	public ArrayList<Camion> listaCamiones;
	public ArrayList<Vehiculo> listaVehiculos;
	
	public Empresa(String nombre, Map<String, Cliente> mapaClientes, ArrayList<Coche> listaCoches, ArrayList<Furgoneta> listaFurgonetas, ArrayList<Camion> listaCamiones) {
		this.nombre = nombre;
		mapaClientes = new HashMap<>();
		listaCoches = new ArrayList<>();
		listaFurgonetas = new ArrayList<>();
		listaCamiones = new ArrayList<>();
	}
	
	
	//Métodos de la clase cliente
	public boolean addCliente(Cliente c) {
		if(c!=null && !mapaClientes.containsValue(c)) {
			mapaClientes.put(c.getDni(), c);
			return true;
		}
		else return false;
	}
	
	public boolean removeCliente(Cliente c) {
		if(c!=null && mapaClientes.containsValue(c)) {
			mapaClientes.remove(c.getDni(), c);
			return true;
		}
		else return false;
	}
	
	public Cliente buscarCliente(String dni) {
		if(dni!=null) {
			return mapaClientes.get(dni);
		}
		else return null;
	}
	
	public boolean addCoche(String matricula, String modelo, String marca, float kmRecorridos, float precioDia,String tipoMotor, int plazasMaximas, int numPuertas, float volumenMaletero, String tipo) {
		Coche cocheNuevo = new Coche(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor, plazasMaximas, numPuertas, volumenMaletero, tipo);
		if(!this.estaCoche(matricula)) {
			listaVehiculos.add(cocheNuevo);
			return true;
		}else return false;
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
	
	public boolean addCamion(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor, float cargaMaxima, float longitud) {
		Camion camionNuevo = new Camion(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor, cargaMaxima, longitud);
		if(!this.estaCamion(matricula)) {
			listaVehiculos.add(camionNuevo);
			return true;
		}else return false;
	}
	
	public boolean estaCamion(String matricula) {
		return (buscaCamion(matricula)!=null);
	}
	
	public Camion buscaCamion(String matricula) {
		for(Camion cualquierCamion: listaCamiones) {
			if(cualquierCamion.getMatricula().equals(matricula)) {
				return cualquierCamion;
			}
		}
		return null;
	}
	
	public boolean addFurgoneta(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor, float cargaMaxima, int plazaAsientos) {
		Furgoneta furgoNueva = new Furgoneta(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor, cargaMaxima, plazaAsientos);
		if(!this.estaCamion(matricula)) {
			listaFurgonetas.add(furgoNueva);
			return true;
		}else return false;
	}
	
	public boolean estaFurgoneta(String matricula) {
		return (buscaCamion(matricula)!=null);
	}
	
	public Furgoneta buscaFurgoneta(String matricula) {
		for(Furgoneta cualquierFurgo: listaFurgonetas) {
			if(cualquierFurgo.getMatricula().equals(matricula)) {
				return cualquierFurgo;
			}
		}
		return null;
	}
	
	
	
}
