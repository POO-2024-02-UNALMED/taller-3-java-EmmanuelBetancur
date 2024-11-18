package taller3.televisores;

class TV {
    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
    public static int numTV;

    TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
    }

    //canal,volumen,precio

    //definicion de metodos get y set de marca, canal, precio, volumen y control

    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int canal){
        this.canal = canal;
    }
    public int getCanal(){
        return canal;
    }
    public void setPrecio(int precio){
        this.precio = precio;
    }
    public int getPrecio(){
        return precio;
    }
    public void setVolumen(int volumen){
        this.volumen = volumen;
    }
    public int getVolumen(){
        return volumen;
    }
    public void setControl(Control control){
        this.control = control;
    }
    public Control getControl(){
        return control;
    }

    //definicion de metodos turnOff y turnOn


}