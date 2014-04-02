/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.TargetRule_Ds", {
	extend: 'Ext.data.Model',
	
	validations: [
		{field: "targetAlias", type: 'presence'},
		{field: "targetType", type: 'presence'}
	],
	
	initRecord: function() {
		this.set("targetType", "N/A");
	},
	
	fields: [
		{name:"sourceRefId", type:"string"},
		{name:"targetAlias", type:"string"},
		{name:"targetType", type:"string"},
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
