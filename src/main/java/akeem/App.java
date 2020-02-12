package akeem;

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
        System.out.println("Hello the World!");
        quiEstGare();

    Vehicule v1 = new Vehicule("XX-222-DD", false);
    System.out.println(v1.getImmatriculation());
    


               
    }
    public static String quiEstGare() {
      
        for (int i = 0; i < vehiculeAutorise.length; i++) {

            System.out.println("hhhh");            
        }
        return "listV";
    }

}
