package es.ies.puerto.herencia;

public class Usuario extends Persona{
    private String email;
    private String password;
    

    public Usuario() {
    }

    public Usuario(String nombre, String idnetificador, String email, String pasword){
        super(nombre, idnetificador);
        this.email = email;
        this.password = pasword;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }
    
    @Override
    public String toString() {
        return
            super.toString() +
            ", email= " + getEmail() + 
            ", password= " + getPassword();
    }

}
