package proyecto2.demo.Controlador;

import java.util.*;
import proyecto2.demo.Modelo.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app")
public class ControladorApp {
    private List<App> listaDeApp = new ArrayList<>();
    
    @GetMapping
    public List<App> obtenerTodos() {
        return listaDeApp;
    }
    @PostMapping
    public App agregar(@RequestBody App app){
        listaDeApp.add(app);
        return app;
    }
}
