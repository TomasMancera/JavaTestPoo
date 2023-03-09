import java.util.ArrayList;

public class Auto {
    private Motor motor;
    private Chasis chasis;
    private Piloto piloto;
    int contador = 0;

    public Auto(String fabricante,int revMin,String ref,int pesoChasis){
        this.motor = new Motor(fabricante,revMin);
        this.chasis = new Chasis(ref,pesoChasis);

    }

    public void agregarPiloto(Piloto agregar) {
        if(this.contador < 1){
            this.piloto = agregar;
            this.contador=1;

        }else if(this.contador == 1){
            System.err.println("Ya existe un piloto en el auto");

        }

        }


    public void reeemplazarPiloto(Piloto reempla) {
        if(this.contador == 1){
            this.piloto = reempla;
            System.out.println("\n" + "Piloto reemplazado exitosamente!");

        }

    }


    public String toString () {
        String salida = "Auto: " + "\n" + "Motor: " + motor.toString() + "\n";
        salida += chasis.toString() + "\n";
        salida += "Datos piloto:  \n" + this.piloto;
        return salida;

    }


}

