/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.dc.Uom_Dc", {
	extend: "e4e.dc.AbstractDc",
	recordModel: seava.bd.ui.extjs.ds.Uom_Ds
});

/* ================= FILTER FORM: Filter ================= */

Ext.define("seava.bd.ui.extjs.dc.Uom_Dc$Filter", {
	extend: "e4e.dc.view.AbstractDcvFilterForm",
	alias: "widget.bd_Uom_Dc$Filter",

	/**
	 * Components definition
	 */	
	_defineElements_: function() {
		this._getBuilder_()
		
		/* =========== controls =========== */
		.addTextField({ name:"name", dataIndex:"name"})
		.addLov({name:"code", dataIndex:"code", xtype:"bd_Uoms_Lov", caseRestriction:"uppercase",
			retFieldMapping: [{lovField:"id", dsField: "id"} ]})
		.addBooleanField({ name:"active", dataIndex:"active"})
		.addLov({name:"type", dataIndex:"type", xtype:"bd_UomTypes_Lov", caseRestriction:"uppercase",
			retFieldMapping: [{lovField:"id", dsField: "typeId"} ]})
		
		/* =========== containers =========== */
		.addPanel({ name:"main", autoScroll:true, layout: {type:"hbox", align:'top', pack:'start', defaultMargins: {right:5, left:5}},
		autoScroll:true, padding:"0 30 5 0"})
		.addPanel({ name:"col1", width:250, layout:"form"})
		.addPanel({ name:"col2", width:210, layout:"form"});
	},

	/**
	 * Combine the components
	 */				
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["col1", "col2"])
		.addChildrenTo("col1", ["code", "name"])
		.addChildrenTo("col2", ["type", "active"]);
	}
});

/* ================= GRID: List ================= */

Ext.define("seava.bd.ui.extjs.dc.Uom_Dc$List", {
	extend: "e4e.dc.view.AbstractDcvGrid",
	alias: "widget.bd_Uom_Dc$List",

	/**
	 * Columns definition
	 */
	_defineColumns_: function() {
		this._getBuilder_()
		.addTextColumn({ name:"code", dataIndex:"code", width:120})
		.addTextColumn({ name:"name", dataIndex:"name", width:200})
		.addTextColumn({ name:"type", dataIndex:"type", width:120})
		.addBooleanColumn({ name:"active", dataIndex:"active"})
		.addTextColumn({ name:"description", dataIndex:"description", width:200})
		.addTextColumn({ name:"typeId", dataIndex:"typeId", hidden:true, width:100})
		.addDefaults();
	}
});

/* ================= EDIT-GRID: EditList ================= */

Ext.define("seava.bd.ui.extjs.dc.Uom_Dc$EditList", {
	extend: "e4e.dc.view.AbstractDcvEditableGrid",
	alias: "widget.bd_Uom_Dc$EditList",
	_bulkEditFields_: ["type","active"],

	/**
	 * Columns definition
	 */
	_defineColumns_: function() {
		this._getBuilder_()	
		.addTextColumn({name:"code", dataIndex:"code", width:100, caseRestriction:"uppercase"})
		.addTextColumn({name:"name", dataIndex:"name", width:150})
		.addLov({name:"type", dataIndex:"type", xtype:"gridcolumn", width:100, 
			editor:{xtype:"bd_UomTypes_Lov", selectOnFocus:true, caseRestriction:"uppercase",
				retFieldMapping: [{lovField:"id", dsField: "typeId"} ]}})
		.addBooleanColumn({name:"active", dataIndex:"active"})
		.addTextColumn({name:"description", dataIndex:"description", width:150})
		.addTextColumn({name:"typeId", dataIndex:"typeId", hidden:true, width:100, noEdit: true})
		.addDefaults();
	}
});

/* ================= EDIT FORM: Edit ================= */

Ext.define("seava.bd.ui.extjs.dc.Uom_Dc$Edit", {
	extend: "e4e.dc.view.AbstractDcvEditForm",
	alias: "widget.bd_Uom_Dc$Edit",

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		
		/* =========== controls =========== */
		.addTextField({ name:"name", dataIndex:"name", allowBlank:false})
		.addTextField({ name:"code", dataIndex:"code", allowBlank:false, caseRestriction:"uppercase"})
		.addBooleanField({ name:"active", dataIndex:"active"})
		.addTextArea({ name:"notes", dataIndex:"notes"})
		.addLov({name:"type", dataIndex:"type", allowBlank:false, xtype:"bd_UomTypes_Lov", caseRestriction:"uppercase",
			retFieldMapping: [{lovField:"id", dsField: "typeId"} ]})
		/* =========== containers =========== */
		.addPanel({ name:"main", autoScroll:true, layout: {type:"hbox", align:'top', pack:'start', defaultMargins: {right:5, left:5}},
		autoScroll:true, padding:"0 30 5 0"})
		.addPanel({ name:"col1", width:350, layout:"form"})
		.addPanel({ name:"col2", width:300, layout:"form"});
	},

	/**
	 * Combine the components
	 */			
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["col1", "col2"])
		.addChildrenTo("col1", ["name", "code", "type"])
		.addChildrenTo("col2", ["notes", "active"]);
	}
});
