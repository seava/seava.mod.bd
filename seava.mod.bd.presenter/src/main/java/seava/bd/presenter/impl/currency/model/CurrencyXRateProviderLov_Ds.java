/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.currency.model;

import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = CurrencyXRateProvider.class, sort = {@SortField(field = CurrencyXRateProviderLov_Ds.f_code)})
public class CurrencyXRateProviderLov_Ds
		extends
			AbstractTypeWithCodeLov_Ds<CurrencyXRateProvider> {

	public CurrencyXRateProviderLov_Ds() {
		super();
	}

	public CurrencyXRateProviderLov_Ds(CurrencyXRateProvider e) {
		super(e);
	}
}
