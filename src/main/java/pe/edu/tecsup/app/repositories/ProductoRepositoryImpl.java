package pe.edu.tecsup.app.repositories;

import lombok.AllArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
@AllArgsConstructor
public class ProductoRepositoryImpl implements ProductoRepository{

    private final JdbcTemplate jdbcTemplate;

}
