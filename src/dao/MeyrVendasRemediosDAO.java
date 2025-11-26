/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author Mathias Eduardo
 */
import bean.MeyrVendas;
import bean.MeyrVendasRemedios;
import dao.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import view.MeyrVendasRememedios;

/**
 *
 * @author u1845853
 */
public class MeyrVendasRemediosDAO extends AbstractDAO {

    @Override
    public void insert(Object object) {
        session.beginTransaction();
        session.save(object);
        session.getTransaction().commit();
    }

    @Override
    public void update(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();

        
        MeyrVendasRemedios venda = (MeyrVendasRemedios) object;

        if (venda.getMeyrIdVendasRemedio()!= 0) {
            session.update(venda);
        } else {
            session.save(venda);
        }

        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
    session.beginTransaction();
    session.flush();
    session.clear();

    MeyrVendasRemedios venda = (MeyrVendasRemedios) object;
    MeyrVendasRemedios vendaBanco = (MeyrVendasRemedios) session.get(MeyrVendasRemedios.class, venda.getMeyrIdVendasRemedio());
    if (vendaBanco != null) {
        session.delete(vendaBanco);
    }

    session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendasRemedios.class);
        criteria.add(Restrictions.eq("meyr_idVenda", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.isEmpty() ? null : lista.get(0);
        
    }
    
    public Object listProutos(MeyrVendas meyrVendas) {
    session.beginTransaction();
    Criteria criteria = session.createCriteria(MeyrVendasRemedios.class); 
    criteria.add(Restrictions.eq("meyrVendas", meyrVendas)); 
    List lista = criteria.list();
    session.getTransaction().commit();        
    return lista;
}


    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendasRemedios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }

    public static void main(String[] args) {
        MeyrVendasRemediosDAO meyrVendasRemediosDAO = new MeyrVendasRemediosDAO() {};
        meyrVendasRemediosDAO.listAll();
        System.out.println("rodou");
    }
}