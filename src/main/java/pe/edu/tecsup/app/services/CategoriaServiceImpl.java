package pe.edu.tecsup.app.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.app.entities.Categoria;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public List<Categoria> findAll() {

        return this.categoriaService.findAll();
    }
}
