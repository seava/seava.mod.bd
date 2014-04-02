/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.currency.model;

import seava.bd.domain.impl.currency.Currency;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = Currency.class, sort = {@SortField(field = Currency_Ds.f_code)})
public class Currency_Ds extends AbstractTypeWithCode_Ds<Currency> {
	public static final String f_iso3 = "iso3";
	public static final String f_standardPrecision = "standardPrecision";
	public static final String f_symbol = "symbol";

	@DsField
	private String iso3;

	@DsField
	private Integer standardPrecision;

	@DsField
	private String symbol;

	public Currency_Ds() {
		super();
	}

	public Currency_Ds(Currency e) {
		super(e);
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Integer getStandardPrecision() {
		return this.standardPrecision;
	}

	public void setStandardPrecision(Integer standardPrecision) {
		this.standardPrecision = standardPrecision;
	}

	public String getSymbol() {
		return this.symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
}
