/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.classification;

import java.util.List;
import seava.bd.domain.impl.classification.ClassificationItem;
import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link ClassificationItem} domain
 * entity.
 */
public interface IClassificationItemService
		extends
			IEntityService<ClassificationItem> {

	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySyscode(ClassificationSystem classSystem,
			String code);

	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySyscode(Long classSystemId, String code);

	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySysname(ClassificationSystem classSystem,
			String name);

	/**
	 * Find by unique key
	 */
	public ClassificationItem findBySysname(Long classSystemId, String name);

	/**
	 * Find by reference: classSystem
	 */
	public List<ClassificationItem> findByClassSystem(
			ClassificationSystem classSystem);

	/**
	 * Find by ID of reference: classSystem.id
	 */
	public List<ClassificationItem> findByClassSystemId(String classSystemId);
}
