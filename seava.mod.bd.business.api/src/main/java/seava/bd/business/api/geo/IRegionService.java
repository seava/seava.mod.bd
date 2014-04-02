/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.geo;

import java.util.List;
import seava.bd.domain.impl.geo.Country;
import seava.bd.domain.impl.geo.Region;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link Region} domain
 * entity.
 */
public interface IRegionService extends IEntityService<Region> {

	/**
	 * Find by unique key
	 */
	public Region findByCodeAndCountry(Country country, String code);

	/**
	 * Find by unique key
	 */
	public Region findByCodeAndCountry(Long countryId, String code);

	/**
	 * Find by reference: country
	 */
	public List<Region> findByCountry(Country country);

	/**
	 * Find by ID of reference: country.id
	 */
	public List<Region> findByCountryId(String countryId);
}
