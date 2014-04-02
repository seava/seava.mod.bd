/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.currency;

import seava.bd.domain.impl.currency.Currency;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link Currency} domain
 * entity.
 */
public interface ICurrencyService extends IEntityService<Currency> {

	/**
	 * Find by unique key
	 */
	public Currency findByCode(String code);

	/**
	 * Find by unique key
	 */
	public Currency findByName(String name);
}
