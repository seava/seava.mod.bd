/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.uom.model;

import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = UomType.class, sort = {@SortField(field = UomTypeLov_Ds.f_code)})
public class UomTypeLov_Ds extends AbstractTypeWithCodeLov_Ds<UomType> {

	public UomTypeLov_Ds() {
		super();
	}

	public UomTypeLov_Ds(UomType e) {
		super(e);
	}
}
