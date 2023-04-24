package Entities;

public class ProjetWeb extends Projet
{
    Object Projet;
    public int nbPages;
    public boolean responsive;
    public ProjetWeb(int nbPages, boolean responsive) {
        this.nbPages = nbPages;
        this.responsive = responsive;
}
