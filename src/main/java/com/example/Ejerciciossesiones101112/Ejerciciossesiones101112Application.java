package com.example.Ejerciciossesiones101112;


import com.example.Ejerciciossesiones101112.entities.Laptop;
import com.example.Ejerciciossesiones101112.repository.Laptoprepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Ejerciciossesiones101112Application {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejerciciossesiones101112Application.class,args);
		Laptoprepository repository =context.getBean(Laptoprepository.class);
		//Crear Laptop
		Laptop laptop1=new Laptop(null,"Dell", "XPS","Procesador Intel® Core™ i5-1135G7 de 11.ª generación",
				"Memoria integrada LPDDR4x de 8 GB a 4267 MHz",
				"SSD de 256 GB","Gráficos Intel® Iris Xe",6);
		repository.save(laptop1);

		Laptop laptop2=new Laptop(null,"Dell", "XPS2","Procesador Intel® Core™ i5-1135G7 de 11.ª generación",
				"Memoria integrada LPDDR4x de 16 GB a 4267 MHz",
				"SSD de 512 GB","Gráficos Intel® Iris Xe",6);
		repository.save(laptop2);

		System.out.println("Num libros en base de datos: " + repository.findAll().size());
	}
}
