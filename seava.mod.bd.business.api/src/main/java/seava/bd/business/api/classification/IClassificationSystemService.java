/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.business.api.classification;

import seava.bd.domain.impl.classification.ClassificationSystem;
import seava.j4e.api.service.business.IEntityService;

/**
 * Interface to expose business functions specific for {@link ClassificationSystem} domain
 * entity.
 */
public interface IClassificationSystemService
		extends
			IEntityService<ClassificationSystem> {

	/**
	 * Find by unique key
	 */
	public ClassificationSystem findByCode(String code);

	/**
	 * Find by unique key
	 */
	public ClassificationSystem findByName(String name);
}
