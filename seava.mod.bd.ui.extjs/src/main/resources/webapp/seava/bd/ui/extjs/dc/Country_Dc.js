/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.dc.Country_Dc", {
	extend: "e4e.dc.AbstractDc",
	recordModel: seava.bd.ui.extjs.ds.Country_Ds
});

/* ================= FILTER FORM: Filter ================= */

Ext.define("seava.bd.ui.extjs.dc.Country_Dc$Filter", {
	extend: "e4e.dc.view.AbstractDcvFilterForm",
	alias: "widget.bd_Country_Dc$Filter",

	/**
	 * Components definition
	 */	
	_defineElements_: function() {
		this._getBuilder_()
		
		/* =========== controls =========== */
		.addLov({name:"code", dataIndex:"code", xtype:"bd_Countries_Lov", caseRestriction:"uppercase",
			retFieldMapping: [{lovField:"id", dsField: "id"} ]})
		.addTextField({ name:"name", dataIndex:"name"})
		.addTextField({ name:"iso2", dataIndex:"iso2", maxLength:2, caseRestriction:"uppercase"})
		.addTextField({ name:"iso3", dataIndex:"iso3", maxLength:3, caseRestriction:"uppercase"})
		.addBooleanField({ name:"active", dataIndex:"active"})
		
		/* =========== containers =========== */
		.addPanel({ name:"main", autoScroll:true, layout: {type:"hbox", align:'top', pack:'start', defaultMargins: {right:5, left:5}},
		autoScroll:true, padding:"0 30 5 0"})
		.addPanel({ name:"col1", width:220, layout:"form"})
		.addPanel({ name:"col2", width:170, layout:"form"})
		.addPanel({ name:"col3", width:170, layout:"form"});
	},

	/**
	 * Combine the components
	 */				
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["col1", "col2", "col3"])
		.addChildrenTo("col1", ["code", "name"])
		.addChildrenTo("col2", ["iso2", "iso3"])
		.addChildrenTo("col3", ["active"]);
	}
});

/* ================= FILTER: FilterPG ================= */


Ext.define("seava.bd.ui.extjs.dc.Country_Dc$FilterPG", {
	extend: "e4e.dc.view.AbstractDcvFilterPropGrid",
	alias: "widget.bd_Country_Dc$FilterPG",

	_defineElements_: function() {
		this._getBuilder_()
			/* controls */
			.addTextField({ name:"name", dataIndex:"name"})
			.addTextField({ name:"code", dataIndex:"code", caseRestriction:"uppercase"})
			.addTextField({ name:"iso2", dataIndex:"iso2", maxLength:2, caseRestriction:"uppercase"})
			.addTextField({ name:"iso3", dataIndex:"iso3", maxLength:3, caseRestriction:"uppercase"})
		;
	}

});

/* ================= GRID: List ================= */

Ext.define("seava.bd.ui.extjs.dc.Country_Dc$List", {
	extend: "e4e.dc.view.AbstractDcvGrid",
	alias: "widget.bd_Country_Dc$List",

	/**
	 * Columns definition
	 */
	_defineColumns_: function() {
		this._getBuilder_()
		.addTextColumn({ name:"code", dataIndex:"code", width:120})
		.addTextColumn({ name:"name", dataIndex:"name", width:200})
		.addTextColumn({ name:"iso2", dataIndex:"iso2", width:50})
		.addTextColumn({ name:"iso3", dataIndex:"iso3", width:50})
		.addTextColumn({ name:"description", dataIndex:"description", width:200})
		.addBooleanColumn({ name:"hasRegions", dataIndex:"hasRegions"})
		.addBooleanColumn({ name:"active", dataIndex:"active"})
		.addDefaults();
	}
});

/* ================= EDIT-GRID: EditList ================= */

