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
import dao.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class MeyrVendasDAO extends AbstractDAO {

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

     
        MeyrVendas venda = (MeyrVendas) object;

        if (venda.getMeyrIdVenda() != 0) {

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

    MeyrVendas venda = (MeyrVendas) object;
    MeyrVendas vendaBanco = (MeyrVendas) session.get(MeyrVendas.class, venda.getMeyrIdVenda());
    if (vendaBanco != null) {
        session.delete(vendaBanco);
    }

    session.getTransaction().commit();
    }

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendas.class);
        criteria.add(Restrictions.eq("meyrIdVenda", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.isEmpty() ? null : lista.get(0);
    }

    @Override
    public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendas.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }

    public static void main(String[] args) {
        MeyrVendasDAO meyrVendasDAO = new MeyrVendasDAO() {};
        meyrVendasDAO.listAll();
        System.out.println("rodou");
    }
}