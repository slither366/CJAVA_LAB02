package model.service.impl;

import java.util.List;
import model.Departamentos;
import model.dao.DepartamentosDao;
import model.dao.impl.DepartamentosDaoImpl;
import model.service.DepartamentosService;

public class DepartamentosServiceImpl implements DepartamentosService {

    DepartamentosDao dao = new DepartamentosDaoImpl();

    @Override
    public List<Departamentos> todos() {
        List<Departamentos> lista = dao.todos();

        return lista;
    }

}
