package taller3.televisores;

public class Control {
    //atributo
    TV tv;

    //definicion de metodos get y set del atributo tv

    public void setTv(TV tv){
        this.tv = tv;
    }

    public TV getTv(){
        return tv;
    }

    //definicion de metodos turnOff y turnOn

    public void turnOn(){
        this.tv.turnOn();
    }

    public void turnOff(){
        this.tv.turnOff();
    }

    //definicion de metodos canalUp y canalDown
    public void canalUp(){
        this.tv.canalUp();
    }
    public void canalDown(){
        this.tv.canalDown();
    }

    //definicion de los metodos volumenUp y volumenDown
    public void volumenUp(){
        this.tv.volumenUp();
    }
    public void volumenDown(){
        this.tv.volumenDown();
    }

    //definicion de los metodos setCanal y setVolumen

    public void setCanal(int canal){
        this.tv.setCanal(canal);
    }
    public void setVolumen(int volumen){
        this.tv.setVolumen(volumen);
    }

    //definicion de metodo enlazar

    public void enlazar(TV tv){
        this.tv = tv;
        this.tv.setControl(this);
    }

}