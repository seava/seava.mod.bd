/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.dc.CommunicationMethodType_Dc", {
	extend: "e4e.dc.AbstractDc",
	recordModel: seava.bd.ui.extjs.ds.CommunicationMethodType_Ds
});

/* ================= FILTER FORM: Filter ================= */

Ext.define("seava.bd.ui.extjs.dc.CommunicationMethodType_Dc$Filter", {
	extend: "e4e.dc.view.AbstractDcvFilterForm",
	alias: "widget.bd_CommunicationMethodType_Dc$Filter",

	/**
	 * Components definition
	 */	
	_defineElements_: function() {
		this._getBuilder_()
		
		/* =========== controls =========== */
		.addLov({name:"name", dataIndex:"name", xtype:"bd_CommunicationMethodTypes_Lov",
			retFieldMapping: [{lovField:"id", dsField: "id"} ]})
		.addCombo({ xtype:"combo", name:"type", dataIndex:"type", store:[ "email", "messenger", "phone", "url", "other"]})
		.addBooleanField({ name:"active", dataIndex:"active"})
		
		/* =========== containers =========== */
		.addPanel({ name:"main", autoScroll:true, layout: {type:"hbox", align:'top', pack:'start', defaultMargins: {right:5, left:5}},
		autoScroll:true, padding:"0 30 5 0"})
		.addPanel({ name:"col1", width:250, layout:"form"})
		.addPanel({ name:"col2", width:170, layout:"form"});
	},

	/**
	 * Combine the components
	 */				
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["col1", "col2"])
		.addChildrenTo("col1", ["name", "type"])
		.addChildrenTo("col2", ["active"]);
	}
});

/* ================= EDIT-GRID: EditList ================= */

Ext.define("seava.bd.ui.extjs.dc.CommunicationMethodType_Dc$EditList", {
	extend: "e4e.dc.view.AbstractDcvEditableGrid",
	alias: "widget.bd_CommunicationMethodType_Dc$EditList",

	/**
	 * Columns definition
	 */
	_defineColumns_: function() {
		this._getBuilder_()	
		.addTextColumn({name:"name", dataIndex:"name", width:200, allowBlank: false, 
			editor: { xtype:"textfield", allowBlank:false}})
		.addTextColumn({name:"description", dataIndex:"description", width:200, 
			editor: { xtype:"textfield"}})
		.addComboColumn({name:"type", dataIndex:"type", width:60, allowBlank: false, 
			editor:{xtype:"combo", mode: 'local', allowBlank:false, triggerAction:'all', forceSelection:true, store:[ "email", "messenger", "phone", "url", "other"]}})
		.addBooleanColumn({name:"active", dataIndex:"active"})
		.addDefaults();
	}
});
