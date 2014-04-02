/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.contact.model;

import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeLov_Ds;

@Ds(entity = CommunicationMethodType.class, sort = {@SortField(field = CommunicationMethodTypeLov_Ds.f_name)})
public class CommunicationMethodTypeLov_Ds
		extends
			AbstractTypeLov_Ds<CommunicationMethodType> {
	public static final String f_targetAlias = "targetAlias";
	public static final String f_targetType = "targetType";

	@DsField(fetch = false, jpqlFilter = "  e.refid in (select t.sourceRefId from TargetRule t where  t.targetAlias = :targetAlias and  t.targetType = :targetType and t.clientId = :clientId ) ")
	private String targetAlias;

	@DsField(fetch = false)
	private String targetType;

	public CommunicationMethodTypeLov_Ds() {
		super();
	}

	public CommunicationMethodTypeLov_Ds(CommunicationMethodType e) {
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
