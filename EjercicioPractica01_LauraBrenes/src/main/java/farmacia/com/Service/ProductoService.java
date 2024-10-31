/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package farmacia.com.Service;

import farmacia.com.domain.Producto;
import java.util.List;

public interface ProductoService {
   
    public List<Producto> getProductos();
    
   
    public Producto getProducto(Producto producto);
    
   
    public void save(Producto producto);
    

    public void delete(Producto producto);
    }
 