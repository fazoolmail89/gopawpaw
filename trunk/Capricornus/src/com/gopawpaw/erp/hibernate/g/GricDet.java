package com.gopawpaw.erp.hibernate.g;

/**
 * GricDet entity. @author MyEclipse Persistence Tools
 */
public class GricDet extends AbstractGricDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public GricDet() {
	}

	/** minimal constructor */
	public GricDet(GricDetId id, Double oidGricDet) {
		super(id, oidGricDet);
	}

	/** full constructor */
	public GricDet(GricDetId id, Integer gricWidth, Integer gricYear,
			Integer gricPerFrom, Integer gricQuarter, String gricActivity,
			String gricLabel, String gricColType, String gricBgCode,
			Boolean gricPrint, Boolean gricSelect, Integer gricPerTo,
			Boolean gricCurrency, String gricSymbol, String gricUser1,
			String gricUser2, String gricQadc01, Double oidGricDet) {
		super(id, gricWidth, gricYear, gricPerFrom, gricQuarter, gricActivity,
				gricLabel, gricColType, gricBgCode, gricPrint, gricSelect,
				gricPerTo, gricCurrency, gricSymbol, gricUser1, gricUser2,
				gricQadc01, oidGricDet);
	}

}
