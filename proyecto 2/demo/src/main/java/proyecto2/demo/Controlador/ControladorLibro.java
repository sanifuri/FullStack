package proyecto2.demo.Controlador;

import java.util.*;
import org.springframework.web.bind.annotation.*;
import proyecto2.demo.Modelo.Libro;

@RestController
@RequestMapping("/libros")
public class ControladorLibro {
    private List<Libro> libros = new ArrayList<>();

    @GetMapping
    public List<Libro> obtenerTodos() {
        return libros;
    }

    @PostMapping
    public Libro agregar(@RequestBody Libro libro) {
        libros.add(libro);
        return libro;
    }
    @DeleteMapping("/{codigoBarras}")
    public String eliminar(@PathVariable Integer codigoBarras) {
        libros.removeIf(libro -> libro.getCodigoBarras().equals(codigoBarras));
        return "Libro eliminado";
    }
}