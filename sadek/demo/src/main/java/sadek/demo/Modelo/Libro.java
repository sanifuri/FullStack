package sadek.demo.Modelo;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private double precio;
}