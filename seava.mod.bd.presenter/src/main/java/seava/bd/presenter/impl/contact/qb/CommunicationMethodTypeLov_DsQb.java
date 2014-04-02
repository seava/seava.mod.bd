/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.contact.qb;

import seava.bd.presenter.impl.contact.model.CommunicationMethodTypeLov_Ds;
import seava.j4e.presenter.action.query.QueryBuilderWithJpql;
import seava.j4e.api.session.Session;

public class CommunicationMethodTypeLov_DsQb
		extends
			QueryBuilderWithJpql<CommunicationMethodTypeLov_Ds, CommunicationMethodTypeLov_Ds, Object> {

	@Override
	public void setFilter(CommunicationMethodTypeLov_Ds filter) {
		if (filter.getTargetType() == null || filter.getTargetType().equals("")) {
			filter.setTargetType("N/A");
		}
		super.setFilter(filter);
	}
}
