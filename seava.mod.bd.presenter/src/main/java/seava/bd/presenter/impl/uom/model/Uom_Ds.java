/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.uom.model;

import seava.bd.domain.impl.uom.Uom;
import seava.bd.domain.impl.uom.UomType;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractTypeWithCode_Ds;

@Ds(entity = Uom.class, sort = {@SortField(field = Uom_Ds.f_code)})
@RefLookups({@RefLookup(refId = Uom_Ds.f_typeId, namedQuery = UomType.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = Uom_Ds.f_type)})})
public class Uom_Ds extends AbstractTypeWithCode_Ds<Uom> {

	public static final String ALIAS = "bd_Uom_Ds";

	public static final String f_typeId = "typeId";
	public static final String f_type = "type";

	@DsField(join = "left", path = "type.id")
	private String typeId;

	@DsField(join = "left", path = "type.code")
	private String type;

	public Uom_Ds() {
		super();
	}

	public Uom_Ds(Uom e) {
		super(e);
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
