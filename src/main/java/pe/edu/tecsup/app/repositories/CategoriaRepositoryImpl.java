package pe.edu.tecsup.app.repositories;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import pe.edu.tecsup.app.entities.Categoria;

import java.util.List;

@Slf4j
@Repository
public class CategoriaRepositoryImpl  implements CategoriaRepository{

    @Override
    public List<Categoria> findAll() {

        log.info("findAll categorias - repository");

        List<Categoria> categorias = List.of(
                Categoria.builder().id(1L).nombre("Tecnología").orden(1).build(),
                Categoria.builder().id(2L).nombre("Hogar").orden(2).build(),
                Categoria.builder().id(3L).nombre("Deportes").orden(3).build()
        );


        return categorias;
    }

}
