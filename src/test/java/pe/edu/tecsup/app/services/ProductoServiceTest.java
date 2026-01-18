package pe.edu.tecsup.app.services;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import pe.edu.tecsup.app.entities.Producto;

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

    @Test
    void findById() {

        Long ID_PROD_SEARCH = 1L;
        String EXPECTED_NOMBRE = "Intel Core I7";


        try {
            var producto = this.productoService.findById(ID_PROD_SEARCH);
            log.info(producto.toString());

            // Validaciones
            assertNotNull(producto);  // que el producto no sea nulo
            assertEquals(EXPECTED_NOMBRE, producto.getNombre());

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void findByName() {
        // Datos de entrada
        String NOMBRE_SEARCH = "Kingstone";
        try {
            var productos =
                    this.productoService.findByName(NOMBRE_SEARCH);

            for (var producto : productos) {
                log.info(producto.toString());
            }

            // Validaciones
            assertNotNull(productos);  // que la lista no sea nula
            assertFalse(productos.isEmpty()); // que la lista no esté vacía
            //assertEquals(2, productos.size());

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    @Test
    void save() {
        try {

            long totalAntes
                    = this.productoService.findAll().stream().count();
            log.info("Total antes de insertar: {}", totalAntes);

            var producto = Producto.builder()
                    .categorias_id(1L) // Categoria de procesadores
                    .nombre("GTX-5070")
                    .descripcion("GPU para gaming de alta gama")
                    .precio(1500.00)
                    .stock(10)
                    .estado(1)  // Estado ACTIVO
                    .build();

            this.productoService.save(producto);
            long totalDespues
                    = this.productoService.findAll().stream().count();

            log.info("Total después de insertar: {}", totalDespues);

            assertEquals(1, totalDespues - totalAntes);

        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}