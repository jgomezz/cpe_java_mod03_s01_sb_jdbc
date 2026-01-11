package pe.edu.tecsup.app.services;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import pe.edu.tecsup.app.repositories.ProductoRepository;

@Slf4j
@Service
@AllArgsConstructor
public class ProductoServiceImpl implements ProductoService{

    private final ProductoRepository repository;

}
