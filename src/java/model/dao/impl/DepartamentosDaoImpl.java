package model.dao.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Departamentos;
import model.HibernateUtil;
import model.dao.DepartamentosDao;
import org.hibernate.Hibernate;
import org.hibernate.Query;
import org.hibernate.Session;

public class DepartamentosDaoImpl implements DepartamentosDao {

    @Override
    public List<Departamentos> todos() {
        List<Departamentos> lista = null;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();
        String sql1 = "from Departamentos";

        Query q1 = session.createQuery(sql1);
        Iterator it1 = q1.iterate();

        lista = new ArrayList<>();
        while (it1.hasNext()) {
            Departamentos dep1 = (Departamentos) it1.next();
            lista.add(dep1);
        }
        //Averiguar donde la session debe cerrar....
        //session.close();
        return lista;
    }

}
