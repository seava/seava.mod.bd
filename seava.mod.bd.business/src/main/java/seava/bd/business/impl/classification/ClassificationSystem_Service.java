/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.classification;

import javax.persistence.EntityManager;
import seava.bd.business.api.classification.IClassificationSystemService;
import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link ClassificationSystem} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class ClassificationSystem_Service
		extends
			AbstractEntityService<ClassificationSystem>
		implements
			IClassificationSystemService {

	public ClassificationSystem_Service() {
		super();
	}

	public ClassificationSystem_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<ClassificationSystem> getEntityClass() {
		return ClassificationSystem.class;
	}
	/**
	 * Find by unique key
	 */
	public ClassificationSystem findByCode(String code) {
		return (ClassificationSystem) this
				.getEntityManager()
				.createNamedQuery(ClassificationSystem.NQ_FIND_BY_CODE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public ClassificationSystem findByName(String name) {
		return (ClassificationSystem) this
				.getEntityManager()
				.createNamedQuery(ClassificationSystem.NQ_FIND_BY_NAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("name", name).getSingleResult();
	}
}
