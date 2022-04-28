package thymeleaf.demo.model;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;


public class MazoModel {

	private @Getter List<CartaModel> mazo;
	private @Getter String name;

	public MazoModel(List<CartaModel> mazo, String name) {
		this.mazo = mazo;
		this.name = name;
	}
	
	public MazoModel(String name) {
		mazo = new ArrayList<CartaModel>();
		this.name = name;
	}
	
	public boolean addCarta(CartaModel carta) {
		if(mazo.add(carta)) {
			return true;
		}else {
			return false;
		}
	}
	
	public int getSize() {
		return mazo.size();
	}
	
	public List<CartaModel> getMano(){
		List<CartaModel> aux = new ArrayList<CartaModel>();
		for(int x = 0; x < 5; x++) {
            
			aux.add(mazo.get((int)(Math.random()*(mazo.size()))));
		}
		return aux;
	}

}
