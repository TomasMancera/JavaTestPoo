public class Piloto {
    private String nombre;
    private int numCompe;
    private double peso;

    public Piloto(String nom,int nComp,double kg){
        this.nombre = nom;
        this.numCompe = nComp;
        this.peso = kg;

    }

    public String toString(){
        return "Nombre piloto: " + this.nombre + "\n" + "Numero de competicion: " + this.numCompe + "\n" + "Peso: " + this.peso;
    }



}
