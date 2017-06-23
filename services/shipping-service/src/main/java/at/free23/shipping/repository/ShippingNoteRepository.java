/**
 *
 */
package at.free23.shipping.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import at.free23.shipping.api.ShippingNote;

/**
 * @author michael.vlasaty
 *
 */
public interface ShippingNoteRepository extends PagingAndSortingRepository<ShippingNote, Long> {
	public ShippingNote findByOrderRef(Long orderRef);
}
