/**
 *
 */
package at.free23.stock.initializer;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import at.free23.stock.model.StockItem;
import at.free23.stock.repository.StockItemRepository;

/**
 * @author michael.vlasaty
 *
 */
@Component
public class StockItemInitializer {

	@Autowired
	private StockItemRepository stockRepo;

	@PostConstruct
	public void init() {
		this.stockRepo.save(new StockItem("green-goose", "Indian Pale Ale", 10, 5D, 5D));
		this.stockRepo.save(new StockItem("petrus", "Craft Beer", 3, 3D, 3D));
		this.stockRepo.save(new StockItem("muenchner-hell", "Beer", 0, 1D, 1D));
	}
}
