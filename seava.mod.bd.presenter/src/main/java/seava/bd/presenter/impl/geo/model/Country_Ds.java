/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.geo.model;

import seava.bd.domain.impl.geo.Country;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = Country.class, sort = {@SortField(field = Country_Ds.f_code)})
public class Country_Ds extends AbstractTypeWithCode_Ds<Country> {

	public static final String ALIAS = "bd_Country_Ds";

	public static final String f_iso2 = "iso2";
	public static final String f_iso3 = "iso3";
	public static final String f_hasRegions = "hasRegions";

	@DsField
	private String iso2;

	@DsField
	private String iso3;

	@DsField
	private Boolean hasRegions;

	public Country_Ds() {
		super();
	}

	public Country_Ds(Country e) {
		super(e);
	}

	public String getIso2() {
		return this.iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Boolean getHasRegions() {
		return this.hasRegions;
	}

	public void setHasRegions(Boolean hasRegions) {
		this.hasRegions = hasRegions;
	}
}
