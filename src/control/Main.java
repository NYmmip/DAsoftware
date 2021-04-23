package control;

import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;

public class Main {
	//hola amigo :B

    public static void main(String[] args) throws NoSuchAlgorithmException, IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, InvalidKeyException {
        Operaciones operaciones = Operaciones.crearIFacade();
        Proxy proxy = new Proxy("user","user");
        ;
        //System.out.println(operaciones.decrypt(proxy.encrypt("como estas",operaciones.performOperation())));
        //operaciones.KeyPairGenerator();



        //UserFactory userFactory= new UserFactory();
        //userFactory.createPostulante("user1","pass1","nombre1","documento1");
        //userFactory.createEmpresa("emp1","pass2","nit1","empn1","direccion1","descripcion1");
        /*for (String c:operaciones.getInfoEmpresas()) {
            System.out.println(c);
        }*/

        //System.out.println(operaciones.getUsuario("emp1","emp1")[3]);;
    }


}
