/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.contact;

import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link CommunicationMethodType} domain
 * entity.
 */
public interface ICommunicationMethodTypeService
		extends
			IEntityService<CommunicationMethodType> {

	/**
	 * Find by unique key
	 */
	public CommunicationMethodType findByName(String name);
}
