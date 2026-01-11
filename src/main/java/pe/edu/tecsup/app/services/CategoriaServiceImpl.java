package pe.edu.tecsup.app.services;

import org.springframework.stereotype.Service;
import pe.edu.tecsup.app.entities.Categoria;

import java.util.List;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Override
    public List<Categoria> findAll() {
        return List.of();
    }
}
