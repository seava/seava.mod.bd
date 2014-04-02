/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.currency;

import java.util.Date;
import java.util.List;
import seava.bd.domain.impl.currency.Currency;
import seava.bd.domain.impl.currency.CurrencyXRate;
import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link CurrencyXRate} domain
 * entity.
 */
public interface ICurrencyXRateService extends IEntityService<CurrencyXRate> {

	/**
	 * Find by unique key
	 */
	public CurrencyXRate findByValid(CurrencyXRateProvider provider,
			Currency source, Currency target, Date validAt);

	/**
	 * Find by unique key
	 */
	public CurrencyXRate findByValid(Long providerId, Long sourceId,
			Long targetId, Date validAt);

	/**
	 * Find by reference: provider
	 */
	public List<CurrencyXRate> findByProvider(CurrencyXRateProvider provider);

	/**
	 * Find by ID of reference: provider.id
	 */
	public List<CurrencyXRate> findByProviderId(String providerId);

	/**
	 * Find by reference: source
	 */
	public List<CurrencyXRate> findBySource(Currency source);

	/**
	 * Find by ID of reference: source.id
	 */
	public List<CurrencyXRate> findBySourceId(String sourceId);

	/**
	 * Find by reference: target
	 */
	public List<CurrencyXRate> findByTarget(Currency target);

	/**
	 * Find by ID of reference: target.id
	 */
	public List<CurrencyXRate> findByTargetId(String targetId);
}
