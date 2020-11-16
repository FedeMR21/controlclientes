package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Producto;

public interface ProductoService {
    
    public List<Producto> listarProductos();
    
    public void guardar(Producto producto);
    
    public void eliminar(Producto producto);
    
    public Producto encontrarProducto(Producto producto);
}