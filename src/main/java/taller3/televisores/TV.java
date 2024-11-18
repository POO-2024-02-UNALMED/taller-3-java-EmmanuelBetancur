package taller3.televisores;

public class TV {
    //atributos
    Marca marca;
    int canal;
    int precio;
    boolean estado;
    int volumen;
    Control control;
    public static int numTV;

    //constructor de clase
    public TV (Marca marca, boolean estado){
        this.marca = marca;
        this.estado = estado;
        this.canal = 1;
        this.precio = 500;
        this.volumen = 1; 
        TV.numTV++;
    }

    //definicion de metodos get y set de marca, canal, precio, volumen y control

    public void setMarca(Marca marca){
        this.marca = marca;
    }
    public Marca getMarca(){
        return marca;
    }
    public void setCanal(int canal){
        if (canal <= 120 && canal >= 1){
            this.canal = canal;
        }
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
        if (volumen <= 7 && volumen >= 0){
            this.volumen = volumen;
        }
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

    public void turnOn(){
        this.estado = true;
    }

    public void turnOff(){
        this.estado = false;
    }

    //definicion del metodo getEstado

    public boolean getEstado(){
        return estado;
    }

    //definicion de get y set de numTV

    static public int getNumTV(){
        return numTV;
    }

    static public void setNumTV(int numTV){
        TV.numTV = numTV;
    }

    //definicion de los metodos canalUp y canalDown

    public void canalUp(){
        if (this.canal < 120 && this.estado == true){
            ++this.canal;
        }         
    }

    public void canalDown(){
        if (this.canal > 1 && this.estado == true) {
            --this.canal;
        } 
    }

    //definicion de los metodos volumenUp y volumenDown

     public void volumenUp(){
        if (this.volumen < 7 && this.estado == true){
            ++this.volumen;
        }
    }

    public void volumenDown(){
        if (this.volumen > 0 && this.estado == true){
            --this.volumen;
        }
    }

}