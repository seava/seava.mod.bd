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
import seava.j4e.presenter.impl.model.AbstractType_Ds;

@Ds(entity = CommunicationMethodType.class, sort = {@SortField(field = CommunicationMethodType_Ds.f_name)})
public class CommunicationMethodType_Ds
		extends
			AbstractType_Ds<CommunicationMethodType> {

	public static final String ALIAS = "bd_CommunicationMethodType_Ds";

	public static final String f_type = "type";

	@DsField
	private String type;

	public CommunicationMethodType_Ds() {
		super();
	}

	public CommunicationMethodType_Ds(CommunicationMethodType e) {
		super(e);
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
