/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.classification.model;

import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = ClassificationSystem.class, sort = {@SortField(field = ClassificationSystem_Ds.f_code)})
public class ClassificationSystem_Ds
		extends
			AbstractTypeWithCode_Ds<ClassificationSystem> {
	public static final String f_internal = "internal";

	@DsField
	private Boolean internal;

	public ClassificationSystem_Ds() {
		super();
	}

	public ClassificationSystem_Ds(ClassificationSystem e) {
		super(e);
	}

	public Boolean getInternal() {
		return this.internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}
}
