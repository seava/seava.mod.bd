/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.uom.model;

import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = UomType.class, sort = {@SortField(field = UomType_Ds.f_code)})
public class UomType_Ds extends AbstractTypeWithCode_Ds<UomType> {
	public static final String f_category = "category";

	@DsField
	private String category;

	public UomType_Ds() {
		super();
	}

	public UomType_Ds(UomType e) {
		super(e);
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
}
