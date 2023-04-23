package com.P3.CinemaProj.salas;

public enum TiposSalas {
    SALA_COMUM(1,1),
    SALA_3D(2,1.2),
    SALA_XD(3,1.3),
    SALA_XD_3D(4,1.4);


    int salaID;
    double multiplicador;
    TiposSalas(int salaID, double multiplicador) {
        this.salaID = salaID;
        this.multiplicador = multiplicador;
    }
    public int getSalaID() {
        return salaID;
    }
    public void setSalaID(int salaID) {
        this.salaID = salaID;
    }
    public double getMultiplicador() {
        return multiplicador;
    }
    public void setMultiplicador(double multiplicador) {
        this.multiplicador = multiplicador;
    }
}
