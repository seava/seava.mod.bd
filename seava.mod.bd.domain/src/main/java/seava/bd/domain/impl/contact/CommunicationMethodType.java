/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.domain.impl.contact;

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
import org.eclipse.persistence.config.HintValues;
import org.eclipse.persistence.config.QueryHints;
import org.hibernate.validator.constraints.NotBlank;
import seava.j4e.domain.impl.AbstractType;

/**
 * Defines communication method types.
 * For example: phone, office phone , skype, etc
 */
@NamedQueries({@NamedQuery(name = CommunicationMethodType.NQ_FIND_BY_NAME, query = "SELECT e FROM CommunicationMethodType e WHERE e.clientId = :clientId and e.name = :name", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE))})
@Entity
@Table(name = CommunicationMethodType.TABLE_NAME, uniqueConstraints = {@UniqueConstraint(name = CommunicationMethodType.TABLE_NAME
		+ "_UK1", columnNames = {"CLIENTID", "NAME"})})
public class CommunicationMethodType extends AbstractType
		implements
			Serializable {

	public static final String TABLE_NAME = "bd_CMNC_MTD_TYPE";

	private static final long serialVersionUID = -8865917134914502125L;
	/**
	 * Named query find by unique key: Name.
	 */
	public static final String NQ_FIND_BY_NAME = "CommunicationMethodType.findByName";

	@NotBlank
	@Column(name = "TYPE", nullable = false, length = 16)
	private String type;

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
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
