/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.classification.qb;

import seava.bd.presenter.impl.classification.model.ClassificationSystemLov_Ds;
import seava.j4e.presenter.action.query.QueryBuilderWithJpql;
import seava.j4e.api.session.Session;

public class ClassificationSystemLov_DsQb
		extends
			QueryBuilderWithJpql<ClassificationSystemLov_Ds, ClassificationSystemLov_Ds, Object> {

	@Override
	public void setFilter(ClassificationSystemLov_Ds filter) {
		if (filter.getTargetType() == null || filter.getTargetType().equals("")) {
			filter.setTargetType("N/A");
		}
		super.setFilter(filter);
	}
}
