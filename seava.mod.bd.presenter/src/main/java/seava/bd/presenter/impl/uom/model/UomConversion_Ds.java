/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.uom.model;

import java.math.BigDecimal;
import seava.bd.domain.impl.uom.Uom;
import seava.bd.domain.impl.uom.UomConversion;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.presenter.impl.model.AbstractAuditable_Ds;

@Ds(entity = UomConversion.class)
@RefLookups({
		@RefLookup(refId = UomConversion_Ds.f_sourceId, namedQuery = Uom.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = UomConversion_Ds.f_source)}),
		@RefLookup(refId = UomConversion_Ds.f_targetId, namedQuery = Uom.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = UomConversion_Ds.f_target)})})
public class UomConversion_Ds extends AbstractAuditable_Ds<UomConversion> {
	public static final String f_multiplyWith = "multiplyWith";
	public static final String f_divideTo = "divideTo";
	public static final String f_sourceId = "sourceId";
	public static final String f_source = "source";
	public static final String f_targetId = "targetId";
	public static final String f_target = "target";

	@DsField
	private BigDecimal multiplyWith;

	@DsField
	private BigDecimal divideTo;

	@DsField(join = "left", path = "source.id")
	private String sourceId;

	@DsField(join = "left", path = "source.code")
	private String source;

	@DsField(join = "left", path = "target.id")
	private String targetId;

	@DsField(join = "left", path = "target.code")
	private String target;

	public UomConversion_Ds() {
		super();
	}

	public UomConversion_Ds(UomConversion e) {
		super(e);
	}

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

	public String getSourceId() {
		return this.sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getSource() {
		return this.source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getTargetId() {
		return this.targetId;
	}

	public void setTargetId(String targetId) {
		this.targetId = targetId;
	}

	public String getTarget() {
		return this.target;
	}

	public void setTarget(String target) {
		this.target = target;
	}
}
