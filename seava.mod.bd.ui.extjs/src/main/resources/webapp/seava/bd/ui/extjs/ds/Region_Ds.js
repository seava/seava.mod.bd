/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.Region_Ds", {
	extend: 'Ext.data.Model',
	
	statics: {
		ALIAS: "bd_Region_Ds"
	},
	
	
	validations: [
		{field: "name", type: 'presence'},
		{field: "country", type: 'presence'}
	],
	
	fields: [
		{name:"iso", type:"string"},
		{name:"countryId", type:"string"},
		{name:"country", type:"string"},
		{name:"countryIso2", type:"string"},
		{name:"id", type:"string"},
		{name:"code", type:"string"},
		{name:"name", type:"string"},
		{name:"description", type:"string"},
		{name:"notes", type:"string"},
		{name:"active", type:"boolean"},
		{name:"createdAt", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"modifiedAt", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"createdBy", type:"string"},
		{name:"modifiedBy", type:"string"},
		{name:"version", type:"int", useNull:true},
		{name:"refid", type:"string"},
		{name:"entityAlias", type:"string"},
		{name:"entityFqn", type:"string"}
	]
});
