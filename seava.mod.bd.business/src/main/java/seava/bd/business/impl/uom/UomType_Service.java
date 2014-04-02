/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.uom;

import javax.persistence.EntityManager;
import seava.bd.business.api.uom.IUomTypeService;
import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link UomType} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class UomType_Service extends AbstractEntityService<UomType>
		implements
			IUomTypeService {

	public UomType_Service() {
		super();
	}

	public UomType_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<UomType> getEntityClass() {
		return UomType.class;
	}
	/**
	 * Find by unique key
	 */
	public UomType findByCode(String code) {
		return (UomType) this
				.getEntityManager()
				.createNamedQuery(UomType.NQ_FIND_BY_CODE)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("code", code).getSingleResult();
	}
	/**
	 * Find by unique key
	 */
	public UomType findByName(String name) {
		return (UomType) this
				.getEntityManager()
				.createNamedQuery(UomType.NQ_FIND_BY_NAME)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("name", name).getSingleResult();
	}
}
