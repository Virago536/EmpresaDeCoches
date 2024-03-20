package com.politecnico.coches;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

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
	
	
}
