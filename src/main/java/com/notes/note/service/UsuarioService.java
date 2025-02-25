package com.notes.note.service;

import com.notes.note.models.Usuario;
import com.notes.note.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obtenerTodos(){
        return usuarioRepository.findAll();
    }
}
