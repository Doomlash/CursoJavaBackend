package thymeleaf.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CartaModel {
    
	private Integer id;
    private String name;
	private String clase;
	
	protected CartaModel() {
		
	}
}
