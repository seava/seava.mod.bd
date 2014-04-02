/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.domain.impl.geo;

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
import org.hibernate.validator.constraints.NotBlank;
import seava.j4e.domain.impl.AbstractTypeWithCode;

/**
 * 
 */
@NamedQueries({
		@NamedQuery(name = Country.NQ_FIND_BY_CODE, query = "SELECT e FROM Country e WHERE e.clientId = :clientId and e.code = :code", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE)),
		@NamedQuery(name = Country.NQ_FIND_BY_NAME, query = "SELECT e FROM Country e WHERE e.clientId = :clientId and e.name = :name", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE)),
		@NamedQuery(name = Country.NQ_FIND_BY_ISO2, query = "SELECT e FROM Country e WHERE e.clientId = :clientId and e.iso2 = :iso2", hints = @QueryHint(name = QueryHints.BIND_PARAMETERS, value = HintValues.TRUE))})
@Entity
@Table(name = Country.TABLE_NAME, uniqueConstraints = {
		@UniqueConstraint(name = Country.TABLE_NAME + "_UK1", columnNames = {
				"CLIENTID", "CODE"}),
		@UniqueConstraint(name = Country.TABLE_NAME + "_UK2", columnNames = {
				"CLIENTID", "NAME"}),
		@UniqueConstraint(name = Country.TABLE_NAME + "_UK3", columnNames = {
				"CLIENTID", "ISO2"})})
public class Country extends AbstractTypeWithCode implements Serializable {

	public static final String TABLE_NAME = "bd_GEO_CNTRY";

	private static final long serialVersionUID = -8865917134914502125L;
	/**
	 * Named query find by unique key: Code.
	 */
	public static final String NQ_FIND_BY_CODE = "Country.findByCode";
	/**
	 * Named query find by unique key: Name.
	 */
	public static final String NQ_FIND_BY_NAME = "Country.findByName";
	/**
	 * Named query find by unique key: Iso2.
	 */
	public static final String NQ_FIND_BY_ISO2 = "Country.findByIso2";

	@NotBlank
	@Column(name = "ISO2", nullable = false, length = 2)
	private String iso2;

	@Column(name = "ISO3", length = 3)
	private String iso3;

	@NotNull
	@Column(name = "HASREGIONS", nullable = false)
	private Boolean hasRegions;

	public String getIso2() {
		return this.iso2;
	}

	public void setIso2(String iso2) {
		this.iso2 = iso2;
	}

	public String getIso3() {
		return this.iso3;
	}

	public void setIso3(String iso3) {
		this.iso3 = iso3;
	}

	public Boolean getHasRegions() {
		return this.hasRegions;
	}

	public void setHasRegions(Boolean hasRegions) {
		this.hasRegions = hasRegions;
	}

	@PrePersist
	public void prePersist() {
		super.prePersist();
		if (this.hasRegions == null) {
			this.hasRegions = new Boolean(false);
		}
	}

	@PreUpdate
	public void preUpdate() {
		super.preUpdate();
	}

}
