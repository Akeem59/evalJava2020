package akeem;

import java.util.ArrayList;
import java.util.List;

import akeem.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }
    static String vehiculeAutorise[] = {"XX-777-ZZ", "DD-222-VV", "AA-444-ZC"};
    static String vehiculeStationne[] = {"XX-777-ZZ"};
    

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

    Vehicule v1 = new Vehicule("XX-222-DD", false);
    Vehicule v2 = new Vehicule("YY-232-DD", false);
    Vehicule v3 = new Vehicule("FF-445-DD", false);
    Vehicule v4 = new Vehicule("DD-122-DD", false);
    Vehicule v5 = new Vehicule("CC-377-DD", false);

    List<Vehicule> listVehicule = new ArrayList<Vehicule>();
    listVehicule.add(v1);
    listVehicule.add(v2);
    listVehicule.add(v3);
    listVehicule.add(v4);
    listVehicule.add(v5);

    Vehicule essai = new Vehicule("dd-549-jj", false);
    // System.out.println(listVehicule);

    List<Vehicule> listVehiculeStationne = new ArrayList<Vehicule>();
    quiEstGare(listVehicule);

    System.out.println(listVehicule.contains(v1));          
    }

    public static void quiEstGare(List listVehicule) {
      
        for (int i = 0; i < listVehicule.size(); i++) {
            System.out.println(listVehicule.get(i));

            Vehicule essai = listVehicule.get(i);
            //pas moyen de récupérer un véhicule en bouclant sur la liste de Véhicules !!!!
            // ne peut pas convertir un objet en Vehicule, mais l'objet est un véhicule!!

        }
    }
   

}
