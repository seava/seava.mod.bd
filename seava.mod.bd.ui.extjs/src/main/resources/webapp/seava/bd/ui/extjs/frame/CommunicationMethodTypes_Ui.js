/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.frame.CommunicationMethodTypes_Ui", {
	extend: "e4e.ui.AbstractUi",
	alias: "widget.CommunicationMethodTypes_Ui",
	
	/**
	 * Data-controls definition
	 */
	_defineDcs_: function() {
		this._getBuilder_().addDc("ctype", Ext.create(seava.bd.ui.extjs.dc.CommunicationMethodType_Dc,{multiEdit: true}))
		.addDc("targetRule", Ext.create(seava.ad.ui.extjs.dc.TargetRule_Dc,{multiEdit: true}))
		.linkDc("targetRule", "ctype",{fields:[
					{childField:"sourceRefId", parentField:"refid"}]})
		;
	},

	/**
	 * Components definition
	 */
	_defineElements_: function() {
		this._getBuilder_()
		.addDcFilterFormView("ctype", {name:"ctypeFilter", xtype:"bd_CommunicationMethodType_Dc$Filter"})
		.addDcEditGridView("ctype", {name:"ctypeEditList", xtype:"bd_CommunicationMethodType_Dc$EditList", frame:true})
		.addDcEditGridView("targetRule", {name:"targetRuleList", height:240, xtype:"ad_TargetRule_Dc$EditList", frame:true})
		.addPanel({name:"main", layout:"border", defaults:{split:true}});
	},
	
	/**
	 * Combine the components
	 */
	_linkElements_: function() {
		this._getBuilder_()
		.addChildrenTo("main", ["ctypeFilter", "ctypeEditList", "targetRuleList"], ["north", "center", "south"])
		.addToolbarTo("main", "tlbCtypeEditList")
		.addToolbarTo("targetRuleList", "tlbTargetRuleEditList");
	},
	
	/**
	 * Create toolbars
	 */
	_defineToolbars_: function() {
		this._getBuilder_()
		.beginToolbar("tlbCtypeEditList", {dc: "ctype"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addReports()
		.end()
		.beginToolbar("tlbTargetRuleEditList", {dc: "targetRule"})
			.addTitle().addSeparator().addSeparator()
			.addQuery().addSave().addNew().addCopy().addDelete().addCancel()
			.addSeparator().addAutoLoad()
			.addReports()
		.end();
	}

});
