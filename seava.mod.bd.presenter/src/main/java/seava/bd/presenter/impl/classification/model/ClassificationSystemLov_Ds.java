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
import seava.j4e.presenter.impl.model.AbstractTypeWithCodeLov_Ds;

@Ds(entity = ClassificationSystem.class, sort = {@SortField(field = ClassificationSystemLov_Ds.f_code)})
public class ClassificationSystemLov_Ds
		extends
			AbstractTypeWithCodeLov_Ds<ClassificationSystem> {
	public static final String f_targetAlias = "targetAlias";
	public static final String f_targetType = "targetType";

	@DsField(fetch = false, jpqlFilter = "  e.refid in (select t.sourceRefId from TargetRule t where  t.targetAlias = :targetAlias and  t.targetType = :targetType and t.clientId = :clientId ) ")
	private String targetAlias;

	@DsField(fetch = false)
	private String targetType;

	public ClassificationSystemLov_Ds() {
		super();
	}

	public ClassificationSystemLov_Ds(ClassificationSystem e) {
		super(e);
	}

	public String getTargetAlias() {
		return this.targetAlias;
	}

	public void setTargetAlias(String targetAlias) {
		this.targetAlias = targetAlias;
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}
}
