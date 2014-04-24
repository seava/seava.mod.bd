/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.Uom_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.Uom_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_().addDc("uom", Ext.create(seava.bd.ui.extjs.dc.Uom_Dc,{multiEdit: true}))
		.addDc("cnv", Ext.create(seava.bd.ui.extjs.dc.UomConversion_Dc,{multiEdit: true}))
		.linkDc("cnv", "uom",{fields:[
					{childField:"sourceId", parentField:"id"}, {childField:"source", parentField:"code", noFilter:true}]})
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("uom", {name:"uomFilter", xtype:"bd_Uom_Dc$Filter"})
		.addDcEditGridView("uom", {name:"uomEditList", xtype:"bd_Uom_Dc$EditList", frame:true})
		.addDcEditGridView("cnv", {name:"cnvEditList", width:600, xtype:"bd_UomConversion_Dc$CtxEditList", frame:true})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["uomFilter", "uomEditList", "cnvEditList"], ["north", "center", "east"])
		.addToolbarTo("main", "tlbUomEditList")
		.addToolbarTo("cnvEditList", "tlbCnvEditList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbUomEditList", {dc: "uom"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addReports()
		.end()
		.beginToolbar("tlbCnvEditList", {dc: "cnv"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addSeparator().addAutoLoad()
			.addReports()
		.end();
	}

});
