package gildedrose;

import java.util.List;

public class Validations {

	Backstage back = new Backstage();
	Quality quality = new Quality();

	public void Quality(List<Item> items) {
		for (Item item : items) {

			if (!item.getName().equals("Aged Brie")
					&& !item.getName().equals(
							"Backstage passes to a TAFKAL80ETC concert")) {
				quality.lessTolees(item);
			} else {

				quality.update(item);

				back.QualityBackstage(items);
			}

			if (item.getName() != "Sulfuras, Hand of Ragnaros") {

				item.setSellIn(item.getSellIn() - 1);
			}

			if (item.getSellIn() < 0) {

				if (item.getName() != "Aged Brie") {

					if (item.getName() != "Backstage passes to a TAFKAL80ETC concert") {

						if (item.getQuality() > 0) {
							quality.lessTolees(item);
						}

					} else {
						quality.updateless(item);
					}

				} else {
					quality.update(item);
				}
			}
		}
	}

}
