package Tools;

import Entities.Projet;
import Entities.ProjetMobile;
import Entities.ProjetWeb;

import javax.swing.table.AbstractTableModel;
import java.util.ArrayList;

public class ModelJTable extends AbstractTableModel
{
    private String[] colonnes;
    private Object[][] lignes;
    @Override
    public int getRowCount() {
        return lignes.length;
    }

    @Override
    public int getColumnCount() {
        return colonnes.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return lignes[rowIndex][columnIndex];
    }

    @Override
    public String getColumnName(int column) {
        return colonnes[column];
    }

    public void loadDatasProjets(ArrayList<Projet> uneListe) {

        // A vous de jouer
        /*colonnes=new String[]{
                "idProjet", "duree", "tauxHoraire", "nomProjet", "nbEcrans", "nbPages", "responsive"
        };
        lignes=new Object[uneListe.size()][6];
        int i = 0;
        for (Projet prj:uneListe){
            lignes[i][0]=prj.idProjet();
            lignes[i][1]=prj.nomProjet();
            lignes[i][2]=prj.duree();
            lignes[i][3]=prj.tauxHoraire();
            if (prj instanceof ProjetMobile){
                lignes[i][4]=((ProjetMobile))
            }
        }*/

    }
}
