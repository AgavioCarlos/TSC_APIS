    package com.notes.note.controller;

    import com.notes.note.repository.UsuarioRepository;
    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import com.notes.note.models.Usuario;
    import org.springframework.web.bind.annotation.PathVariable;

    //@RestController
    @Controller  // Usamos @Controller en lugar de @RestController
    public class UsuarioController {

        private final UsuarioRepository usuarioRepository;

        public UsuarioController(UsuarioRepository usuarioRepository){
            this.usuarioRepository = usuarioRepository;
        }
        @GetMapping("/usuarios/{id}")
        public String mostrarUsuario(@PathVariable Integer id, Model model) {
            Usuario usuario = usuarioRepository.findById(id).orElse(null);
            model.addAttribute("usuario", usuario); // Pasamos el usuario al modelo
            return "detalleUsuario"; // Retornamos el nombre del HTML (sin .html)
        }
        @GetMapping("/saludo")
        public String saludo()
        {
            return "saludo";
        }

    }
