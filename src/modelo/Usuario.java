package modelo;

import java.util.Objects;

public class Usuario {
    String login;
    String contra;

    public Usuario(String login, String contra) {
        this.login = login;
        this.contra = contra;
    }

    public String getLogin() {
        return login;
    }

    public String getContra() {
        return contra;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.login);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.login, other.login);
    }
    
    
}
