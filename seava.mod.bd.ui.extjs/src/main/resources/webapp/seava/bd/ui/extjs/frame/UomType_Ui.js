/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.UomType_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.UomType_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_().addDc("type", Ext.create(seava.bd.ui.extjs.dc.UomType_Dc,{multiEdit: true}))
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("type", {name:"typeFilter", height:80, xtype:"bd_UomType_Dc$Filter"})
		.addDcEditGridView("type", {name:"typeEditList", xtype:"bd_UomType_Dc$EditList", frame:true})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["typeFilter", "typeEditList"], ["north", "center"])
		.addToolbarTo("main", "tlbTypeEditList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbTypeEditList", {dc: "type"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addReports()
		.end();
	}

});
