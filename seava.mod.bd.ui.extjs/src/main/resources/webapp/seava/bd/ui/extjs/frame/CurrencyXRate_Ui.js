/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.CurrencyXRate_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.CurrencyXRate_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_()	
		.addDc("xrate", Ext.create(seava.bd.ui.extjs.dc.CurrencyXRate_Dc,{multiEdit:true}))
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("xrate", {name:"xrateFilter", height:80, xtype:"bd_CurrencyXRate_Dc$Filter"})
		.addDcEditGridView("xrate", {name:"xrateEditList", xtype:"bd_CurrencyXRate_Dc$EditList", frame:true})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["xrateFilter", "xrateEditList"], ["north", "center"])
		.addToolbarTo("main", "tlbXrateEditList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbXrateEditList", {dc: "xrate"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addReports()
		.end();
	}

});
