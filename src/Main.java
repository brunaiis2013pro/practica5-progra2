import pojos.*;

import java.util.Calendar;

public class Main {
    public static void main(String[] args){
        //producto

        Producto producto = new Producto("B001","Teclado retroiluminado");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tINFORDATA");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println(producto);

        //Alquilable
        Alquilable alquilable = new Alquilable("A005","Monitor 19",10.5);
        System.out.println(alquilable);

        //Tecnologico
        Empresa empresa = new Empresa("Dell","Av. Sprinfield",2000);
        Empresa empresa2 = new Empresa("Thosiba","Av. Shervibil",1000);
        Tecnologico tecnologico = new Tecnologico("T100","Vostro 100","USA", Calendar.getInstance().getTime(), empresa);
        System.out.println(tecnologico);

        //Monitor
        Monitor monitor = new Monitor("M111","Monitor 21",12.5,"FULL 4K");
        System.out.println(monitor);

        //Cpu
        Cpu cpu = new Cpu("H200","RYZEN","China",Calendar.getInstance().getTime(),empresa2,10);
        System.out.println(cpu);

        //Cliente
        Cliente cliente = new Cliente("1000",193203,"Av.Sprinfield #123");

        //Impresora
        Impresora impresora = new Impresora("99BA","EPSON",10);

        //Venta
        Venta venta = new Venta(cliente,impresora,Calendar.getInstance().getTime());
        System.out.println(venta);

        //Servicio
        Servicio servicio = new Servicio(cliente,impresora,"actualizacion de software",150);
        System.out.println(servicio);

        //Proveedor
        Proveedor proveedor = new Proveedor("551150","Calle San Andres #21");

        //Compra
        Compra compra = new Compra(proveedor,producto,Calendar.getInstance().getTime(), 15);
        System.out.println(compra);
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");



    }
}
