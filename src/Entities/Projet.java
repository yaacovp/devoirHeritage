package Entities;

public class Projet
{
    public int idProjet;
    public String nomProjet;
    public int duree;
    public double tauxHoraire;

    public Projet(int idProjet, String nomProjet, int duree, double tauxHoraire) {
        this.idProjet = idProjet;
        this.nomProjet = nomProjet;
        this.duree = duree;
        this.tauxHoraire = tauxHoraire;
    }

}
