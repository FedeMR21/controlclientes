package mx.com.gm.dao;

import mx.com.gm.domain.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoDao extends JpaRepository<Producto, Long>{
    
}
