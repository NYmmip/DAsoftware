package model.gestion;

import model.empresa.Empresa;
import model.usuarios.Postulante;
import model.usuarios.Psicologo;

import java.util.HashMap;

public class UserFactory {
    private HashMap <String, Object> usuarios = new HashMap<>();

    public void createEmpresa(String user, String pass, String nit, String nombre, String direccion, String descripcion){
        Empresa temp = new Empresa();
        temp.setUser(user);
        temp.setPassword(pass);
        temp.setNit(nit);
        temp.setNombre(nombre);
        temp.setDireccion(direccion);
        temp.setDescripcion(descripcion);
        this.usuarios.put(user,temp);
    }

    public void createPostulante(String user, String password, String nombre, String documento){
        Postulante temp = new Postulante();
        temp.setUser(user);
        temp.setPassword(password);
        temp.setNombre(nombre);
        temp.setDocumento(documento);
        this.usuarios.put(user,temp);
    }

    public void createPsicologo(String user, String password, String nombre, String documento){
        Psicologo temp = new Psicologo();
        temp.setUser(user);
        temp.setUser(password);
        temp.setNombre(nombre);
        temp.setDocumento(documento);
        this.usuarios.put(user,temp);
    }

    public Object getUser(String user){
        return this.usuarios.get(user);
    }

    public void setUser(String user, Object adapter){
        if(adapter.getClass().equals(this.usuarios.get(user).getClass())){
            this.usuarios.replace(user,adapter);
        }
    }

    public void removeUser(String user){
        this.usuarios.remove(user);
    }

    public HashMap<String, Object> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(HashMap<String, Object> usuarios) {
        this.usuarios = usuarios;
    }
}
