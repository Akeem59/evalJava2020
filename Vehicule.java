package akeem;

public class Vehicule {

    private String immatriculation;
    private Boolean isStationne;

    public Function getImmatriculation(){
        return this.immatriculation;
    }

    public Function getIsStationne(){
        return this.isStationne;
    }

    public void setImmatriculation(String immatriculation)
    {
      this.immatriculation = immatriculation;
    }

    public void setIsStationne(Boolean isStationne)
    {
      this.isStationne = isStationne;
    }

    // constructeur
  public Vehicule(String immatriculation, Boolean isStationne){
    System.out.println("Création d'une voiture !");          
    this.immatriculation = immatriculation;
    this.isStationne = isStationne;
  }
}