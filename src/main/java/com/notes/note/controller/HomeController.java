package com.notes.note.controller;

import com.notes.note.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import com.notes.note.service.UsuarioService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {

    @Autowired
    private UsuarioService  usuarioService;

    @GetMapping("/home")
    public String home(Model model){
        List<Usuario> usuarios = usuarioService.obtenerTodos();
        model.addAttribute("usuarios", usuarios);
        System.out.println("Usuarios obtenidos: " + usuarios);
        return "index";
    }

}














