import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args){

        //Ejercicio practica 02
        Avion avion = new Avion("Avion", 90.50F,  50);
        Helicoptero helicoptero = new Helicoptero("Helicoptero", "Verde", "FH-150");
        Superman superman = new Superman("Superman", "Clark Kent", "SuperHeroe");
        Ovni ovni = new Ovni("Ovni", "Alfa Centauri CB56", 7);

        avion.aterrizado();
        helicoptero.aterrizado();
        superman.aterrizado();
        ovni.aterrizado();

        //Ejercicio practica 03
        TreeSet<Cheque> chequeTree = new TreeSet<>(Comparator.comparing(Cheque::getTitular).thenComparing(Cheque::getBanco));
        chequeTree.add(new Cheque("Banco Santander", 1500.10F, "Robeto Bolaño"));
        chequeTree.add(new Cheque("Banco Bci", 2500.50F, "Kvothe de Arliden"));
        chequeTree.add(new Cheque("Banco BICE", 4865.25F, "Hans Castorp"));
        chequeTree.add(new Cheque("Banco Itau", 10.25F, "Guy Montag"));

        for (Cheque cheque: chequeTree) {
            System.out.println(cheque);
        }
        
    }

}