
package mx.com.gm.dao;

import mx.com.gm.domain.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidoDao extends JpaRepository<Pedido, Long>{
    
}
