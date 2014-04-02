/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
package seava.bd.presenter.impl.geo.model;

import seava.bd.domain.impl.geo.Country;
import seava.bd.domain.impl.geo.Location;
import seava.bd.domain.impl.geo.Region;
import seava.j4e.api.annotation.Ds;
import seava.j4e.api.annotation.DsField;
import seava.j4e.api.annotation.Param;
import seava.j4e.api.annotation.RefLookup;
import seava.j4e.api.annotation.RefLookups;
import seava.j4e.presenter.impl.model.AbstractAuditable_Ds;

@Ds(entity = Location.class)
@RefLookups({
		@RefLookup(refId = Location_Ds.f_countryId, namedQuery = Country.NQ_FIND_BY_CODE, params = {@Param(name = "code", field = Location_Ds.f_country)}),
		@RefLookup(refId = Location_Ds.f_countryId, namedQuery = Country.NQ_FIND_BY_ISO2, params = {@Param(name = "iso2", field = Location_Ds.f_countryIso2)}),
		@RefLookup(refId = Location_Ds.f_regionId, namedQuery = Region.NQ_FIND_BY_CODEANDCOUNTRY_PRIMITIVE, params = {
				@Param(name = "countryId", field = Location_Ds.f_countryId),
				@Param(name = "code", field = Location_Ds.f_region)})})
public class Location_Ds extends AbstractAuditable_Ds<Location> {
	public static final String f_regionName = "regionName";
	public static final String f_cityName = "cityName";
	public static final String f_adress = "adress";
	public static final String f_zip = "zip";
	public static final String f_shipping = "shipping";
	public static final String f_billing = "billing";
	public static final String f_mailing = "mailing";
	public static final String f_targetRefid = "targetRefid";
	public static final String f_countryId = "countryId";
	public static final String f_country = "country";
	public static final String f_countryIso2 = "countryIso2";
	public static final String f_regionId = "regionId";
	public static final String f_region = "region";

	@DsField
	private String regionName;

	@DsField
	private String cityName;

	@DsField
	private String adress;

	@DsField
	private String zip;

	@DsField(path = "forShipping")
	private Boolean shipping;

	@DsField(path = "forBilling")
	private Boolean billing;

	@DsField(path = "forMailing")
	private Boolean mailing;

	@DsField
	private String targetRefid;

	@DsField(join = "left", path = "country.id")
	private String countryId;

	@DsField(join = "left", path = "country.code")
	private String country;

	@DsField(join = "left", path = "country.iso2")
	private String countryIso2;

	@DsField(join = "left", path = "region.id")
	private String regionId;

	@DsField(join = "left", path = "region.code")
	private String region;

	public Location_Ds() {
		super();
	}

	public Location_Ds(Location e) {
		super(e);
	}

	public String getRegionName() {
		return this.regionName;
	}

	public void setRegionName(String regionName) {
		this.regionName = regionName;
	}

	public String getCityName() {
		return this.cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getAdress() {
		return this.adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getZip() {
		return this.zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public Boolean getShipping() {
		return this.shipping;
	}

	public void setShipping(Boolean shipping) {
		this.shipping = shipping;
	}

	public Boolean getBilling() {
		return this.billing;
	}

	public void setBilling(Boolean billing) {
		this.billing = billing;
	}

	public Boolean getMailing() {
		return this.mailing;
	}

	public void setMailing(Boolean mailing) {
		this.mailing = mailing;
	}

	public String getTargetRefid() {
		return this.targetRefid;
	}

	public void setTargetRefid(String targetRefid) {
		this.targetRefid = targetRefid;
	}

	public String getCountryId() {
		return this.countryId;
	}

	public void setCountryId(String countryId) {
		this.countryId = countryId;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCountryIso2() {
		return this.countryIso2;
	}

	public void setCountryIso2(String countryIso2) {
		this.countryIso2 = countryIso2;
	}

	public String getRegionId() {
		return this.regionId;
	}

	public void setRegionId(String regionId) {
		this.regionId = regionId;
	}

	public String getRegion() {
		return this.region;
	}

	public void setRegion(String region) {
		this.region = region;
	}
}
