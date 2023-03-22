package co.edu.uniquindio.proyecto.Entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.pl.NIP;

import java.io.Serializable;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Usuarios implements Serializable {
    @Id
    private String codigo;
    private String nombre;
    @ElementCollection
    private  Map<String, String> apellido;
    @ElementCollection
    private Map<String, String> telefono;
    private String direccion;
    private String contraseña;
    @Enumerated(EnumType.STRING)
    private Tipo_usuario tipo;

    public Usuarios(String codigo, String nombre, String direccion, String contraseña) {
        this.codigo = codigo;
        this.nombre = nombre;

        this.direccion = direccion;
        this.contraseña = contraseña;
    }
}
