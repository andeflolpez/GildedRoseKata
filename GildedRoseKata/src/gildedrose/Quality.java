package gildedrose;

import java.util.List;

public class Quality {

	//Item item;
	public void update(Item item) {
		
		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}
	}

}
