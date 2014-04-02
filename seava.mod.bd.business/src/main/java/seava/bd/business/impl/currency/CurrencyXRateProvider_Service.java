/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.currency;

import javax.persistence.EntityManager;
import seava.bd.business.api.currency.ICurrencyXRateProviderService;
import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link CurrencyXRateProvider} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class CurrencyXRateProvider_Service
		extends
			AbstractEntityService<CurrencyXRateProvider>
		implements
			ICurrencyXRateProviderService {

	public CurrencyXRateProvider_Service() {
		super();
	}

	public CurrencyXRateProvider_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<CurrencyXRateProvider> getEntityClass() {
		return CurrencyXRateProvider.class;
	}
	/**
	 * Find by unique key
	 */
	public CurrencyXRateProvider findByCode(String code) {
		return (CurrencyXRateProvider) this
				.getEntityManager()
				.createNamedQuery(CurrencyXRateProvider.NQ_FIND_BY_CODE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public CurrencyXRateProvider findByName(String name) {
		return (CurrencyXRateProvider) this
				.getEntityManager()
				.createNamedQuery(CurrencyXRateProvider.NQ_FIND_BY_NAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("name", name).getSingleResult();
	}
}
