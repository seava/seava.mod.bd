/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.domain.impl.uom;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import seava.bd.domain.impl.uom.Uom;
import seava.j4e.domain.impl.AbstractAuditable;

/** Measuring units conversion. */
@Entity
@Table(name = UomConversion.TABLE_NAME)
public class UomConversion extends AbstractAuditable implements Serializable {

	public static final String TABLE_NAME = "bd_UOM_CNV";

	private static final long serialVersionUID = -8865917134914502125L;

	/** Multiplication factor. Specify either a multiplication or a division factor */
	@Column(name = "MULTIPLYWITH", precision = 21, scale = 6)
	private BigDecimal multiplyWith;

	/** Division factor. Specify either a multiplication or a division factor */
	@Column(name = "DIVIDETO", precision = 21, scale = 6)
	private BigDecimal divideTo;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Uom.class)
	@JoinColumn(name = "SOURCE_ID", referencedColumnName = "ID")
	private Uom source;

	@ManyToOne(fetch = FetchType.LAZY, targetEntity = Uom.class)
	@JoinColumn(name = "TARGET_ID", referencedColumnName = "ID")
	private Uom target;

	public BigDecimal getMultiplyWith() {
		return this.multiplyWith;
	}

	public void setMultiplyWith(BigDecimal multiplyWith) {
		this.multiplyWith = multiplyWith;
	}

	public BigDecimal getDivideTo() {
		return this.divideTo;
	}

	public void setDivideTo(BigDecimal divideTo) {
		this.divideTo = divideTo;
	}

	public Uom getSource() {
		return this.source;
	}

	public void setSource(Uom source) {
		if (source != null) {
			this.__validate_client_context__(source.getClientId());
		}
		this.source = source;
	}

	public Uom getTarget() {
		return this.target;
	}

	public void setTarget(Uom target) {
		if (target != null) {
			this.__validate_client_context__(target.getClientId());
		}
		this.target = target;
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
