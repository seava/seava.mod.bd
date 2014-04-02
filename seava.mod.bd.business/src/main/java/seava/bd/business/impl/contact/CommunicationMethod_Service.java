/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.contact;

import java.util.List;
import javax.persistence.EntityManager;
import seava.bd.business.api.contact.ICommunicationMethodService;
import seava.bd.domain.impl.contact.CommunicationMethod;
import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link CommunicationMethod} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class CommunicationMethod_Service
		extends
			AbstractEntityService<CommunicationMethod>
		implements
			ICommunicationMethodService {

	public CommunicationMethod_Service() {
		super();
	}

	public CommunicationMethod_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<CommunicationMethod> getEntityClass() {
		return CommunicationMethod.class;
	}
	/**
	 * Find by reference: type
	 */
	public List<CommunicationMethod> findByType(CommunicationMethodType type) {
		return this.findByTypeId(type.getId());
	}
	/**
	 * Find by ID of reference: type.id
	 */
	public List<CommunicationMethod> findByTypeId(String typeId) {
		return (List<CommunicationMethod>) this
				.getEntityManager()
				.createQuery(
						"select e from CommunicationMethod e where e.clientId = :clientId and e.type.id = :typeId",
						CommunicationMethod.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("typeId", typeId).getResultList();
	}
}
