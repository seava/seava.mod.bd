/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.LocationLov_Ds", {
	extend: 'Ext.data.Model',
	
	statics: {
		ALIAS: "bd_LocationLov_Ds"
	},
	
	
	fields: [
		{name:"targetRefid", type:"string"},
		{name:"asString", type:"string"},
		{name:"forBilling", type:"boolean"},
		{name:"forShipping", type:"boolean"},
		{name:"forMailing", type:"boolean"},
		{name:"active", type:"boolean"},
		{name:"id", type:"string"},
		{name:"clientId", type:"string"},
		{name:"refid", type:"string"}
	]
});
