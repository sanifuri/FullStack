package proyecto2.demo.Controlador;

import java.util.*;
import proyecto2.demo.Modelo.Auto;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auto")
public class ControladorAuto {
    private List<Auto> listaDeAutos = new ArrayList<>(); 

    @GetMapping
    public List<Auto> obtenerTodos() {

        return listaDeAutos;
    }
    @PostMapping
    public Auto agregar(@RequestBody Auto auto){
        listaDeAutos.add(auto);
        return auto;
    } 
    @DeleteMapping("/{anio}")
    public String eliminar(@PathVariable Integer anio){
        listaDeAutos.removeIf(auto -> auto.getAnio().equals(anio));
        return "auto eliminado CTM";
    }
}
