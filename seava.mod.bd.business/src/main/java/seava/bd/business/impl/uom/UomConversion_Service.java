/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.impl.uom;

import java.util.List;
import javax.persistence.EntityManager;
import seava.bd.business.api.uom.IUomConversionService;
import seava.bd.domain.impl.uom.Uom;
import seava.bd.domain.impl.uom.UomConversion;
import seava.j4e.api.session.Session;
import seava.j4e.business.service.entity.AbstractEntityService;

/**
 * Repository functionality for {@link UomConversion} domain entity. It contains
 * finder methods based on unique keys as well as reference fields.
 * 
 */
public class UomConversion_Service extends AbstractEntityService<UomConversion>
		implements
			IUomConversionService {

	public UomConversion_Service() {
		super();
	}

	public UomConversion_Service(EntityManager em) {
		super();
		this.setEntityManager(em);
	}

	@Override
	public Class<UomConversion> getEntityClass() {
		return UomConversion.class;
	}
	/**
	 * Find by reference: source
	 */
	public List<UomConversion> findBySource(Uom source) {
		return this.findBySourceId(source.getId());
	}
	/**
	 * Find by ID of reference: source.id
	 */
	public List<UomConversion> findBySourceId(String sourceId) {
		return (List<UomConversion>) this
				.getEntityManager()
				.createQuery(
						"select e from UomConversion e where e.clientId = :clientId and e.source.id = :sourceId",
						UomConversion.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("sourceId", sourceId).getResultList();
	}
	/**
	 * Find by reference: target
	 */
	public List<UomConversion> findByTarget(Uom target) {
		return this.findByTargetId(target.getId());
	}
	/**
	 * Find by ID of reference: target.id
	 */
	public List<UomConversion> findByTargetId(String targetId) {
		return (List<UomConversion>) this
				.getEntityManager()
				.createQuery(
						"select e from UomConversion e where e.clientId = :clientId and e.target.id = :targetId",
						UomConversion.class)
				.setParameter("clientId",
						Session.user.get().getClient().getId())
				.setParameter("targetId", targetId).getResultList();
	}
}
