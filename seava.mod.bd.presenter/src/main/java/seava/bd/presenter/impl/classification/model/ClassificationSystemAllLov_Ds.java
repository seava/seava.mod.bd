/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.classification.model;

import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = ClassificationSystem.class, sort = {@SortField(field = ClassificationSystemAllLov_Ds.f_code)})
public class ClassificationSystemAllLov_Ds
		extends
			AbstractTypeWithCodeLov_Ds<ClassificationSystem> {

	public ClassificationSystemAllLov_Ds() {
		super();
	}

	public ClassificationSystemAllLov_Ds(ClassificationSystem e) {
		super(e);
	}
}
