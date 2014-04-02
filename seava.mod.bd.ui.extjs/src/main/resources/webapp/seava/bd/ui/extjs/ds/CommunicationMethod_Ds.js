/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
	
Ext.define("seava.bd.ui.extjs.ds.CommunicationMethod_Ds", {
	extend: 'Ext.data.Model',
	
	validations: [
		{field: "type", type: 'presence'},
		{field: "value", type: 'presence'},
		{field: "targetRefid", type: 'presence'}
	],
	
	fields: [
		{name:"value", type:"string"},
		{name:"validFrom", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"validTo", type:"date", dateFormat:Main.MODEL_DATE_FORMAT},
		{name:"targetRefid", type:"string"},
		{name:"targetAlias", type:"string"},
		{name:"targetType", type:"string"},
		{name:"typeId", type:"string"},
		{name:"type", type:"string"},
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
