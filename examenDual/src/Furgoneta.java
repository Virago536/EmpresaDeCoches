package com.politecnico.coches;

public class Furgoneta extends Vehiculo{

    float cargaMaxima;
    int plazaAsientos;

    public Furgon(String matricula, String modelo, String marca, float kmRecorridos, float precioDia, String tipoMotor, float cargaMaxima, int plazaAsientos) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
        this.cargaMaxima = cargaMaxima;
        this.plazaAsientos = plazaAsientos;

    }

    public float getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(float cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public int getPlazaAsientos() {
        return plazaAsientos;
    }

    public void setPlazaAsientos(int plazaAsientos) {
        this.plazaAsientos = plazaAsientos;
    }
}
