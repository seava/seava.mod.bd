/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.currency;

import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link CurrencyXRateProvider} domain
 * entity.
 */
public interface ICurrencyXRateProviderService
		extends
			IEntityService<CurrencyXRateProvider> {

	/**
	 * Find by unique key
	 */
	public CurrencyXRateProvider findByCode(String code);

	/**
	 * Find by unique key
	 */
	public CurrencyXRateProvider findByName(String name);
}
