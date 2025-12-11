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
import bean.MeyrRemedios;
import dao.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public  class MeyrRemediosDAO extends AbstractDAO {

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
        Criteria criteria = session.createCriteria(MeyrRemedios.class);
        criteria.add(Restrictions.eq("meyr_idRemedio", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }
        @Override
        public ArrayList listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrRemedios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
        }
        public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrRemedios.class);
        criteria.add(Restrictions.like("meyrNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listValor(double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrRemedios.class);
        criteria.add(Restrictions.ge("meyrPrecoVenda", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listNomeValor(String nome, double valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrRemedios.class);
        criteria.add(Restrictions.like("meyrNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("meyrPrecoVenda", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
