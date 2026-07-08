package practica.app;

import java.util.ArrayList;

import practica.model.Automovil;
import practica.model.Motocicleta;
import practica.model.Vehiculo;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hola!");
        Automovil automovil = new Automovil("Toyota", "Camry", 2020);
        Motocicleta motocicleta = new Motocicleta("Honda", "CBR", 2021);
        automovil.mostrarInformacion();
        automovil.conducir();
        automovil.reproducirMusica();

        motocicleta.conducir();
        motocicleta.hacerCaballito();
        
        Vehiculo vehiculo1 = new Automovil("Ford", "Mustang", 2022);
        Vehiculo vehiculo2 = new Motocicleta("Yamaha", "R1", 2023);

        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();
        listaVehiculos.add(vehiculo1);
        listaVehiculos.add(vehiculo2);

        for (Vehiculo vehiculo : listaVehiculos) {
            vehiculo.mostrarInformacion();
            vehiculo.encender();
            vehiculo.conducir();
            System.out.println();
        }
    }

}
