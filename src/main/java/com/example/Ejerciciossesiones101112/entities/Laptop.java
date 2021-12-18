package com.example.Ejerciciossesiones101112.entities;

import javax.persistence.*;

@Entity
@Table(name="laplops")
public class Laptop {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;
    private String Marca;
    private String Modelo;
    private String Procesador;
    private String Ram;
    private String HD;
    private String Grafica;
    private int Num_celdas;

    public Laptop() {
    }

    public Laptop(Long id, String marca, String modelo, String procesador,
                  String ram, String HD, String grafica, int num_celdas) {
        this.id = id;
        Marca = marca;
        Modelo = modelo;
        Procesador = procesador;
        Ram = ram;
        this.HD = HD;
        Grafica = grafica;
        Num_celdas = num_celdas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public void setModelo(String modelo) {
        Modelo = modelo;
    }

    public String getProcesador() {
        return Procesador;
    }

    public void setProcesador(String procesador) {
        Procesador = procesador;
    }

    public String getRam() {
        return Ram;
    }

    public void setRam(String ram) {
        Ram = ram;
    }

    public String getHD() {
        return HD;
    }

    public void setHD(String HD) {
        this.HD = HD;
    }

    public String getGrafica() {
        return Grafica;
    }

    public void setGrafica(String grafica) {
        Grafica = grafica;
    }

    public int getNum_celdas() {
        return Num_celdas;
    }

    public void setNum_celdas(int num_celdas) {
        Num_celdas = num_celdas;
    }
}