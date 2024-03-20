package com.politecnico.coches;

public class Coche extends Vehiculo{

    int plazasMaximas;
    int numPuertas;
    float volumenMaletero;
    String tipo;

    public Coche(String matricula, String modelo, String marca, float kmRecorridos, float precioDia,String tipoMotor, int plazasMaximas, int numPuertas, float volumenMaletero, String tipo) {
        super(matricula, modelo, marca, kmRecorridos, precioDia, tipoMotor);
        this.plazasMaximas = plazasMaximas;
        this.numPuertas = numPuertas;
        this.volumenMaletero = volumenMaletero;
        this.tipo = tipo;
    }

    public int getPlazasMaximas() {
        return plazasMaximas;
    }

    public void setPlazasMaximas(int plazasMaximas) {
        this.plazasMaximas = plazasMaximas;
    }

    public int getNumPuertas() {
        return numPuertas;
    }

    public void setNumPuertas(int numPuertas) {
        this.numPuertas = numPuertas;
    }

    public float getVolumenMaletero() {
        return volumenMaletero;
    }

    public void setVolumenMaletero(float volumenMaletero) {
        this.volumenMaletero = volumenMaletero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
