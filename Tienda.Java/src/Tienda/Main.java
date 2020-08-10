package Tienda;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	 public static Fecha f1 = new Fecha();
	    public static Scanner in = new Scanner(System.in);
	    
	    public static void definirFecha(){
	        f1.setDia(15);
	        f1.setMes(7);
	        f1.setAnio(2020);
	    }
	    
	    public static void Adelantar(){
	        int diaActual = f1.getDia();
	        int mesActual = f1.getMes();
	        int anioActual = f1.getAnio();
	        
	        Calendar oFecha = Calendar.getInstance();
	        oFecha.set(anioActual, mesActual, diaActual);
	        
	       
	        oFecha.add(Calendar.DAY_OF_MONTH, f1.getDia());
	        oFecha.add(Calendar.MONTH, f1.getMes());
	        oFecha.add(Calendar.YEAR, f1.getAnio());
	        
	        f1.setAnio(oFecha.get(Calendar.YEAR));
	        f1.setMes(oFecha.get(Calendar.MONTH));
	        f1.setDia(oFecha.get(Calendar.DAY_OF_MONTH)+5);
	        
	        
	    }
	    
	    public static String imprimirFecha(){
	        return "\nDia: "+f1.getDia()+
	                "\nMes: "+f1.getMes()+
	                "\nAnio: "+f1.getAnio();
	    }
	    
	    public static void main(String[] args) {
	        
	        Producto p1 = new Producto();
	        
	        LocalDate date = LocalDate.of(2020, 8, 10);
	        LocalDate newDate = date.plusDays(10);
	        
	        
	        char opc = 0;
	        String respuesta;
	        p1.setIVA(0.09f);
	        p1.setPrecio(10.0f);
	        do{
	            System.out.print("\nIngrese el nombre del producto: "); p1.setNombreProducto(in.next());
	            
	            System.out.println("\n\nGenerando código del producto...");
	            System.out.println("\nEl código del "+p1.getNombreProducto()+" es: "+p1.codigoProducto());
	            
	            System.out.println("La fecha de elaboración del "+p1.getNombreProducto()+" es: ");
	             
	            if(opc == 's' || opc == 'S'){
	                System.out.println(newDate);
	            }
	            else{
	                System.out.println(date);
	            }
	            
	            System.out.println("\n\nEl IVA según la decisión del gobierno es: "+p1.getIVA()+ "%");
	            
	            System.out.println("\n\nMostrando precio: ");
	            System.out.println("\nPrecio del "+p1.getNombreProducto() +" sin IVA es: "+p1.getPrecio() + "$");
	            System.out.println("\nEl precio total de "+p1.getNombreProducto()+" es (incluyendo el IVA): "+p1.precioTotal() + "$");
	            
	            System.out.print("\n\nDesea usted comprar este producto? "+ "(si/no)"); respuesta = in.next();
	            
	            if("si".equals(respuesta)){
	                System.out.println("\nGracias por su compra");
	            }
	            else{
	                System.out.println("\nUsted ha decisido no comprar este producto ");
	            }
	            
	            System.out.print("\n\nDesea algún otro producto? (si/no): "); opc = in.next().charAt(0);
	        }while(opc == 's' || opc == 'S');
	        
	    }
	    

}
