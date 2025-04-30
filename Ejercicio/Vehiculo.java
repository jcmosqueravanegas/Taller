import java.util.ArrayList;
import java.util.List;

public class Vehiculo {
    String nombre;
    int cantidad;
    double porcentajeGasolina;
    double porcentajeDiesel;
    double porcentajeGas;

    final double CO2_GASOLINA = 0.192;
    final double CO2_DIESEL = 0.244;
    final double CO2_GAS = 0.166;
    final double KM_ANUAL = 20000; 

    public Vehiculo(String nombre, int cantidad, double porcentajeGasolina, double porcentajeDiesel, double porcentajeGas) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.porcentajeGasolina = porcentajeGasolina / 100.0; 
        this.porcentajeDiesel = porcentajeDiesel / 100.0;
        this.porcentajeGas = porcentajeGas / 100.0;
    }

    public double calcularCO2() {
        double co2Gasolina = cantidad * KM_ANUAL * porcentajeGasolina * CO2_GASOLINA;
        double co2Diesel = cantidad * KM_ANUAL * porcentajeDiesel * CO2_DIESEL;
        double co2Gas = cantidad * KM_ANUAL * porcentajeGas * CO2_GAS;
        return (co2Gasolina + co2Diesel + co2Gas) / 1000.0; 
    }

    public void imprimirCO2() {
        System.out.println("El vehículo " + nombre + " emite " + calcularCO2() + " toneladas de CO2 al año.");
    }

    public static void main(String[] args) {
        List<Vehiculo> vehiculos = new ArrayList<>();
        vehiculos.add(new Vehiculo("camiones livianos", 400000, 35, 40, 25));
        vehiculos.add(new Vehiculo("camiones medianos", 280000, 25, 50, 25));
        vehiculos.add(new Vehiculo("camiones pesados", 380000, 10, 80, 10));
        vehiculos.add(new Vehiculo("tractocamiones", 1150000, 5, 90, 5));
        vehiculos.add(new Vehiculo("volquetas", 936000, 40, 40, 20));

        double totalCO2 = 0;

        System.out.println("Emisiones de CO2 por tipo de vehículo:");
        for (Vehiculo vehiculo : vehiculos) {
            vehiculo.imprimirCO2();
            totalCO2 += vehiculo.calcularCO2();
        }
        System.out.println("Total de emisiones de CO2: " + totalCO2 + " toneladas al año.");
    }
}