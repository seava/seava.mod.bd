/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.CommunicationMethod_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.CommunicationMethod_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_()	
		.addDc("cmnc", Ext.create(seava.bd.ui.extjs.dc.CommunicationMethod_Dc,{}))
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("cmnc", {name:"cmncFilter", xtype:"bd_CommunicationMethod_Dc$Filter"})
		.addDcGridView("cmnc", {name:"cmncList", xtype:"bd_CommunicationMethod_Dc$List"})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["cmncFilter", "cmncList"], ["north", "center"])
		.addToolbarTo("main", "tlbCmncList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbCmncList", {dc: "cmnc"})
			.addTitle().addSeparator().addSeparator()
			.addQuery()
			.addReports()
		.end();
	}

});
