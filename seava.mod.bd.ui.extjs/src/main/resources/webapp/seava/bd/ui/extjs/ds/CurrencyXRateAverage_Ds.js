/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.CurrencyXRateAverage_Ds", {
	extend: 'Ext.data.Model',
	
	fields: [
		{name:"validFrom", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"validTo", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"value", type:"float", useNull:true},
		{name:"sourceId", type:"string"},
		{name:"source", type:"string"},
		{name:"targetId", type:"string"},
		{name:"target", type:"string"},
		{name:"providerId", type:"string"},
		{name:"provider", type:"string"},
		{name:"id", type:"string"},
		{name:"clientId", type:"string"},
		{name:"createdAt", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"modifiedAt", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"createdBy", type:"string"},
		{name:"modifiedBy", type:"string"},
		{name:"notes", type:"string"},
		{name:"active", type:"boolean"},
		{name:"version", type:"int", useNull:true},
		{name:"refid", type:"string"},
		{name:"entityAlias", type:"string"},
		{name:"entityFqn", type:"string"}
	]
});
