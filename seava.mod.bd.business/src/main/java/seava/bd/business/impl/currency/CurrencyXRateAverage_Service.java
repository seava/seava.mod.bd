/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.currency;

import java.util.List;
import javax.persistence.EntityManager;
import seava.bd.business.api.currency.ICurrencyXRateAverageService;
import seava.bd.domain.impl.currency.Currency;
import seava.bd.domain.impl.currency.CurrencyXRateAverage;
import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link CurrencyXRateAverage} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class CurrencyXRateAverage_Service
		extends
			AbstractEntityService<CurrencyXRateAverage>
		implements
			ICurrencyXRateAverageService {

	public CurrencyXRateAverage_Service() {
		super();
	}

	public CurrencyXRateAverage_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<CurrencyXRateAverage> getEntityClass() {
		return CurrencyXRateAverage.class;
	}
	/**
	 * Find by reference: provider
	 */
	public List<CurrencyXRateAverage> findByProvider(
			CurrencyXRateProvider provider) {
		return this.findByProviderId(provider.getId());
	}
	/**
	 * Find by ID of reference: provider.id
	 */
	public List<CurrencyXRateAverage> findByProviderId(String providerId) {
		return (List<CurrencyXRateAverage>) this
				.getEntityManager()
				.createQuery(
						"select e from CurrencyXRateAverage e where e.clientId = :clientId and e.provider.id = :providerId",
						CurrencyXRateAverage.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("providerId", providerId).getResultList();
	}
	/**
	 * Find by reference: source
	 */
	public List<CurrencyXRateAverage> findBySource(Currency source) {
		return this.findBySourceId(source.getId());
	}
	/**
	 * Find by ID of reference: source.id
	 */
	public List<CurrencyXRateAverage> findBySourceId(String sourceId) {
		return (List<CurrencyXRateAverage>) this
				.getEntityManager()
				.createQuery(
						"select e from CurrencyXRateAverage e where e.clientId = :clientId and e.source.id = :sourceId",
						CurrencyXRateAverage.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("sourceId", sourceId).getResultList();
	}
	/**
	 * Find by reference: target
	 */
	public List<CurrencyXRateAverage> findByTarget(Currency target) {
		return this.findByTargetId(target.getId());
	}
	/**
	 * Find by ID of reference: target.id
	 */
	public List<CurrencyXRateAverage> findByTargetId(String targetId) {
		return (List<CurrencyXRateAverage>) this
				.getEntityManager()
				.createQuery(
						"select e from CurrencyXRateAverage e where e.clientId = :clientId and e.target.id = :targetId",
						CurrencyXRateAverage.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("targetId", targetId).getResultList();
	}
}
