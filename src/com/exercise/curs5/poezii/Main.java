package com.exercise.curs5.poezii;

/**
 * Scrieti o aplicatie care sa aiba urmatoarele clase
 *  -autor cu fieldurile private: prenume si nationalitatea, ambele stringuri
 *   - poem cu fieldurile private: autor de tip autor si numar de strofe -int reprezentand nr de strofe dintr-un poem
 *    - main cu metoda main in care:
 *    *cream 3 instante ale clasei autor careia le completam fieldurile folosind fie constructorul, fie setari
 *    *cream 3 instante ale clase poem, carora le compeltam fieldurile fie cu constuctorul, fie cu setterul si le stocam intr-un array
 *    *afisare prenumele autorului care a scris cea mai lunga poezie.
 */
public class Main {
    public static void main(String[] args) {

        Autor a1 = new Autor("Eminescu","roman");
        Autor a2 = new Autor("Hugo", "francez");
        Autor a3 = new Autor("Dickens", "englez");


        Poem poem1 = new Poem();
            poem1.setAutor(a1);
            poem1.setNrStrofe(4);
            poem1.modificaAutor();
        System.out.println(poem1.getAutor().getPrenume()+ " "+ a1.getPrenume());

        Poem poem2 = new Poem();
            poem2.setAutor(a2);
            poem2.setNrStrofe(11);

        Poem poem3 = new Poem();
            poem3.setAutor(a3);
            poem3.setNrStrofe(7);

        Poem[] poezii = {poem1,poem2,poem3};

        Poem max=poezii[0];
        for (Poem element : poezii) {
            if (element.getNrStrofe()>max.getNrStrofe()){
                max=element;
            }
          }
        String nume = max.getAutor().getPrenume();
        System.out.printf("Poezia cea mai lunga are %d strofe si a fost scrisa de %s",max.getNrStrofe(), nume);
    }
}
