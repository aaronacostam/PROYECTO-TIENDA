package Tienda;
//import java.util.Random;

public class Producto {
	private double codigo;
    private float IVA;
    public float precio;
    private String nombreProducto;
    

    public Producto() {}

    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    

    public void setIVA(float IVA) {
        this.IVA = IVA;
    }  
    
    public float getIVA() {
        return IVA;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public double codigoProducto(){
        codigo = (double)Math.floor(Math.random()*10000000);
        return codigo;
    }
    
    public float precioTotal(){
        float total = ((getPrecio()*getIVA())+getPrecio());
        return total;
    }
    /*
    public float precioProducto(){
        Random in = new Random();
        int precio;
        precio = in.nextInt(11);
        return (float)precio;
    }
    */

}
