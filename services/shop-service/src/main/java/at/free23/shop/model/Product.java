/**
 *
 */
package at.free23.shop.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

/**
 * @author michael.vlasaty
 *
 */
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idgen")
	@SequenceGenerator(name = "idgen", sequenceName = "product_id_sequence", allocationSize = 1, initialValue = 1)
	private Long id;

	private String uuid;
	private String name;
	private String description;
	private String imgUrl;

	private Double grossAmount;
	private Double netAmount;

	private Long taxRate;

	// @OneToMany(mappedBy = "product", cascade = CascadeType.ALL, orphanRemoval
	// = true)
	// private List<Item> items;

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUuid() {
		return this.uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImgUrl() {
		return this.imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Double getGrossAmount() {
		return this.grossAmount;
	}

	public void setGrossAmount(Double grossAmount) {
		this.grossAmount = grossAmount;
	}

	public Double getNetAmount() {
		return this.netAmount;
	}

	public void setNetAmount(Double netAmount) {
		this.netAmount = netAmount;
	}

	public Long getTaxRate() {
		return this.taxRate;
	}

	public void setTaxRate(Long taxRate) {
		this.taxRate = taxRate;
	}
}
