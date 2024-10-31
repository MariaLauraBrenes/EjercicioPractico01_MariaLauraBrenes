/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.controller;

import farmacia.com.domain.Categoria;
import farmacia.com.Service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@Slf4j

@RequestMapping("/categorias")
public class CategoriaController {
 
    @Autowired
    private CategoriaService categoriaService;
 
    @GetMapping("/listas")
    public String listarCategorias(Model model) {
        var categorias = categoriaService.getCategorias();
        model.addAttribute("categorias", categorias);
        return "categorias/listas";
    }
 
    @GetMapping("/modificar/{id}")
    public String editarCategoria(@PathVariable("id") int id, Model model) {
        Categoria categoria = categoriaService.getCategoria(new Categoria(id));
        model.addAttribute("categoria", categoria);
        return "categorias/modificar";
    }
 
    @GetMapping("/eliminar/{id}")
    public String eliminarCategoria(@PathVariable("id") int id) {
        Categoria categoria = new Categoria();
        categoria.setIdCategoria(id);
        categoriaService.delete(categoria);
        return "redirect:/categorias/listas";
    }
 
    @PostMapping("/guardar")
    public String guardarCategoria(Categoria categoria) {
        categoriaService.save(categoria);
        return "redirect:/categorias/listas";
    }
}