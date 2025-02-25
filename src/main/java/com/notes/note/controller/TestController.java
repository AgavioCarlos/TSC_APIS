package com.notes.note.controller;

import com.notes.note.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/test")
    public String testDatabase() {
        long count = usuarioRepository.count();
        return "Conexión exitosa. Número de usuarios: " + count;
    }
}
