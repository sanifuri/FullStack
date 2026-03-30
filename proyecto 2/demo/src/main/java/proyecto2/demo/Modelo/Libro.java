package proyecto2.demo.Modelo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private Integer codigoBarras;
    private String titulo;
    private String descripcion;
    private String autor;
    private String editorial;
    private Integer anioEmision;
    private Integer numeroPaginas;
    private Boolean disponibilidad;
}