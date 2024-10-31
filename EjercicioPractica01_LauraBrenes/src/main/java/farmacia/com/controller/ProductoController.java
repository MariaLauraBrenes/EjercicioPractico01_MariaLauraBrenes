/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.controller;

import farmacia.com.domain.Producto;
import farmacia.com.Service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
 
@Controller
@RequestMapping("/productos")
public class ProductoController {
 
    @Autowired
    private ProductoService productoService;
 
 
    @GetMapping("/listas")
    public String listarProductos(Model model) {
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        return "productos/listas";
    }
 
    @GetMapping("/modificar/{id}")
    public String editarProducto(@PathVariable("id") int id, Model model) {
        Producto producto = productoService.getProducto(new Producto(id));
        model.addAttribute("producto", producto);
        return "productos/modificar";
    }
 
    @GetMapping("/eliminar/{id}")
    public String eliminarProducto(@PathVariable("id") int id) {
        Producto producto = new Producto();
        producto.setIdMedicamento(id);
        productoService.delete(producto);
        return "redirect:/productos/listas";
    }
 
    @PostMapping("/guardar")
    public String guardarProducto(Producto producto) {
        productoService.save(producto);
        return "redirect:/productos/listas";
    }
}
