/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.Impl;

import farmacia.com.dao.ProductoDao;
import farmacia.com.domain.Producto;
import farmacia.com.Service.ProductoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ProductoServiceImpl implements ProductoService {
    
    @Autowired
    private ProductoDao productoDao;

    @Override
    @Transactional(readOnly=true)
    public List<Producto> getProductos() {
        var lista=productoDao.findAll();
        return lista;
    }
    
    @Override
    @Transactional (readOnly = true)
    public Producto getProducto(Producto producto) {
        return productoDao.findById(producto.getIdMedicamento()).orElse(null);
    }
    @Override
    @Transactional
    public void save(Producto producto) {
         productoDao.save(producto);
    }
    @Override
    @Transactional
    public void delete(Producto producto) {
        productoDao.delete(producto);
    }

}