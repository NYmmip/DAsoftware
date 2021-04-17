package model.convocatoria;

import model.empresa.Composite;

public class Main {
    public static void main(String[] args){
        ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase("Nombre1","nombre","cargo"), "descripcion atributo", "Atributo");
        //
        ConvocatoriaDinamica c = new ConvocatoriaDinamica(convocatoria,"asdsaddas","adaddadda");
        c = new ConvocatoriaDinamica(c,"deesssss","adadadad");
        for (String x:c.getAtributo()) {
            System.out.println(x);
        }
        //System.out.println(c.getAtributo());
    }

}
