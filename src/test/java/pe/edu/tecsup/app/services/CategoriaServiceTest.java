package pe.edu.tecsup.app.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.tecsup.app.entities.Categoria;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CategoriaServiceTest {

    @Autowired
    private CategoriaService categoriaService;

    @Test
    void findAll() {

        List<Categoria> categorias = this.categoriaService.findAll();

        for (Categoria categoria : categorias) {
            System.out.println(categoria);
        }

    }
}