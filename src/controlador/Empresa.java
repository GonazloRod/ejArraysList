package controlador;

import java.util.ArrayList;
import modelo.Categoria;
import modelo.Usuario;

public class Empresa {
    ArrayList <Usuario> usuarios;
    ArrayList <Categoria> categorias;

    public Empresa() {
        usuarios = new ArrayList<>();
        categorias = new ArrayList<>();
    }
    
    public void anadir(){
        usuarios.add(new Usuario("pepe","pepe"));
        usuarios.add(new Usuario("ana","pepe"));
        categorias.add(new Categoria("1","Deportes"));
        categorias.add(new Categoria("2","Política"));
        categorias.add(new Categoria("3","Economía"));

    }
    
    
}
