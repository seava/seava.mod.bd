/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.UomConversion_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.UomConversion_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_().addDc("cnv", Ext.create(seava.bd.ui.extjs.dc.UomConversion_Dc,{multiEdit: true}))
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("cnv", {name:"cnvFilter", xtype:"bd_UomConversion_Dc$Filter"})
		.addDcEditGridView("cnv", {name:"cnvEditList", xtype:"bd_UomConversion_Dc$EditList", frame:true})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["cnvFilter", "cnvEditList"], ["north", "center"])
		.addToolbarTo("main", "tlbCnvEditList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbCnvEditList", {dc: "cnv"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addReports()
		.end();
	}

});
