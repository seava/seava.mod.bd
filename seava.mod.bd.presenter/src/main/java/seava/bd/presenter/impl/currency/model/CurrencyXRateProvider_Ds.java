/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.currency.model;

import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = CurrencyXRateProvider.class, sort = {@SortField(field = CurrencyXRateProvider_Ds.f_code)})
public class CurrencyXRateProvider_Ds
		extends
			AbstractTypeWithCode_Ds<CurrencyXRateProvider> {

	public static final String ALIAS = "bd_CurrencyXRateProvider_Ds";

	public CurrencyXRateProvider_Ds() {
		super();
	}

	public CurrencyXRateProvider_Ds(CurrencyXRateProvider e) {
		super(e);
	}
}
