/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import bean.MeyrUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mathias Eduardo
 */
public class MeyrControlerUsuarios extends AbstractTableModel {
    
    List lista; 
    
    public void setList(List lista){
      this.lista = lista;
    }
    
    public Object getBean(int rowIndex){
     return lista.get(rowIndex);
     
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        
           MeyrUsuarios usuarios = (MeyrUsuarios) lista.get(rowIndex);
           
           if(columnIndex == 0) return usuarios.getMeyrIdUsuarios();
           if(columnIndex == 1) return usuarios.getMeyrNome();
           if(columnIndex == 2) return usuarios.getMeyrCpf();
               
                  return "";

    }
      
    public String getColumnName(int column) {
      if(column == 0) return "codigo";
      if(column == 1) return "Nome";
      if(column == 2) return "cpf";
      
      return "";
    }
}
