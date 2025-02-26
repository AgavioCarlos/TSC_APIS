package com.notes.note.models;

import java.time.LocalDateTime;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity // Marca esta clase como una entidad JPA
@Table(name = "usuarios") // Mapea esta entidad a la tabla "notas"
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Auto-incremental para MySQL
    @Column(name = "id_usuario")
    private Integer idUsuario;

    @Column(nullable = false, length = 50) // Longitud máxima para username
    private String username;

    @Column(nullable = false, unique = true, length = 100) // Email debe ser único
    private String email;

    @Column(nullable = false, length = 255) // Contraseña hash
    private String password;

    @Column(name = "foto_perfil", length = 255) // Foto de perfil
    private String fotoPerfil;

    @Column(name = "fecha_registro", nullable = false, updatable = false)
    private LocalDateTime fechaRegistro;

}

