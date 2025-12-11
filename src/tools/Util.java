package tools;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Util {

    public static void habilitar(boolean valor, JComponent... componentes) {
        for (JComponent c : componentes) {
            c.setEnabled(valor);
        }
    }

    public static void limpar(JComponent... componentes) {
        for (JComponent c : componentes) {
            if (c instanceof JTextField) {
                ((JTextField) c).setText("");
            } else if (c instanceof JComboBox) {
                ((JComboBox) c).setSelectedIndex(-1);
            }
        }
    }

    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }

    public static boolean perguntar(String cad) {
        int r = JOptionPane.showConfirmDialog(null, cad, "Confirmação", JOptionPane.YES_NO_OPTION);
        return r == JOptionPane.YES_OPTION;
    }

    public static int strToInt(String cad) {
        if (cad == null || cad.trim().equals("")) {
            return 0;
        }
        return Integer.parseInt(cad);
    }

    public static String intToStr(int num) {
        return String.valueOf(num);
    }

    public static double strToDuble(String cad) {
        if (cad == null || cad.trim().equals("")) {
            return 0.0;
        }
        cad = cad.replace(",", ".");
        return Double.parseDouble(cad);
    }

    public static String doubleToStr(double num) {
        DecimalFormat df = new DecimalFormat("#0.00");
        return df.format(num);
    }

    public static Date strToDate(String cad) {
        try {
            return new SimpleDateFormat("dd/MM/yyyy").parse(cad);
        } catch (Exception e) {
            return null;
        }
    }

    public static String dateToStr(Date data) {
        if (data == null) return "";
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }

   public static double strToDouble(String valor) {
    if (valor == null || valor.trim().isEmpty()) {
        return 0.0;
    }
    try {
        valor = valor.replace(",", ".").trim();
        return Double.parseDouble(valor);
    } catch (NumberFormatException e) {
        return 0.0;
    }
}

}
