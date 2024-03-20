package com.politecnico.coches;

public class Camion extends Vehiculo{

    float cargaMaxima;
    float longitud;

    public Camion(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor, float cargaMaxima, float longitud) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.longitud = longitud;
    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public float getLongitud() {
        return longitud;
    }

    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
}
