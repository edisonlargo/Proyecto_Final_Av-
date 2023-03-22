package co.edu.uniquindio.proyecto.Entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Map;

@Entity
@Getter
@Setter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@NoArgsConstructor
public class Producto implements Serializable {
    @Id
    @EqualsAndHashCode.Include
    private String CodigoProducto;
    private String nombre;
    private String Descripcion;
    private String precio;
    @Enumerated(EnumType.STRING)
    private Estado_producto disponibilidad;
    private String fecha_limite;
    @ElementCollection
    private Map<String, String> categoria;

    private String comentario;

    public Producto(String codigoProducto, String nombre, String descripcion, String precio, String fecha_limite, String comentario) {
        CodigoProducto = codigoProducto;
        this.nombre = nombre;
        Descripcion = descripcion;
        this.precio = precio;
        this.fecha_limite = fecha_limite;
        this.comentario = comentario;
    }
}
