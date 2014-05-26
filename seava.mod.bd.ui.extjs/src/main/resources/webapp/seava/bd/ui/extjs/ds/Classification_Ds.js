/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.Classification_Ds", {
	extend: 'Ext.data.Model',
	
	statics: {
		ALIAS: "bd_Classification_Ds"
	},
	
	
	validations: [
		{field: "system", type: 'presence'},
		{field: "item", type: 'presence'},
		{field: "targetRefid", type: 'presence'}
	],
	
	fields: [
		{name:"targetRefid", type:"string"},
		{name:"targetAlias", type:"string"},
		{name:"targetType", type:"string"},
		{name:"systemId", type:"string"},
		{name:"system", type:"string"},
		{name:"systemName", type:"string"},
		{name:"itemId", type:"string"},
		{name:"item", type:"string"},
		{name:"itemName", type:"string"},
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
