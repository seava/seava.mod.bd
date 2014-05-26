/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.contact.model;

import java.util.Date;
import seava.bd.domain.impl.contact.CommunicationMethod;
import seava.bd.domain.impl.contact.CommunicationMethodType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.presenter.impl.model.AbstractAuditable_Ds;

@Ds(entity = CommunicationMethod.class)
@RefLookups({@RefLookup(refId = CommunicationMethod_Ds.f_typeId, namedQuery = CommunicationMethodType.NQ_FIND_BY_NAME, params = {@Param(name = "name", field = CommunicationMethod_Ds.f_type)})})
public class CommunicationMethod_Ds
		extends
			AbstractAuditable_Ds<CommunicationMethod> {

	public static final String ALIAS = "bd_CommunicationMethod_Ds";

	public static final String f_value = "value";
	public static final String f_validFrom = "validFrom";
	public static final String f_validTo = "validTo";
	public static final String f_targetRefid = "targetRefid";
	public static final String f_targetAlias = "targetAlias";
	public static final String f_targetType = "targetType";
	public static final String f_typeId = "typeId";
	public static final String f_type = "type";

	@DsField
	private String value;

	@DsField
	private Date validFrom;

	@DsField
	private Date validTo;

	@DsField
	private String targetRefid;

	@DsField
	private String targetAlias;

	@DsField
	private String targetType;

	@DsField(join = "left", path = "type.id")
	private String typeId;

	@DsField(join = "left", path = "type.name")
	private String type;

	public CommunicationMethod_Ds() {
		super();
	}

	public CommunicationMethod_Ds(CommunicationMethod e) {
		super(e);
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public Date getValidFrom() {
		return this.validFrom;
	}

	public void setValidFrom(Date validFrom) {
		this.validFrom = validFrom;
	}

	public Date getValidTo() {
		return this.validTo;
	}

	public void setValidTo(Date validTo) {
		this.validTo = validTo;
	}

	public String getTargetRefid() {
		return this.targetRefid;
	}

	public void setTargetRefid(String targetRefid) {
		this.targetRefid = targetRefid;
	}

	public String getTargetAlias() {
		return this.targetAlias;
	}

	public void setTargetAlias(String targetAlias) {
		this.targetAlias = targetAlias;
	}

	public String getTargetType() {
		return this.targetType;
	}

	public void setTargetType(String targetType) {
		this.targetType = targetType;
	}

	public String getTypeId() {
		return this.typeId;
	}

	public void setTypeId(String typeId) {
		this.typeId = typeId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}
}
