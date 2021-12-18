package com.example.Ejerciciossesiones101112.controller;


import com.example.Ejerciciossesiones101112.entities.Laptop;
import com.example.Ejerciciossesiones101112.repository.Laptoprepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class LaptopControler {
    //Atributos
    private Laptoprepository laptoprepository;

    //Constructor
    public LaptopControler(Laptoprepository laptoprepository) {
        this.laptoprepository = laptoprepository;
    }

    //Métodos
    /*
     * Busca todos los Laptop en la base de datos
     */
    @ApiOperation("Busca todos los Laptop en la base de datos")
    @GetMapping("/ListaLaptop")
    public List<Laptop> listaLaptop(){
        return laptoprepository.findAll();
    }

    /*
     * Busca un Laptop por Id en la base de datos
     */
    @ApiOperation("Busca un Laptop por Id en la base de datos")
    @GetMapping("/ListaLaptop/{id}")
    public ResponseEntity<Laptop> listaPorId(@ApiParam("Pasa una variable de tipo Long") @PathVariable Long id){
        Optional<Laptop> laptopOpt=laptoprepository.findById(id);
        if (laptopOpt.isPresent())
            return ResponseEntity.ok(laptopOpt.get());
        else
            return ResponseEntity.notFound().build();
    }

    /*
     * Crea un Laptop en la base de datos
     */
    @ApiOperation("Crea un Laptop en la base de datos")

    @PostMapping("/Laptop")
    public Laptop crear(@RequestBody Laptop laptop, @RequestHeader HttpHeaders headers){
        System.out.println(headers.get("User-Agent"));
        return laptoprepository.save(laptop);
    }

    /*
     * Actualiza un Laptop en la base de datos
     */
    @ApiOperation("Actualiza un Laptop en la base de datos")
    @PutMapping("/Laptop")
    public ResponseEntity<Laptop>  actualiza (@RequestBody Laptop laptop){
        Laptop result=laptoprepository.save(laptop);
        return ResponseEntity.ok(result);
    }

    /*
     * Borra un Laptop por Id en la base de datos
     */
    @ApiOperation("Borra un Laptop por Id en la base de datos")
    @DeleteMapping("/ListaLaptop/{id}")
    public ResponseEntity<Laptop>BorraPorId(@PathVariable Long id){
        laptoprepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }

    /*
     * Borra todos los Laptop de la base de datos
     */
    @ApiOperation("Borra todos los Laptop en la base de datos")
    @DeleteMapping("/ListaLaptop")
    public ResponseEntity<Laptop>Borratodos(){
        laptoprepository.deleteAll();
        return ResponseEntity.noContent().build();
    }
}