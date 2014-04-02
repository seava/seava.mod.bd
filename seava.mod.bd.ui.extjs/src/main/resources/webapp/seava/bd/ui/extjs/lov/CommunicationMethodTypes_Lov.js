/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.lov.CommunicationMethodTypes_Lov", {
	extend: "e4e.lov.AbstractCombo",
	alias: "widget.bd_CommunicationMethodTypes_Lov",
	displayField: "name",
	listConfig: {
		getInnerTpl: function() {
			return '<span>{name}, {description}</span>';
		},
		width:250, maxHeight:350
	},
	_editFrame_: {
		name: "seava.bd.ui.extjs.frame.CommunicationMethodTypes_Ui",
		bundle: "seava.mod.bd"
	},
	recordModel: seava.bd.ui.extjs.ds.CommunicationMethodTypeLov_Ds
});
