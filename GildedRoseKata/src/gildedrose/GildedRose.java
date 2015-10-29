package gildedrose;

import java.util.List;

public class GildedRose {
	Validations valida = new Validations();
	
	public void updateQuality(List<Item> items) {
		valida.Quality(items);
	}
}
