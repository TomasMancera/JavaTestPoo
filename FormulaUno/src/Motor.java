public class Motor {

    private String fabricante;
    private int revMin;

    public Motor(String fabri,int revMin){
        this.fabricante = fabri;
        this.revMin = revMin;
        setRevMin(revMin);

    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getRevMin() {
        return revMin;
    }

    public void setRevMin(int revMin) {
        if(this.revMin < 8400){
            System.err.println("Las revoluciones no pueden estar por debajo de 8400");
            this.revMin = 8400;

        }
        if(this.revMin > 10500){
            System.err.println("Las revoluciones no pueden estar por encima de 10500");
            this.revMin = 10500;

        }else{
            this.revMin = revMin;
        }

    }

    public String toString(){
        return "El motor tiene las siguientes especificaciones: " + "\n" + "Fabricante: " + getFabricante() + "\n" +  "revoluciones por minuto: " + getRevMin();


    }

}


