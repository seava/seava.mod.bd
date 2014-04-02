/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.domain.impl.classification;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;
import seava.j4e.domain.impl.AbstractTypeWithCode;

@NamedQueries({
		@NamedQuery(name = ClassificationSystem.NQ_FIND_BY_CODE, query = "SELECT e FROM ClassificationSystem e WHERE e.clientId = :clientId and e.code = :code", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE)),
		@NamedQuery(name = ClassificationSystem.NQ_FIND_BY_NAME, query = "SELECT e FROM ClassificationSystem e WHERE e.clientId = :clientId and e.name = :name", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE))})
@Entity
@Table(name = ClassificationSystem.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = ClassificationSystem.TABLE_NAME + "_UK1", columnNames = {
				"CLIENTID", "CODE"}),
		@UniqueConstraint(name = ClassificationSystem.TABLE_NAME + "_UK2", columnNames = {
				"CLIENTID", "NAME"})})
public class ClassificationSystem extends AbstractTypeWithCode
		implements
			Serializable {

	public static final String TABLE_NAME = "bd_CLSF_SYS";

	private static final long serialVersionUID = -8865917134914502125L;
	/**
	 * Named query find by unique key: Code.
	 */
	public static final String NQ_FIND_BY_CODE = "ClassificationSystem.findByCode";
	/**
	 * Named query find by unique key: Name.
	 */
	public static final String NQ_FIND_BY_NAME = "ClassificationSystem.findByName";

	@NotNull
	@Column(name = "INTERNAL", nullable = false)
	private Boolean internal;

	public Boolean getInternal() {
		return this.internal;
	}

	public void setInternal(Boolean internal) {
		this.internal = internal;
	}

	@PrePersist
	public void prePersist() {
		super.prePersist();
		if (this.internal == null) {
			this.internal = new Boolean(false);
		}
	}

	@PreUpdate
	public void preUpdate() {
		super.preUpdate();
	}

}
