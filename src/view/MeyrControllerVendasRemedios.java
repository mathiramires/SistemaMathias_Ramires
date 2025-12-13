package view;

import bean.MeyrVendasRemedios;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

public class MeyrControllerVendasRemedios extends AbstractTableModel {

    private List<MeyrVendasRemedios> lista = new ArrayList<>();

    public void setList(List<MeyrVendasRemedios> lista) {
        this.lista = lista;
        fireTableDataChanged();
    }

    public MeyrVendasRemedios getBean(int row) {
        return lista.get(row);
    }

    public void addBean(MeyrVendasRemedios bean) {
        lista.add(bean);
        fireTableDataChanged();
    }

    public void updateBean(int row, MeyrVendasRemedios bean) {
        lista.set(row, bean);
        fireTableRowsUpdated(row, row);
    }

    public void removeBean(int row) {
        lista.remove(row);
        fireTableDataChanged();
    }

    public List<MeyrVendasRemedios> getList() {
        return lista;
    }

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int row, int col) {
        MeyrVendasRemedios m = lista.get(row);

        switch (col) {
            case 0:
                return m.getMeyrRemedios().getMeyrNome();
            case 1:
                return m.getMeyrQuantidade();
            case 2:
                return m.getMeyrPrecoUnitario();
            case 3:
                return m.getMeyrQuantidade() * m.getMeyrPrecoUnitario();
        }
        return null;
    }

    @Override
    public String getColumnName(int col) {
        switch (col) {
            case 0:
                return "Remédio";
            case 1:
                return "Qtd";
            case 2:
                return "Valor Unit.";
            case 3:
                return "Total";
        }
        return "";
    }
}
