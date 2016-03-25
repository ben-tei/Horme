package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Trader.
 * 
 * @author Meche
 */
public abstract class Trader extends Person {
	/**
	 * Description of the property id.
	 */
	private String id = "";
	/**
	 * Description of the property SIRET.
	 */
	private String SIRET = "";

	/**
	 * Description of the property orders.
	 */
	private HashSet<Order> orders = new HashSet<Order>();

	/**
	 * Description of the property website.
	 */
	private String website = "";

	/**
	 * Description of the property products.
	 */
	private HashSet<Product> products = new HashSet<Product>();

	/**
	 * Description of the property estimates.
	 */
	private HashSet<Estimate> estimates = new HashSet<Estimate>();

	// Start of user code (user defined attributes for Trader)

	// End of user code

	/**
	 * The constructor.
	 */
	public Trader() {
		// Start of user code constructor for Trader)
		super();
		// End of user code
	}
	
	/**
	 * Instantiates a new trader.
	 *
	 * @param id the id
	 */
	public Trader(String id) {
		this.id = id;
	}

	// Start of user code (user defined methods for Trader)

	// End of user code
	/**
	 * Returns SIRET.
	 * @return SIRET 
	 */
	public String getSIRET() {
		return this.SIRET;
	}

	/**
	 * Sets a value to attribute SIRET. 
	 *
	 * @param newSIRET the new siret
	 */
	public void setSIRET(String newSIRET) {
		this.SIRET = newSIRET;
	}

	/**
	 * Returns orders.
	 * @return orders 
	 */
	public HashSet<Order> getOrders() {
		return this.orders;
	}

	/**
	 * Returns website.
	 * @return website 
	 */
	public String getWebsite() {
		return this.website;
	}

	/**
	 * Sets a value to attribute website. 
	 *
	 * @param newWebsite the new website
	 */
	public void setWebsite(String newWebsite) {
		this.website = newWebsite;
	}

	/**
	 * Returns products.
	 * @return products 
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

	/**
	 * Returns estimates.
	 * @return estimates 
	 */
	public HashSet<Estimate> getEstimates() {
		return this.estimates;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id) {
		this.id = id;
	}


}
