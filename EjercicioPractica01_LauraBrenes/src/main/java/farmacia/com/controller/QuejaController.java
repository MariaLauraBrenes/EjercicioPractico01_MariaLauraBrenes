/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package farmacia.com.controller;

import farmacia.com.domain.Queja;
import farmacia.com.Service.QuejaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
 
@Controller
@RequestMapping("/quejas")
public class QuejaController {
 
    @Autowired
    private QuejaService quejaService;
 
    @PostMapping("/submit")
    public String submitQueja(
            @RequestParam("nombre") String nombre,
            @RequestParam("apellido") String apellido,
            @RequestParam("telefono") String telefono,
            @RequestParam("email") String email,
            @RequestParam("direccion") String direccion,
            RedirectAttributes redirectAttributes) {
        Queja queja = new Queja(nombre, apellido, telefono, email, direccion);
        quejaService.save(queja);
        redirectAttributes.addFlashAttribute("Enviado", "Gracias por su aporte");
        return "redirect:/quejas";
    }

}
