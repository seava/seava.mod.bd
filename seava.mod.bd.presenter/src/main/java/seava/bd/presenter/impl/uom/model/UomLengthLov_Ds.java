/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.uom.model;

import seava.bd.domain.impl.uom.Uom;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = Uom.class, jpqlWhere = " e.type.category = 'length' ", sort = {@SortField(field = UomLengthLov_Ds.f_code)})
public class UomLengthLov_Ds extends AbstractTypeWithCodeLov_Ds<Uom> {

	public static final String ALIAS = "bd_UomLengthLov_Ds";

	public UomLengthLov_Ds() {
		super();
	}

	public UomLengthLov_Ds(Uom e) {
		super(e);
	}
}
