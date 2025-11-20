package view;

import bean.MeyrVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MeyrControlerVendas extends AbstractTableModel {
    
    private static List lista;  
    
    public void setList(List lista){
        MeyrControlerVendas.lista = lista;
    }
    
    public static Object getBean(int rowIndex) {
        return lista.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        MeyrVendas vendas = (MeyrVendas) lista.get(rowIndex);
           
        if(columnIndex == 0) return vendas.getMeyrIdVenda();
        if(columnIndex == 1) return vendas.getMeyrClientes();
        if(columnIndex == 2) return vendas.getMeyrVendedor();
        if(columnIndex == 3) return vendas.getMeyrDataVenda();
        if(columnIndex == 4) return vendas.getMeyrTotalVenda();
               
        return "";
    }
      
    @Override
    public String getColumnName(int column) {
        if(column == 0) return "codigo";
        if(column == 1) return "Cliente";
        if(column == 2) return "Vendedor";
        if(column == 3) return "Data";
        if(column == 4) return "Total";
      
        return "";
    }
}