Ext.define("seava.bd.ui.extjs.dc.Country_Dc$EditList", {
	extend: "e4e.dc.view.AbstractDcvEditableGrid",
	alias: "widget.bd_Country_Dc$EditList",
	_bulkEditFields_: ["active","description"],

	/**
	 * Columns definition
	 */
	_defineColumns_: function() {
		this._getBuilder_()	
		.addTextColumn({name:"code", dataIndex:"code", width:120, caseRestriction:"uppercase", 
			editor: { xtype:"textfield"}})
		.addTextColumn({name:"name", dataIndex:"name", width:200, 
			editor: { xtype:"textfield"}})
		.addTextColumn({name:"iso2", dataIndex:"iso2", width:50, maxLength:2, caseRestriction:"uppercase", 
			editor: { xtype:"textfield"}})
		.addTextColumn({name:"iso3", dataIndex:"iso3", width:50, maxLength:3, caseRestriction:"uppercase", 
			editor: { xtype:"textfield"}})
		.addBooleanColumn({name:"hasRegions", dataIndex:"hasRegions"})
		.addBooleanColumn({name:"active", dataIndex:"active"})
		.addTextColumn({name:"description", dataIndex:"description", width:200, 
			editor: { xtype:"textfield"}})
		.addDefaults();
	}
});

/* ================= EDIT FORM: Edit ================= */

Ext.define("seava.bd.ui.extjs.dc.Country_Dc$Edit", {
	extend: "e4e.dc.view.AbstractDcvEditForm",
	alias: "widget.bd_Country_Dc$Edit",

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		
		/* =========== controls =========== */
		.addTextField({ name:"code", dataIndex:"code", allowBlank:false, caseRestriction:"uppercase"})
		.addTextField({ name:"name", dataIndex:"name", allowBlank:false})
		.addTextArea({ name:"notes", dataIndex:"notes", height:40})
		.addBooleanField({ name:"active", dataIndex:"active"})
		.addBooleanField({ name:"hasRegions", dataIndex:"hasRegions"})
		.addTextField({ name:"iso2", dataIndex:"iso2", maxLength:2, caseRestriction:"uppercase"})
		.addTextField({ name:"iso3", dataIndex:"iso3", maxLength:3, caseRestriction:"uppercase"})
		/* =========== containers =========== */
		.addPanel({ name:"main", autoScroll:true, layout: {type:"hbox", align:'top', pack:'start', defaultMargins: {right:5, left:5}},
		autoScroll:true, padding:"0 30 5 0"})
		.addPanel({ name:"col1", width:350, layout:"form"})
		.addPanel({ name:"col2", width:220, layout:"form"});
	},

	/**
	 * Combine the components
	 */			
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["col1", "col2"])
		.addChildrenTo("col1", ["name", "code", "notes"])
		.addChildrenTo("col2", ["iso2", "iso3", "active", "hasRegions"]);
	}
});

/* ================= EDITOR: EditPG ================= */


Ext.define("seava.bd.ui.extjs.dc.Country_Dc$EditPG", {
	extend: "e4e.dc.view.AbstractDcvEditPropGrid",
	alias: "widget.bd_Country_Dc$EditPG",

	_defineElements_: function() {
		this._getBuilder_()
			/* controls */
			.addTextField({ name:"id", dataIndex:"id", allowBlank:false})
			.addTextField({ name:"code", dataIndex:"code", allowBlank:false, caseRestriction:"uppercase"})
			.addTextField({ name:"name", dataIndex:"name", allowBlank:false})
			.addTextField({ name:"notes", dataIndex:"notes"})
			.addBooleanField({ name:"active", dataIndex:"active"})
			.addBooleanField({ name:"hasRegions", dataIndex:"hasRegions"})
			.addTextField({ name:"iso2", dataIndex:"iso2", maxLength:2, caseRestriction:"uppercase"})
			.addTextField({ name:"iso3", dataIndex:"iso3", maxLength:3, caseRestriction:"uppercase"})
		;
	}

});
