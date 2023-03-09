public class Main {
    public static void main(String[] args) {
        Auto ferrari = new Auto("ferrari",11000,"SF1000",599);
        Piloto pilotoUno = new Piloto("Carlos sainz",55,70);
        Piloto pilotoDos = new Piloto("Charles Leclerc",16,69);
        ferrari.agregarPiloto(pilotoUno);
        ferrari.reeemplazarPiloto(pilotoDos);
        System.out.println(ferrari.toString());


    }
}