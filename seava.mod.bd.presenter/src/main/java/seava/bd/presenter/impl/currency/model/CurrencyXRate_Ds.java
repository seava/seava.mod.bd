/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.currency.model;

import java.math.BigDecimal;
import java.util.Date;
import seava.bd.domain.impl.currency.Currency;
import seava.bd.domain.impl.currency.CurrencyXRate;
import seava.bd.domain.impl.currency.CurrencyXRateProvider;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.api.annotation.SortField;
import seava.j4e.presenter.impl.model.AbstractAuditable_Ds;

@Ds(entity = CurrencyXRate.class, sort = {
		@SortField(field = CurrencyXRate_Ds.f_validAt, desc = true),
		@SortField(field = CurrencyXRate_Ds.f_source),
		@SortField(field = CurrencyXRate_Ds.f_target)})
@RefLookups({
		@RefLookup(refId = CurrencyXRate_Ds.f_sourceId, namedQuery = Currency.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = CurrencyXRate_Ds.f_source)}),
		@RefLookup(refId = CurrencyXRate_Ds.f_targetId, namedQuery = Currency.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = CurrencyXRate_Ds.f_target)}),
		@RefLookup(refId = CurrencyXRate_Ds.f_providerId, namedQuery = CurrencyXRateProvider.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = CurrencyXRate_Ds.f_provider)})})
public class CurrencyXRate_Ds extends AbstractAuditable_Ds<CurrencyXRate> {

	public static final String ALIAS = "bd_CurrencyXRate_Ds";

	public static final String f_validAt = "validAt";
	public static final String f_value = "value";
	public static final String f_sourceId = "sourceId";
	public static final String f_source = "source";
	public static final String f_targetId = "targetId";
	public static final String f_target = "target";
	public static final String f_providerId = "providerId";
	public static final String f_provider = "provider";

	@DsField
	private Date validAt;

	@DsField
	private BigDecimal value;

	@DsField(join = "left", path = "source.id")
	private String sourceId;

	@DsField(join = "left", path = "source.code")
	private String source;

	@DsField(join = "left", path = "target.id")
	private String targetId;

	@DsField(join = "left", path = "target.code")
	private String target;

	@DsField(join = "left", path = "provider.id")
	private String providerId;

	@DsField(join = "left", path = "provider.code")
	private String provider;

	public CurrencyXRate_Ds() {
		super();
	}

	public CurrencyXRate_Ds(CurrencyXRate e) {
		super(e);
	}

	public Date getValidAt() {
		return this.validAt;
	}

	public void setValidAt(Date validAt) {
		this.validAt = validAt;
	}

	public BigDecimal getValue() {
		return this.value;
	}

	public void setValue(BigDecimal value) {
		this.value = value;
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

	public String getProviderId() {
		return this.providerId;
	}

	public void setProviderId(String providerId) {
		this.providerId = providerId;
	}

	public String getProvider() {
		return this.provider;
	}

	public void setProvider(String provider) {
		this.provider = provider;
	}
}
