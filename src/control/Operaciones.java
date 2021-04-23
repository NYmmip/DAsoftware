package control;

import model.convocatoria.*;
import model.empresa.Empresa;
import model.usuarios.Adapter;
import model.usuarios.Postulante;
import model.usuarios.Psicologo;

import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.*;
import java.util.ArrayList;
import java.util.Base64;
import java.util.Map;

public class Operaciones implements InterfaceProxy{
    static private Operaciones operaciones = null;
    private UserFactory userFactory;
    private PrivateKey privateKey;

    private Operaciones() {
        this.userFactory = new UserFactory();
        this.registerUser("admin","admin1234","","");
    }

    public static Operaciones crearIFacade() throws NoSuchAlgorithmException {
        if(operaciones == null) {
            operaciones = new Operaciones();
        }
        return operaciones;
    }

    public boolean registerUser(String user, String pass, String nombre, String documento){
        try {
            if(this.getUser(user) == null){
                this.userFactory.createPostulante(user,pass,nombre,documento);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registerUserP(byte[] key,String user, String pass, String nombre, String documento){
        try {
            if(this.getUsuario(key,user) == null){
                this.userFactory.createPsicologo(user,pass,nombre,documento);
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean registerUser(byte[] key,String user, String pass, String nombreEmpresa, String nit, String direccion, String descripcion) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String admin = this.decrypt(key);
        try {
            if(admin.equals("admin")){
                if(this.getUsuario(key,user) == null){
                    this.userFactory.createEmpresa(user,pass,nombreEmpresa,nit,direccion,descripcion);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeUser(byte[] key, String removedUser){
        try {
            String user = this.decrypt(key);
            if(user.equals("admin") || user.equals(removedUser)){
                this.userFactory.removeUser(removedUser);
                return true;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean removeUser(byte[] key){
        try {
            String user = this.decrypt(key);
            this.userFactory.removeUser(this.decrypt(key));
            return true;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUser(byte[] key, String updatedUser,String pass, String nombre, String documento) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            String user = this.decrypt(key);
            if(user.equals("admin") || user.equals(updatedUser)){
                if(this.userFactory.getUser(updatedUser) instanceof Psicologo) {
                    this.userFactory.setUser(updatedUser, new Psicologo(updatedUser, pass, nombre, documento));
                    return true;
                }
                this.userFactory.setUser(updatedUser, new Postulante(updatedUser,pass,nombre,documento));
                return true;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateUser(byte[] key, String updatedUser, String pass, String nombreEmpresa, String nit, String direccion, String descripcion){
        try {
            String user = this.decrypt(key);
            if(user.equals("admin") || user.equals(updatedUser)){
                this.userFactory.setUser(updatedUser, new Empresa(updatedUser,pass,nombreEmpresa,nit, direccion,descripcion));
                return true;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String[] getUsuario(byte[] key, String getUser){
        try {
            String user = decrypt(key);
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
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
    }

    public Adapter getUser(String user){
        return this.userFactory.getUser(user);
    }

    public String[] getInfoEmpresas(){
        String[] temp= new String[this.userFactory.getAllEmpresasUsers().size()];
        for (int i = 0; i< this.userFactory.getAllEmpresasUsers().size(); i++) {
            temp[i] = ((Empresa) this.userFactory.getUser(this.userFactory.getAllEmpresasUsers().get(i))).verSoloEmpresa();
        }
        return temp;
    }

    public boolean vincularEmpresas(String emp1, String emp2){
        try {
            if(this.userFactory.getUser(emp1) == null || this.userFactory.getUser(emp2) == null){
                ((Empresa) this.userFactory.getUser(emp1)).addComponente(((Empresa) this.userFactory.getUser(emp2)));
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean crearConvocatoria(byte[] key, String codigo, String name, String cargo, String descripcion, String otros) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        try {
            String empresa = this.decrypt(key);
            if(this.userFactory.getUser(empresa) != null){
                if(((Empresa) this.userFactory.getUser(empresa)).getIndexConvocatoria(codigo) == -1){
                    ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase(codigo,name,cargo), "descripcion", descripcion);

                    if(otros.length()>1){
                        convocatoria = new ConvocatoriaDinamica(convocatoria,"Mas informacion",otros);
                    }

                    ((Empresa) this.userFactory.getUser(empresa)).addComponente(convocatoria);
                    return true;
                }
                return false;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public ArrayList<String> getConvocatoriasEmpresa(byte[] key) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        String empresa = this.decrypt(key);
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

    public ArrayList<String> getConvocatoriasEmpresa(String empresa) throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
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

    public ArrayList<String> getAllConvocatorias() throws IllegalBlockSizeException, NoSuchPaddingException, BadPaddingException, NoSuchAlgorithmException, InvalidKeyException {
        ArrayList<String> temp = new ArrayList<>();

        for (int i = 0; i<this.userFactory.getAllEmpresasUsers().size(); i++){
            temp.addAll(this.getConvocatoriasEmpresa(this.userFactory.getAllEmpresasUsers().get(i)));
        }

        return temp;
    }

    public boolean removeConvocatoria(byte[] key, String codigo){
        try {
            String empresa = this.decrypt(key);
            if(((Empresa) this.userFactory.getUser(empresa)).getIndexConvocatoria(codigo) != -1){
                ((Empresa) this.userFactory.getUser(empresa)).deleteConvocatoria(codigo);
                return true;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateConvotario(byte[] key, String codigo, String name, String cargo, String descripcion, String otros){
        try {
            String empresa = this.decrypt(key);
            if(((Empresa) this.userFactory.getUser(empresa)).getIndexConvocatoria(codigo) != -1){
                ConvocatoriaDinamica convocatoria = new ConvocatoriaDinamica(new ConvocatoriaBase(codigo,name,cargo), "descripcion", descripcion);
                if(otros.length()>1){
                    convocatoria = new ConvocatoriaDinamica(convocatoria,"Mas informacion",otros);
                }
                ((Empresa) this.userFactory.getUser(empresa)).setConvocatoria(codigo,convocatoria);
                return true;
            }
            return false;
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return false;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return false;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return false;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return false;
        }
    }

    public String tipoUser(byte[] key){
        try {

            if (this.decrypt(key).equals("admin")){
                return "admin";
            }else {
                if (this.userFactory.getUser(this.decrypt(key)) instanceof Empresa)
                    return "Empresa";
                if(this.userFactory.getUser(this.decrypt(key)) instanceof  Postulante)
                    return "Postulante";

                if (this.userFactory.getUser(this.decrypt(key)) instanceof  Psicologo)
                    return "Postulante";
            }


            if (this.userFactory.getUser(this.decrypt(key)) instanceof Empresa)
                return "Empresa";
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
            return null;
        } catch (InvalidKeyException e) {
            e.printStackTrace();
            return null;
        } catch (BadPaddingException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }


    @Override
    public String performOperation() throws NoSuchAlgorithmException {
        KeyPairGenerator keyGen = KeyPairGenerator.getInstance("RSA");
        keyGen.initialize(1024);
        KeyPair pair = keyGen.generateKeyPair();
        this.privateKey = pair.getPrivate();
        return Base64.getEncoder().encodeToString(pair.getPublic().getEncoded());
    }

    private String decrypt(byte[] data) throws IllegalBlockSizeException, InvalidKeyException, BadPaddingException, NoSuchAlgorithmException, NoSuchPaddingException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
        cipher.init(Cipher.DECRYPT_MODE, this.privateKey);
        return new String(cipher.doFinal(data));
    }

    public void addConvocatoriaUsario(byte[] key,String codigo){
        try {
            ((Postulante) this.userFactory.getUser(this.decrypt(key))).addConvocatoria(codigo);
        } catch (IllegalBlockSizeException e) {
            e.printStackTrace();
        } catch (InvalidKeyException e) {
            e.printStackTrace();
        } catch (BadPaddingException e) {
            e.printStackTrace();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        } catch (NoSuchPaddingException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> getAllEmpresaUser(){
        return this.userFactory.getAllEmpresasUsers();
    }
    
    public String getIndexbyNameb(String name){
        for (String c:this.userFactory.getAllEmpresasUsers()) {
            if(((Empresa) this.userFactory.getUser(c)).getNombre().equals(name)){
                return c;
            }
        }
        return null;
    }
}
