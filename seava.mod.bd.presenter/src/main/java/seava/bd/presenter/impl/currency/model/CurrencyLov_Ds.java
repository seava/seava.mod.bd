/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.currency.model;

import seava.bd.domain.impl.currency.Currency;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = Currency.class, sort = {@SortField(field = CurrencyLov_Ds.f_code)})
public class CurrencyLov_Ds extends AbstractTypeWithCodeLov_Ds<Currency> {

	public static final String ALIAS = "bd_CurrencyLov_Ds";

	public CurrencyLov_Ds() {
		super();
	}

	public CurrencyLov_Ds(Currency e) {
		super(e);
	}
}
