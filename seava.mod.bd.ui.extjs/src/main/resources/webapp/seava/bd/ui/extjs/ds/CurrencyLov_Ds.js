/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.CurrencyLov_Ds", {
	extend: 'Ext.data.Model',
	
	statics: {
		ALIAS: "bd_CurrencyLov_Ds"
	},
	
	
	fields: [
		{name:"id", type:"string"},
		{name:"clientId", type:"string"},
		{name:"code", type:"string"},
		{name:"name", type:"string"},
		{name:"description", type:"string"},
		{name:"active", type:"boolean"},
		{name:"refid", type:"string"}
	]
});
