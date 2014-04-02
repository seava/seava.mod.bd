/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.contact;

import javax.persistence.EntityManager;
import seava.bd.business.api.contact.ICommunicationMethodTypeService;
import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link CommunicationMethodType} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class CommunicationMethodType_Service
		extends
			AbstractEntityService<CommunicationMethodType>
		implements
			ICommunicationMethodTypeService {

	public CommunicationMethodType_Service() {
		super();
	}

	public CommunicationMethodType_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<CommunicationMethodType> getEntityClass() {
		return CommunicationMethodType.class;
	}
	/**
	 * Find by unique key
	 */
	public CommunicationMethodType findByName(String name) {
		return (CommunicationMethodType) this
				.getEntityManager()
				.createNamedQuery(CommunicationMethodType.NQ_FIND_BY_NAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("name", name).getSingleResult();
	}
}
