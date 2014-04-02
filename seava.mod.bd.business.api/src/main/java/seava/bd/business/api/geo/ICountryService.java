/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.geo;

import seava.bd.domain.impl.geo.Country;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link Country} domain
 * entity.
 */
public interface ICountryService extends IEntityService<Country> {

	/**
	 * Find by unique key
	 */
	public Country findByCode(String code);

	/**
	 * Find by unique key
	 */
	public Country findByName(String name);

	/**
	 * Find by unique key
	 */
	public Country findByIso2(String iso2);
}
