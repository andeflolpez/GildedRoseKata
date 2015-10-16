package gildedrose;

import java.util.List;

public class GildedRose {
	Vakidations valida = new Vakidations();
	public void updateQuality(List<Item> items) {
		valida.Quality(items);
	}
}
