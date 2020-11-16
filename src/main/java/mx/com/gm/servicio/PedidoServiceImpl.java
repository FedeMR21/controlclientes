package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PedidoDao;
import mx.com.gm.domain.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PedidoServiceImpl implements PedidoService {

    @Autowired
    private PedidoDao pedidoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Pedido> listarPedidos() {
        return (List<Pedido>) pedidoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Pedido pedido) {
        pedidoDao.save(pedido);
    }

    @Override
    @Transactional
    public void eliminar(Pedido pedido) {
        pedidoDao.delete(pedido);
    }

    @Override
    @Transactional(readOnly = true)
    public Pedido encontrarPedido(Pedido pedido) {
        return pedidoDao.findById(pedido.getIdPedido()).orElse(null);
    }
}