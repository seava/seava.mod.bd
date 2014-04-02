/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.geo;

import java.util.List;
import seava.bd.domain.impl.geo.City;
import seava.bd.domain.impl.geo.Country;
import seava.bd.domain.impl.geo.Region;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link City} domain
 * entity.
 */
public interface ICityService extends IEntityService<City> {

	/**
	 * Find by reference: country
	 */
	public List<City> findByCountry(Country country);

	/**
	 * Find by ID of reference: country.id
	 */
	public List<City> findByCountryId(String countryId);

	/**
	 * Find by reference: region
	 */
	public List<City> findByRegion(Region region);

	/**
	 * Find by ID of reference: region.id
	 */
	public List<City> findByRegionId(String regionId);
}
