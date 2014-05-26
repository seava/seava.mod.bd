/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.contact.model;

import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeLov_Ds;

@Ds(entity = CommunicationMethodType.class, sort = {@SortField(field = CommunicationMethodTypeAllLov_Ds.f_name)})
public class CommunicationMethodTypeAllLov_Ds
		extends
			AbstractTypeLov_Ds<CommunicationMethodType> {

	public static final String ALIAS = "bd_CommunicationMethodTypeAllLov_Ds";

	public CommunicationMethodTypeAllLov_Ds() {
		super();
	}

	public CommunicationMethodTypeAllLov_Ds(CommunicationMethodType e) {
		super(e);
	}
}
