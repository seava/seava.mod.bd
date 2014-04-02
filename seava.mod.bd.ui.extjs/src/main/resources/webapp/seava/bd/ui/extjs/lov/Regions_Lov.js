/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.lov.Regions_Lov", {
	extend: "e4e.lov.AbstractCombo",
	alias: "widget.bd_Regions_Lov",
	displayField: "code",
	listConfig: {
		getInnerTpl: function() {
			return '<span>{code}, {name}, {country}</span>';
		},
		width:250, maxHeight:350
	},
	_editFrame_: {
		name: "seava.bd.ui.extjs.frame.Region_Ui",
		bundle: "seava.mod.bd"
	},
	recordModel: seava.bd.ui.extjs.ds.RegionLov_Ds
});
