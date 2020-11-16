package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Pedido;

public interface PedidoService {

    public List<Pedido> listarPedidos();
    
    public void guardar(Pedido pedido);
    
    public void eliminar(Pedido pedido);
    
    public Pedido encontrarPedido(Pedido pedido);
    
}
