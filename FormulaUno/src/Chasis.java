public class Chasis {
    private String referencia;
    private int kilogramos;

    public Chasis(String referencia,int kilogramos){
        setKilogramos(kilogramos);
        this.referencia = referencia;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public int getKilogramos() {
        return kilogramos;
    }

    public void setKilogramos(int kilogramos) {
        if(this.kilogramos < 600){
            System.err.println("Los kilogramos del Carro no pueden ser menores a 600");
            this.kilogramos = 600;

        }else{
            this.kilogramos = kilogramos;
        }

    }

    public String toString(){
            return "Referencia chasis: " + this.referencia + "\n" + "Kilogramos chasis: " + this.kilogramos;

        }






}

