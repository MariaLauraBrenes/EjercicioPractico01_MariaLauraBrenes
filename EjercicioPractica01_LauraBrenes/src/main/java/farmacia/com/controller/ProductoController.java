/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.controller;

import farmacia.com.domain.Producto;
import farmacia.com.Service.ProductoService;
/*import farmacia.com.impl.FirebaseStorageServiceImpl; */
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
@Slf4j
@RequestMapping("/producto")
public class ProductoController {
    
    @Autowired
    private ProductoService productoService;

    @GetMapping("/listas")
    public String inicio(Model model) {
        var productos = productoService.getProductos();
        model.addAttribute("productos", productos);
        model.addAttribute("totalCategorias", productos.size());
        return "/producto/listas";
    }
    
    /*
    
    @GetMapping("/modifica")
    public String categoriaNuevo(Categoria categoria) {
        return "/categoria/modifica";
    }
    
    
    @GetMapping("/eliminar/{idCategoria}")
    public String categoriaEliminar(Categoria categoria) {
        categoriaService.delete(categoria);
        return "redirect:/categoria/listado";
    }
    @GetMapping("/modificar/{idCategoria}")
    public String categoriaModificar(Categoria categoria, Model model) {
        categoria = categoriaService.getCategoria(categoria);
        model.addAttribute("categoria", categoria);
        return "/categoria/modifica";
    }
 */
}
 
