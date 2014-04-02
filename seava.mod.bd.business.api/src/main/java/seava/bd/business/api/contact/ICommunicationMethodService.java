/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.contact;

import java.util.List;
import seava.bd.domain.impl.contact.CommunicationMethod;
import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link CommunicationMethod} domain
 * entity.
 */
public interface ICommunicationMethodService
		extends
			IEntityService<CommunicationMethod> {

	/**
	 * Find by reference: type
	 */
	public List<CommunicationMethod> findByType(CommunicationMethodType type);

	/**
	 * Find by ID of reference: type.id
	 */
	public List<CommunicationMethod> findByTypeId(String typeId);
}
