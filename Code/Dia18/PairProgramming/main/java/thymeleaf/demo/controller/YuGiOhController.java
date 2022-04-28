package thymeleaf.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import thymeleaf.demo.model.CartaModel;
import thymeleaf.demo.model.MazoModel;

@Controller

public class YuGiOhController {

	@GetMapping("/ygo")
	public String index (Model modelo) {
		MazoModel unMazo = new MazoModel("exodia");
		unMazo.addCarta(new CartaModel(1, "Exodia, el Prohibido", "Monstruo"));
		unMazo.addCarta(new CartaModel(2, "Brazo Derecho del Prohibido", "Monstruo"));
		unMazo.addCarta(new CartaModel(3, "Brazo Izquierdo del Prohibido", "Monstruo"));
		unMazo.addCarta(new CartaModel(4, "Pierna Derecha del Prohibido", "Monstruo"));
		unMazo.addCarta(new CartaModel(5, "Pierna Izquierda del Prohibido", "Monstruo"));
		unMazo.addCarta(new CartaModel(6, "Jarra de la Codicia", "Hechizo"));
		unMazo.addCarta(new CartaModel(6, "Jarra de la Codicia", "Hechizo"));
		unMazo.addCarta(new CartaModel(7, "Fuerza de Espejo", "Trampa"));
		unMazo.addCarta(new CartaModel(7, "Fuerza de Espejo", "Trampa"));
		modelo.addAttribute("mazo", unMazo);
		modelo.addAttribute("mano", unMazo.getMano());
		modelo.addAttribute("cartas", unMazo.getMazo());
		return "index";
	}
	
	
}
