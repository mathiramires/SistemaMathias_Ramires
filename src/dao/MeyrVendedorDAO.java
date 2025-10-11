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
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import bean.MeyrVendedor;
import dao.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public class MeyrVendedorDAO extends AbstractDAO {

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
        session.update(object);
        session.getTransaction().commit();
    }

    @Override
    public void delete(Object object) {
        session.beginTransaction();
        session.flush();
        session.clear();
        session.delete(object);
        session.getTransaction().commit();
    }

    /**
     *
     * @param codigo
     * @return
     */
        @Override
        public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendedor.class);
        criteria.add(Restrictions.eq("meyr_idCliente", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }
        @Override
        public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrVendedor.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
        }

    }


