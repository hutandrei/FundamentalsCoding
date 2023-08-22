package com.exercise.curs5.poezii;

public class Poem {
    private Autor autor;
    private int nrStrofe;

    public void setAutor(Autor autor) {
        this.autor = new Autor(autor.getPrenume(), autor.getNationalitate());
    }

    public void setNrStrofe(int nrStrofe) {
        this.nrStrofe = nrStrofe;
    }

    public int getNrStrofe() {
        return nrStrofe;
    }

    public Autor getAutor() {
        return autor;
    }

    public void modificaAutor(){
        autor.setPrenume("Altprenume");
    }
}
