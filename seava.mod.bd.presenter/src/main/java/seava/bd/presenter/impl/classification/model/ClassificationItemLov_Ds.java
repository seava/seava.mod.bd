/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.classification.model;

import seava.bd.domain.impl.classification.ClassificationItem;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = ClassificationItem.class, sort = {@SortField(field = ClassificationItemLov_Ds.f_code)})
public class ClassificationItemLov_Ds
		extends
			AbstractTypeWithCodeLov_Ds<ClassificationItem> {
	public static final String f_classSystemId = "classSystemId";

	@DsField(join = "left", path = "classSystem.id")
	private String classSystemId;

	public ClassificationItemLov_Ds() {
		super();
	}

	public ClassificationItemLov_Ds(ClassificationItem e) {
		super(e);
	}

	public String getClassSystemId() {
		return this.classSystemId;
	}

	public void setClassSystemId(String classSystemId) {
		this.classSystemId = classSystemId;
	}
}
