/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.currency;

import javax.persistence.EntityManager;
import seava.bd.business.api.currency.ICurrencyService;
import seava.bd.domain.impl.currency.Currency;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link Currency} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class Currency_Service extends AbstractEntityService<Currency>
		implements
			ICurrencyService {

	public Currency_Service() {
		super();
	}

	public Currency_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<Currency> getEntityClass() {
		return Currency.class;
	}
	/**
	 * Find by unique key
	 */
	public Currency findByCode(String code) {
		return (Currency) this
				.getEntityManager()
				.createNamedQuery(Currency.NQ_FIND_BY_CODE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public Currency findByName(String name) {
		return (Currency) this
				.getEntityManager()
				.createNamedQuery(Currency.NQ_FIND_BY_NAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("name", name).getSingleResult();
	}
}
