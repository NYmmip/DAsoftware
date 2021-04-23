package model.gestion;

import model.convocatoria.*;
import model.empresa.Empresa;
import model.usuarios.Postulante;
import model.usuarios.Psicologo;

import java.security.*;
import java.util.ArrayList;
import java.util.Map;

public class Operaciones {
    static private Operaciones operaciones = null;
    private UserFactory userFactory;
    private PrivateKey privateKey;
    private PublicKey publicKey;

    //=======HOLA BEBE======//
    private Operaciones() throws NoSuchAlgorithmException {
        this.userFactory = new UserFactory();
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        this.publicKey = pair.getPublic();
    }

    public static Operaciones crearIFacade() throws NoSuchAlgorithmException {
        if(operaciones == null) {
            operaciones = new Operaciones();
        }
        return operaciones;
    }

    public void registerUser(String user, String pass, String nombre, String documento,boolean psicologo){
        if(this.getUsuario(user,user) == null){
            if(psicologo)
                this.userFactory.createPsicologo(user,pass,nombre,documento);
            this.userFactory.createPostulante(user,pass,nombre,documento);
        }
    }

    public void registerUser(String user, String pass, String nombreEmpresa, String nit, String direccion, String descripcion){
        if(this.getUsuario(user,user) == null){
            this.userFactory.createEmpresa(user,pass,nombreEmpresa,nit,direccion,descripcion);
        }
    }

    public void removeUser(String user, String removedUser){
        if(user.equals("admin") || user.equals(removedUser)){
            this.userFactory.removeUser(removedUser);
        }
    }

    public void updateUser(String user, String updatedUser,String pass, String nombre, String documento){
        if(user.equals("admin") || user.equals(updatedUser)){
            if(this.userFactory.getUser(updatedUser) instanceof Psicologo)
                this.userFactory.setUser(updatedUser, new Psicologo(updatedUser,pass,nombre,documento));
            this.userFactory.setUser(updatedUser, new Postulante(updatedUser,pass,nombre,documento));
        }
    }

    public void updateUser(String user, String updatedUser, String pass, String nombreEmpresa, String nit, String direccion, String descripcion){
        if(user.equals("admin") || user.equals(updatedUser)){
            this.userFactory.setUser(updatedUser, new Empresa(updatedUser,pass,nombreEmpresa,nit, direccion,descripcion));
        }
    }

    public String[] getUsuario(String user, String getUser){
        if(user.equals("admin") || user.equals(getUser)){
            if (this.userFactory.getUser(getUser) instanceof Psicologo) {
                String[] datos = new String[4];
                datos[0] = ((Psicologo) this.userFactory.getUser(getUser)).getUser();
                datos[1] = ((Psicologo) this.userFactory.getUser(getUser)).getPassword();
                datos[2] = ((Psicologo) this.userFactory.getUser(getUser)).getNombre();
                datos[2] = ((Psicologo) this.userFactory.getUser(getUser)).getDocumento();
                return datos;
            }else if(this.userFactory.getUser(getUser) instanceof Postulante){
                String[] datos = new String[4];
                datos[0] = ((Postulante) this.userFactory.getUser(getUser)).getUser();
                datos[1] = ((Postulante) this.userFactory.getUser(getUser)).getPassword();
                datos[2] = ((Postulante) this.userFactory.getUser(getUser)).getNombre();
                datos[3] = ((Postulante) this.userFactory.getUser(getUser)).getDocumento();
                return datos;
            }else if(this.userFactory.getUser(getUser) instanceof Empresa){
                String[] datos = new String[6];
                datos[0] = ((Empresa) this.userFactory.getUser(getUser)).getUser();
                datos[1] = ((Empresa) this.userFactory.getUser(getUser)).getPassword();
                datos[2] = ((Empresa) this.userFactory.getUser(getUser)).getNit();
                datos[3] = ((Empresa) this.userFactory.getUser(getUser)).getNombre();
                datos[4] = ((Empresa) this.userFactory.getUser(getUser)).getDireccion();
                datos[5] = ((Empresa) this.userFactory.getUser(getUser)).getDescripcion();
                return datos;
            }
        }
        return null;
    }

    public String[] getInfoEmpresas(){
        String[] temp= new String[this.userFactory.getAllEmpresasUsers().size()];
        for (int i = 0; i< this.userFactory.getAllEmpresasUsers().size(); i++) {
            temp[i] = ((Empresa) this.userFactory.getUser(this.userFactory.getAllEmpresasUsers().get(i))).verSoloEmpresa();
        }
        return temp;
    }

    public void vincularEmpresas(String emp1, String emp2){
        ((Empresa) this.userFactory.getUser(emp1)).addComponente(((Empresa) this.userFactory.getUser(emp2)));
    }

    public void crearConvocatoria(String empresa, String codigo, String name, String cargo, String descripcion, String otros){
        ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase(codigo,name,cargo), "descripcion", descripcion);

        if(otros.length()>1){
            convocatoria = new ConvocatoriaDinamica(convocatoria,"Mas informacion",otros);
        }

        ((Empresa) this.userFactory.getUser(empresa)).addComponente(convocatoria);
    }

    public ArrayList<String> getConvocatoriasEmpresa(String empresa){
        ArrayList<String> temp= new ArrayList<>();
        int i =0;
        while (i<((Empresa) this.userFactory.getUser(empresa)).getComponentes().size()) {
            if(((Empresa) this.userFactory.getUser(empresa)).getConvocatoriaIndex(i) != null ){
                temp.add(((Empresa) this.userFactory.getUser(empresa)).getConvocatoriaIndex(i).verDatos());
            }
            i++;
        }
        return temp;
    }

    public ArrayList<String> getAllConvocatorias(){
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i<this.userFactory.getAllEmpresasUsers().size(); i++){
            temp.addAll(this.getConvocatoriasEmpresa(this.userFactory.getAllEmpresasUsers().get(i)));
        }

        return temp;
    }

    public void removeConvocatoria(String empresa, String codigo){
        ((Empresa) this.userFactory.getUser(empresa)).deleteConvocatoria(codigo);
    }

    public void updateConvotario(String empresa, String codigo, String name, String cargo, String descripcion, String otros){
        ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase(codigo,name,cargo), "descripcion", descripcion);

        if(otros.length()>1){
            convocatoria = new ConvocatoriaDinamica(convocatoria,"Mas informacion",otros);
        }
        ((Empresa) this.userFactory.getUser(empresa)).setConvocatoria(codigo,convocatoria);
    }
}
