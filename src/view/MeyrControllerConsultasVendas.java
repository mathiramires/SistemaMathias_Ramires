package view;

import bean.MeyrVendas;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MeyrControllerConsultasVendas extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
        this.fireTableDataChanged(); 
    }

    @Override
    public int getRowCount() {
        return lstProdutos == null ? 0 : lstProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 2; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MeyrVendas meyrVendas = (MeyrVendas) lstProdutos.get(rowIndex);

        switch (columnIndex) {
            case 0:
                return meyrVendas.getMeyrIdVenda();
            case 1:
                return meyrVendas.getMeyrTotalVenda();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return "Código";
            case 1:
                return "Total da Venda";
        }

        return "";
    }
}
