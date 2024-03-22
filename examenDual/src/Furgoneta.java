package com.politecnico.coches;

public class Furgoneta extends Vehiculo {
	int carga, asientos;

	public Furgoneta(String matricula, String modelo, String marca, String motor, int kms_recorridos, float precio_dia, String conductor, int dias_alquilado,int carga, int asientos) {
		super(matricula, modelo, marca, motor, kms_recorridos, precio_dia, conductor, dias_alquilado);
		this.carga = carga;
		this.asientos = asientos;
	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}
	
}
