/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.lov.Uoms_Lov", {
	extend: "e4e.lov.AbstractCombo",
	alias: "widget.bd_Uoms_Lov",
	displayField: "code",
	listConfig: {
		getInnerTpl: function() {
			return '<span>{code}, {name}</span>';
		},
		width:250, maxHeight:350
	},
	_editFrame_: {
		name: "seava.bd.ui.extjs.frame.Uom_Ui",
		bundle: "seava.mod.bd"
	},
	recordModel: seava.bd.ui.extjs.ds.UomLov_Ds
});
