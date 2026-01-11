package pe.edu.tecsup.app.repositories;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.app.entities.Categoria;

import java.util.List;

@Repository
public class CategoriaRepositoryImpl  implements CategoriaRepository{

    @Override
    public List<Categoria> findAll() {

        List<Categoria> categorias = List.of(
                Categoria.builder().id(1L).nombre("Tecnología").orden(1).build(),
                Categoria.builder().id(2L).nombre("Hogar").orden(2).build(),
                Categoria.builder().id(3L).nombre("Deportes").orden(3).build()
        );


        return categorias;
    }

}
