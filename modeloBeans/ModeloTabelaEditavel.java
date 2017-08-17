package modeloBeans;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class ModeloTabelaEditavel extends AbstractTableModel{
    
    private ArrayList linhas = null;
    private String[] colunas = null;
    
    public ModeloTabelaEditavel(ArrayList lin, String[] col){
        setLinhas(lin);
        setColunas(col);  
    }
   
    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }
    
    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    public int getColumnCount(){
        return colunas.length;
    }
    
    public int getRowCount(){
        return linhas.size();
    }
    
    public String getColumnName(int numCol){
        return colunas[numCol];
    }

    public Object getValueAt(int numLin, int numCol){
        Object[] linha = (Object[])getLinhas().get(numLin);
        return linha[numCol];
    }
    
    public boolean isCellEditable(int row, int col){
        return true;
    }
    
    public void setValueAt(Object value, int numLin, int numCol) {
        Object[] aux = (Object[])getLinhas().get(numLin);
        aux[numCol] = String.valueOf(value).toUpperCase();
        if(!getLinhas().contains(aux)){
            getLinhas().add(numLin, aux);
            fireTableCellUpdated(numLin, numCol);
        }
    }
}
