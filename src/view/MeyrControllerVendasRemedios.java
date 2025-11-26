/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.MeyrRemedios;
import bean.MeyrVendasRemedios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u1845853
 */
public class MeyrControllerVendasRemedios extends AbstractTableModel {

    private List lstMeyrVendasRemedios;

    public void setList(List lstMeyrVendasRemedios) {
        this.lstMeyrVendasRemedios = lstMeyrVendasRemedios;
        this.fireTableDataChanged();
    }

    public MeyrVendasRemedios getBean(int rowIndex) {
        return (MeyrVendasRemedios) lstMeyrVendasRemedios.get(rowIndex);
    }

    public void addBean(MeyrVendasRemedios meyrVendasRemedios) {
        this.lstMeyrVendasRemedios.add(meyrVendasRemedios);
        this.fireTableDataChanged();
    }

    public void removeBean(int rowIndex) {
        lstMeyrVendasRemedios.remove(rowIndex);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return lstMeyrVendasRemedios.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        MeyrVendasRemedios meyrVendasRemedios
                = (MeyrVendasRemedios) lstMeyrVendasRemedios.get(rowIndex);

        if (columnIndex == 0) {
            return meyrVendasRemedios.getMeyrRemedios().getMeyrIdRemedio();
        } else if (columnIndex == 1) {
            return meyrVendasRemedios.getMeyrRemedios().getMeyrNome();
        } else if (columnIndex == 2) {
            return meyrVendasRemedios.getMeyrQuantidade();
        } else if (columnIndex == 3) {
            return meyrVendasRemedios.getMeyrPrecoUnitario();
        } else if (columnIndex == 4) {
            return meyrVendasRemedios.getMeyrQuantidade()
                    * meyrVendasRemedios.getMeyrPrecoUnitario();
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
            return "Quantidade";
        } else if (columnIndex == 3) {
            return "Valor Unitário";
        } else if (columnIndex == 4) {
            return "Total";
        }
        return "";
    }
}
