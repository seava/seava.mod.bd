/**
 * Solutii Ecommerce, Automatizare, Validare si Analiza | Seava.ro
 * Copyright: 2013 Nan21 Electronics SRL. All rights reserved.
 * Use is subject to license terms.
 */
Ext.define("seava.bd.ui.extjs.lov.Locations_Lov", {
	extend: "e4e.lov.AbstractCombo",
	alias: "widget.bd_Locations_Lov",
	displayField: "asString",
	listConfig: {
		getInnerTpl: function() {
			return '<span>{asString}</span>';
		},
		width:250, maxHeight:350
	},
	recordModel: seava.bd.ui.extjs.ds.LocationLov_Ds
});
