package pe.edu.tecsup.app.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class ProductoServiceTest {

    @Autowired
    private ProductoService productoService;

    @Test
    void findAll() {

        try {
            var productos = this.productoService.findAll();

            for (var producto : productos) {
                log.info(producto.toString());
            }

            // Validaciones
            assertNotNull(productos);  // que la lista no sea nula
            assertFalse(productos.isEmpty()); // que la lista no esté vacía
            //assertEquals(5, productos.size());

        } catch (Exception e) {
            fail(e.getMessage());
        }

    }


}