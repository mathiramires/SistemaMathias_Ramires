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
import bean.MeyrUsuarios;
import dao.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author u1845853
 */
public  class MeyrUsuariosDAO extends AbstractDAO {

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

    @Override
    public Object list(int codigo) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        criteria.add(Restrictions.eq("meyr_idUsuarios", codigo));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista.get(0);
    }

    @Override
    public List listAll() {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        List lista = criteria.list();
        session.getTransaction().commit();
        return (ArrayList) lista;
    }
    
    public boolean listaDoLogin(String user, String pass) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        criteria.add(Restrictions.eq("meyrApelido", user));
        criteria.add(Restrictions.eq("meyrSenha", pass));

        List resultado = criteria.list();
        session.getTransaction().commit();

        return !resultado.isEmpty();
}

    public static void main(String[] args) {
        MeyrUsuariosDAO meyrUsuariosDAO = new MeyrUsuariosDAO() {};
        meyrUsuariosDAO.listAll();
        System.out.println("rodou");
    }
        public Object listNome(String nome) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        criteria.add(Restrictions.like("meyrNome", "%" + nome + "%"));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listValor(String valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        criteria.add(Restrictions.like("meyrCpf", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
    public Object listNomeValor(String nome, String valorUnitario) {
        session.beginTransaction();
        Criteria criteria = session.createCriteria(MeyrUsuarios.class);
        criteria.add(Restrictions.like("meyrNome", "%" + nome + "%"));
        criteria.add(Restrictions.ge("meyrCpf", valorUnitario));
        List lista = criteria.list();
        session.getTransaction().commit();
        return lista;
    }
}
