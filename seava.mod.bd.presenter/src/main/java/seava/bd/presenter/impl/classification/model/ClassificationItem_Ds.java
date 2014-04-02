/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.classification.model;

import seava.bd.domain.impl.classification.ClassificationItem;
import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = ClassificationItem.class, sort = {@SortField(field = ClassificationItem_Ds.f_code)})
@RefLookups({@RefLookup(refId = ClassificationItem_Ds.f_classSystemId, namedQuery = ClassificationSystem.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = ClassificationItem_Ds.f_classSystem)})})
public class ClassificationItem_Ds
		extends
			AbstractTypeWithCode_Ds<ClassificationItem> {
	public static final String f_classSystemId = "classSystemId";
	public static final String f_classSystem = "classSystem";

	@DsField(join = "left", path = "classSystem.id")
	private String classSystemId;

	@DsField(join = "left", path = "classSystem.code")
	private String classSystem;

	public ClassificationItem_Ds() {
		super();
	}

	public ClassificationItem_Ds(ClassificationItem e) {
		super(e);
	}

	public String getClassSystemId() {
		return this.classSystemId;
	}

	public void setClassSystemId(String classSystemId) {
		this.classSystemId = classSystemId;
	}

	public String getClassSystem() {
		return this.classSystem;
	}

	public void setClassSystem(String classSystem) {
		this.classSystem = classSystem;
	}
}
