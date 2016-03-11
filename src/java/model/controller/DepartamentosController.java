
package model.controller;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import model.Departamentos;
import model.service.DepartamentosService;
import model.service.impl.DepartamentosServiceImpl;

/**
 *
 * @author dflores
 */
@Named(value = "departamentosController")
@SessionScoped
public class DepartamentosController implements Serializable {

    DepartamentosService servicio = new DepartamentosServiceImpl();
    private List<Departamentos> items;
    
    
    @PostConstruct
    public void Init(){
        //setItems(servicio.todos());
        items = servicio.todos();
    }
    
    public DepartamentosController() {
    }

    /**
     * @return the items
     */
    public List<Departamentos> getItems() {
        return items;
    }

    /**
     * @param items the items to set
     */
    public void setItems(List<Departamentos> items) {
        this.items = items;
    }
    
}
