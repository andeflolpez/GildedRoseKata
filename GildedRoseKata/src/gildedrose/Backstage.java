package gildedrose;

import java.util.List;

public class Backstage {
	
	public void Quality(List<Item> items) {
		for (Item item : items) {
			if (item.getName().equals(
					"Backstage passes to a TAFKAL80ETC concert")) {
				if (item.getSellIn() < 11) {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}

				if (item.getSellIn() < 6) {
					if (item.getQuality() < 50) {
						item.setQuality(item.getQuality() + 1);
					}
				}
			}
		}
	}
}
