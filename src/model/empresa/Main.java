package model.empresa;

import model.convocatoria.ConvocatoriaBase;
import model.convocatoria.ConvocatoriaDinamica;

public class Main {

    public static void main(String[] args) {


        Empresa em1 = new Empresa("123","231","12345767", "Empresa1", "Direccion1","deasdhsadhjkhjfhjfhjkfhjkhjkdfjfjk");

        ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase("Nombre2","nombre","cargo"), "descripcion atributo", "Atributo");
        //convocatoria.addComponente(new ConvocatoriaDinamica(null,"desc1","atrib"));

        em1.addComponente(convocatoria);
        ConvocatoriaDinamica convocatori = new ConvocatoriaDinamica(new ConvocatoriaBase("Nombre1","nombre","cargo"), "descripcion atributo", "Atributo");
        //convocatoria.addComponente(new ConvocatoriaDinamica(null,"desc1","atrib"));
        em1.addComponente(convocatori);

        //Empresa em2 = new Empresa("347967", "Empresa2", "Direccion2", "dsadssssdsd");
        //em1.addComponente(em2);

        //Empresa em3 = new Empresa("45767", "Empresa3", "Direccion3");


        //Empresa em4 = new Empresa("8125767", "Empresa4", "Direccion4");


        //em3.addComponente(em4);
        //em2.addComponente(em3);
       // em1.addComponente(em2);

        System.out.println("Test 1");
        System.out.println(em1.verEsta());

        //System.out.println("\nTest 2");
        //System.out.println(em3.verDatos());

    }


}
