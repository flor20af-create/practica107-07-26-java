package practica.model;

public class Motocicleta extends Vehiculo {
   
    public Motocicleta(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo la motocicleta...");
    }
   
    public void hacerCaballito() {
        System.out.println("Haciendo un caballito con la motocicleta...");
    }
    
}
