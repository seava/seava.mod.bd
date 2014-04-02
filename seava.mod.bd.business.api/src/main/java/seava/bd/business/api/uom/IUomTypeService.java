/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.uom;

import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link UomType} domain
 * entity.
 */
public interface IUomTypeService extends IEntityService<UomType> {

	/**
	 * Find by unique key
	 */
	public UomType findByCode(String code);

	/**
	 * Find by unique key
	 */
	public UomType findByName(String name);
}
