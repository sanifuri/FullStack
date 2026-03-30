package sadek.demo.Controlador;

import org.springframework.web.bind.annotation.*;

import sadek.demo.Modelo.Libro;

import java.util.*;

@RestController
@RequestMapping("/libros")
public class LibroControlador {

    private List<Libro> libros = new ArrayList<>();

    @GetMapping
    public List<Libro> getAll() {
        return libros;
    }

    @GetMapping("/{id}")
    public Libro getById(@PathVariable String id) {
        return libros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    @PostMapping
    public Libro crear(@RequestBody Libro libro) {
        libros.add(libro);
        return libro;
    }

    @DeleteMapping("/{id}")
    public String eliminar(@PathVariable String id) {
        libros.removeIf(l -> l.getId().equals(id));
        return "Eliminado libro con id: " + id;
    }
}
