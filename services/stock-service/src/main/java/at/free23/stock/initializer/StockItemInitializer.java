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
		this.stockRepo.save(new StockItem(1L, 10L, 5D));
		this.stockRepo.save(new StockItem(2L, 20L, 3D));
		this.stockRepo.save(new StockItem(3L, 13L, 1D));
	}
}
