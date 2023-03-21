/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva2_13_figuras_abstractas;

/**
 *
 * @author invitado
 */
public class Circulo extends Figura{
        
    private double radio;
    
    /*
    public Circulo() {
        this.radio = 0;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }*/
    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    
    @Override
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }
    
    @Override
    public double calcularPerimetro(){
        return Math.PI*(radio*2);
    }
    
    
        @Override
    public String toString(){
        //no estamos invocando al metdo sobreescrito de la clase, lo reemplazamos de la superclase
        String cade="Datos circulo:\n"
                +"Area: "+calcularArea()+"\n"+
                "Perimetro: "+calcularPerimetro();
        
        return cade;
    }
}
