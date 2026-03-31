package proyecto2.demo.Controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
import proyecto2.demo.Modelo.Pelicula;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@RestController
@RequestMapping("/peliculas")
public class ControladorPelicula {
    
    private List<Pelicula> listadepeliculas = new ArrayList<>();

    @GetMapping
    public List<Pelicula> obtenerTodos() {
        return listadepeliculas;
    }

    @PostMapping
    public Pelicula agregar(@RequestBody Pelicula pelicula){
        listadepeliculas.add(pelicula);
        return pelicula;
        
    }
    
}
