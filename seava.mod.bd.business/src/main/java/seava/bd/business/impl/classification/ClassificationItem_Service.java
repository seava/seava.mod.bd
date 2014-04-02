/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.classification;

import java.util.List;
import javax.persistence.EntityManager;
import seava.bd.business.api.classification.IClassificationItemService;
import seava.bd.domain.impl.classification.ClassificationItem;
import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link ClassificationItem} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class ClassificationItem_Service
		extends
			AbstractEntityService<ClassificationItem>
		implements
			IClassificationItemService {

	public ClassificationItem_Service() {
		super();
	}

	public ClassificationItem_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<ClassificationItem> getEntityClass() {
		return ClassificationItem.class;
	}
	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySyscode(ClassificationSystem classSystem,
			String code) {
		return (ClassificationItem) this
				.getEntityManager()
				.createNamedQuery(ClassificationItem.NQ_FIND_BY_SYSCODE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("classSystem", classSystem)
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySyscode(Long classSystemId, String code) {
		return (ClassificationItem) this
				.getEntityManager()
				.createNamedQuery(
						ClassificationItem.NQ_FIND_BY_SYSCODE_PRIMITIVE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("classSystemId", classSystemId)
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySysname(ClassificationSystem classSystem,
			String name) {
		return (ClassificationItem) this
				.getEntityManager()
				.createNamedQuery(ClassificationItem.NQ_FIND_BY_SYSNAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("classSystem", classSystem)
				.setParameter("name", name).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySysname(Long classSystemId, String name) {
		return (ClassificationItem) this
				.getEntityManager()
				.createNamedQuery(
						ClassificationItem.NQ_FIND_BY_SYSNAME_PRIMITIVE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("classSystemId", classSystemId)
				.setParameter("name", name).getSingleResult();
	}
	/**
	 * Find by reference: classSystem
	 */
	public List<ClassificationItem> findByClassSystem(
			ClassificationSystem classSystem) {
		return this.findByClassSystemId(classSystem.getId());
	}
	/**
	 * Find by ID of reference: classSystem.id
	 */
	public List<ClassificationItem> findByClassSystemId(String classSystemId) {
		return (List<ClassificationItem>) this
				.getEntityManager()
				.createQuery(
						"select e from ClassificationItem e where e.clientId = :clientId and e.classSystem.id = :classSystemId",
						ClassificationItem.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("classSystemId", classSystemId).getResultList();
	}
}
