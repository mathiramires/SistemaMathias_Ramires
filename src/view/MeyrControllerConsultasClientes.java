package view;

import bean.MeyrClientes;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MeyrControllerConsultasClientes extends AbstractTableModel {

    private List lstProdutos;

    public void setList(List lstProdutos) {
        this.lstProdutos = lstProdutos;
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstProdutos.size();
    }

    @Override
    public int getColumnCount() {
        return 3; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MeyrClientes cliente = (MeyrClientes) lstProdutos.get(rowIndex);

        if (columnIndex == 0) {
            return cliente.getMeyrIdCliente();
        } else if (columnIndex == 1) {
            return cliente.getMeyrNome();
        } else if (columnIndex == 2) {
            return cliente.getMeyrRg();
        }

        return "";
    }

    @Override
    public String getColumnName(int columnIndex) {
        if (columnIndex == 0) {
            return "Código";
        } else if (columnIndex == 1) {
            return "Nome";
        } else if (columnIndex == 2) {
            return "RG";
        }

        return "";
    }
}
