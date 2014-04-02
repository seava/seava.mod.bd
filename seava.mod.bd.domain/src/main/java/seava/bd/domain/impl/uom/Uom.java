/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.domain.impl.uom;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.QueryHint;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;
import seava.bd.domain.impl.uom.UomType;
import seava.j4e.domain.impl.AbstractTypeWithCode;

/** Measuring units definition. */
@NamedQueries({
		@NamedQuery(name = Uom.NQ_FIND_BY_CODE, query = "SELECT e FROM Uom e WHERE e.clientId = :clientId and e.code = :code", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE)),
		@NamedQuery(name = Uom.NQ_FIND_BY_NAME, query = "SELECT e FROM Uom e WHERE e.clientId = :clientId and e.name = :name", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE))})
@Entity
@Table(name = Uom.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = Uom.TABLE_NAME + "_UK1", columnNames = {
				"CLIENTID", "CODE"}),
		@UniqueConstraint(name = Uom.TABLE_NAME + "_UK2", columnNames = {
				"CLIENTID", "NAME"})})
public class Uom extends AbstractTypeWithCode implements Serializable {

	public static final String TABLE_NAME = "bd_UOM";

	private static final long serialVersionUID = -8865917134914502125L;
	/**
	 * Named query find by unique key: Code.
	 */
	public static final String NQ_FIND_BY_CODE = "Uom.findByCode";
	/**
	 * Named query find by unique key: Name.
	 */
	public static final String NQ_FIND_BY_NAME = "Uom.findByName";

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = UomType.class)
	@JoinColumn(name = "TYPE_ID", referencedColumnName = "ID")
	private UomType type;

	public UomType getType() {
		return this.type;
	}

	public void setType(UomType type) {
		if (type != null) {
			this.__validate_client_context__(type.getClientId());
		}
		this.type = type;
	}

	@PrePersist
	public void prePersist() {
		super.prePersist();
	}

	@PreUpdate
	public void preUpdate() {
		super.preUpdate();
	}

}
