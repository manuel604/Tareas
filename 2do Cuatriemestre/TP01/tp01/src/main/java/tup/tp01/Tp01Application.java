package tup.tp01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Tp01Application {

	public static void main(String[] args) {
		SpringApplication.run(Tp01Application.class, args);
	
	}
	@GetMapping("array") 
	public String hola(){

		String respuesta = "";

		String[] entradas = { "1", "2", "2", "7" };

		int cuantos = entradas.length;

		respuesta += "Cantidad de entradas " + entradas.length;

		for (int i = 0; i < cuantos; i++) {
			respuesta += "<br> entrada[" + i + "]: " + entradas[i];
		}

		return respuesta;
	}

	@GetMapping("geo")
		String geo(){
			String[][] geo = new String[4][4];
			geo[0][0] = "Argentina";
			geo[0][1] = "CABA";
			geo[0][2] = "Rufino";
			geo[0][3] = "VT";

			geo[1][0] = "Brasil";
			geo[1][1] = "Rio";
			geo[1][2] = "Brasilia";
			geo[1][3] = "Sao Paulo";

			geo[2][0] = "Uruguay";
			geo[2][1] = "Punta del este";
			geo[2][2] = "Montevideo";
			geo[2][3] = "Colonia";

			geo[3][0] = "Chile";
			geo[3][1] = "Santiago";
			geo[3][2] = "Antofagasta";
			geo[3][3] = "Viña del Mar";
			
			String lista = "Geo<br>";
			for(int pais = 0; pais< 4; pais++){
				lista += geo[pais][0] += "<br>";
				for(int ciudad = 0; ciudad<3 ; ciudad++){	
				}
			}
			return lista;
		}
	

}

