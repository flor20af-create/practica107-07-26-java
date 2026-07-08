package practica.model;

public class Automovil extends Vehiculo {
   
    public Automovil(String marca, String modelo, int anio) {
        super(marca, modelo, anio);
    }

    @Override
    public void conducir() {
        System.out.println("Conduciendo el automóvil...");
    }

    public void reproducirMusica() {
        System.out.println("Reproduciendo música en el automóvil...");
    }
    
}
