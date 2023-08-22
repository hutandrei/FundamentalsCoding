package com.exercise.curs5.poezii;

public class Autor {
    private String prenume;
    private String nationalitate;

    public Autor(String prenume, String nationalitate) {
        this.prenume = prenume;
        this.nationalitate = nationalitate;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume){
        this.prenume=prenume;
    }

    public String getNationalitate() {
        return nationalitate;
    }
}
