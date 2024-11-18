package taller3.televisores;

class Marca {
    //Atributo nombre
    String nombre;

    //Constructor de Marca
    public Marca(String nom) {
        nombre = nom;
    }

    //Metodos get() y set()
    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nom){
        this.nombre = nom;
    }

    
}