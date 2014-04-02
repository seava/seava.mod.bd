/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.uom;

import java.util.List;
import seava.bd.domain.impl.uom.Uom;
import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link Uom} domain
 * entity.
 */
public interface IUomService extends IEntityService<Uom> {

	/**
	 * Find by unique key
	 */
	public Uom findByCode(String code);

	/**
	 * Find by unique key
	 */
	public Uom findByName(String name);

	/**
	 * Find by reference: type
	 */
	public List<Uom> findByType(UomType type);

	/**
	 * Find by ID of reference: type.id
	 */
	public List<Uom> findByTypeId(String typeId);
}
