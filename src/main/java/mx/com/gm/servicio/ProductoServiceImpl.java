package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.ProductoDao;
import mx.com.gm.domain.Producto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {

    @Autowired
    private ProductoDao productoDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Producto> listarProductos() {
        return (List<Producto>) productoDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Producto persona) {
        productoDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Producto persona) {
        productoDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Producto encontrarProducto(Producto producto) {
        return productoDao.findById(producto.getIdProducto()).orElse(null);
    }
}