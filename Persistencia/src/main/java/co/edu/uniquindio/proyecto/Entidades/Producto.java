package co.edu.uniquindio.proyecto.Entidades;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import java.io.Serializable;
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
    @Enumerated(EnumType.STRING);
    private Estado_producto disponibilidad;
    private String fecha_limite;
    private String categoria;

    private String comentario;

    public Producto(String codigoProducto, String nombre, String descripcion, String precio, String fecha_limite, String categoria, String comentario) {
        CodigoProducto = codigoProducto;
        this.nombre = nombre;
        Descripcion = descripcion;
        this.precio = precio;
        this.fecha_limite = fecha_limite;
        this.categoria = categoria;
        this.comentario = comentario;
    }
}
