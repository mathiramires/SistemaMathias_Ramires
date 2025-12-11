package view;

import bean.MeyrVendedor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MeyrControllerConsultaVendedor extends AbstractTableModel {

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
        MeyrVendedor meyrVendedor = (MeyrVendedor) lstProdutos.get(rowIndex);

        if (columnIndex == 0) {
            return meyrVendedor.getMeyrIdVendedor();
        } else if (columnIndex == 1) {
            return meyrVendedor.getMeyrNome();
        } else if (columnIndex == 2) {
            return meyrVendedor.getMeyrCpf();
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
