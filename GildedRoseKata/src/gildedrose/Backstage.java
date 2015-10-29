package gildedrose;

import java.util.List;

public class Backstage {
	Quality quality = new Quality();
	public void QualityBackstage(List<Item> items) {
		
		for (Item item : items) {
			if (item.getName().equals(
					"Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getSellIn() < 11) {
					quality.update(item);
				}

				if (item.getSellIn() < 6) {
					quality.update(item);
				}
			}
		}
	}
}
