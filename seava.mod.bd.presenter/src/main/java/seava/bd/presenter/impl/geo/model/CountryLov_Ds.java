/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.geo.model;

import seava.bd.domain.impl.geo.Country;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = Country.class, sort = {@SortField(field = CountryLov_Ds.f_code)})
public class CountryLov_Ds extends AbstractTypeWithCodeLov_Ds<Country> {

	public static final String ALIAS = "bd_CountryLov_Ds";

	public CountryLov_Ds() {
		super();
	}

	public CountryLov_Ds(Country e) {
		super(e);
	}
}
