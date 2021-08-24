package mx.uacm.edu.incidencias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDiscoveryClient
@SpringBootApplication
public class ServicioPersonasApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServicioPersonasApplication.class, args);
	}

}
