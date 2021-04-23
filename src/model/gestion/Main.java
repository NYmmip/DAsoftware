package model.gestion;

import model.convocatoria.ConvocatoriaBase;
import model.convocatoria.ConvocatoriaDinamica;
import model.empresa.Empresa;
import model.usuarios.Postulante;

import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class Main {
	//hola amigo :B

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Operaciones operaciones = Operaciones.crearIFacade();
        //operaciones.KeyPairGenerator();
        operaciones.registerUser("emp1","pass2","nit1","Empresa1","direccion1","descripcion1");
        operaciones.registerUser("emp2","pass1","nit1","Empresa2","direccion1","descripcion1");
        operaciones.vincularEmpresas("emp1","emp2");
        operaciones.crearConvocatoria("emp1","1234","nombre1","cargo1","descripcion1","");
        operaciones.crearConvocatoria("emp2","4332","nombre2","cargo2","descripcion1","Otras cosas");
        for (String c:operaciones.getAllConvocatorias()) {
            System.out.println(c);
        }

        //UserFactory userFactory= new UserFactory();
        //userFactory.createPostulante("user1","pass1","nombre1","documento1");
        //userFactory.createEmpresa("emp1","pass2","nit1","empn1","direccion1","descripcion1");
        /*for (String c:operaciones.getInfoEmpresas()) {
            System.out.println(c);
        }*/

        //System.out.println(operaciones.getUsuario("emp1","emp1")[3]);;
    }


}
