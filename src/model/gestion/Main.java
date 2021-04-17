package model.gestion;

import model.convocatoria.ConvocatoriaBase;
import model.convocatoria.ConvocatoriaDinamica;
import model.empresa.Empresa;
import model.usuarios.Postulante;

public class Main {

    public static void main(String[] args) {
        UserFactory userFactory= new UserFactory();
        userFactory.createPostulante("user1","pass1","nombre1","documento1");
        userFactory.createEmpresa("emp1","pass2","nit1","empn1","direccion1","descripcion1");
        Empresa o = ((Empresa) userFactory.getUser("emp1"));
        System.out.println(o.getUser());


    }


}
