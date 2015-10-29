package gildedrose;

import java.util.List;

public class Quality {

	//Item item;
	public void update(Item item) {
		
		if (item.getQuality() < 50) {
			item.setQuality(item.getQuality() + 1);
		}
	}
	
	public void updateless(Item item){
		
		item.setQuality(item.getQuality() - item.getQuality());
	}
   public void quality(Item item){
	   item.setQuality(item.getQuality() - 1);
   }
}
