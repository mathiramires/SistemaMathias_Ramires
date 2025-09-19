/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

import java.util.Date;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Mathias Eduardo
 */
public class Util {
    public static void habilitar(boolean valor,JComponent... componentes){
        for (int i = 0; i < componentes.length; i++) {
            componentes[i].setEnabled(valor);
            
        }
    } public static void limpar(JComponent ... componentes){
            for (int i = 0; i < componentes.length; i++) {
                if(componentes[i] instanceof JTextField){
              ((JTextField) componentes[i]).setText("");
                }
                if(componentes[i] instanceof JComboBox){
                    ((JComboBox) componentes[i]).setSelectedIndex(-1);
                }
                
            }
        
    }
    public static void mensagem(String cad){
    JOptionPane.showMessageDialog(null,cad);
    }
    public static boolean perguntar(String cad){
    JOptionPane.showConfirmDialog(null, cad);
    return true;
    }
    public static int strToInt(String cad) {
        return Integer.valueOf(cad);
        }
    public static String intToStr(int num) {
        return String.valueOf(num);
    }
    public static double strToDuble(String cad){
    return 0;
    }
    public static String doubleToStr(double num){
    return "";
    }
    public static Date strToDate(String cad){
    return null;
    }
    public static String dateToStr(Date data){
    return "";
    }
}
