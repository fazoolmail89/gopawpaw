package com.gopawpaw.erp.hibernate.e;

/**
 * Ecd4Det entity. @author MyEclipse Persistence Tools
 */
public class Ecd4Det extends AbstractEcd4Det implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public Ecd4Det() {
	}

	/** minimal constructor */
	public Ecd4Det(Ecd4DetId id, String ecd4Property, Integer ecd4Cmtindx,
			String ecd4User1, String ecd4User2, String ecd4Propertyum,
			Integer ecd4Specid, Integer ecd4DocNbr, String ecd4Testmthd,
			String ecd4Minimum, String ecd4Maximum, String ecd4Target,
			String ecd4Attribute, String ecd4Attach, String ecd4SpecDet,
			Double ecd4DocRev, Double oidEcd4Det) {
		super(id, ecd4Property, ecd4Cmtindx, ecd4User1, ecd4User2,
				ecd4Propertyum, ecd4Specid, ecd4DocNbr, ecd4Testmthd,
				ecd4Minimum, ecd4Maximum, ecd4Target, ecd4Attribute,
				ecd4Attach, ecd4SpecDet, ecd4DocRev, oidEcd4Det);
	}

	/** full constructor */
	public Ecd4Det(Ecd4DetId id, String ecd4Property, Integer ecd4Cmtindx,
			String ecd4User1, String ecd4User2, String ecd4Propertyum,
			Integer ecd4Specid, Integer ecd4Qadi01, Integer ecd4DocNbr,
			String ecd4Testmthd, String ecd4Minimum, String ecd4Maximum,
			String ecd4Target, String ecd4Attribute, String ecd4Attach,
			String ecd4SpecDet, Double ecd4DocRev, String ecd4Qadc01,
			Double oidEcd4Det) {
		super(id, ecd4Property, ecd4Cmtindx, ecd4User1, ecd4User2,
				ecd4Propertyum, ecd4Specid, ecd4Qadi01, ecd4DocNbr,
				ecd4Testmthd, ecd4Minimum, ecd4Maximum, ecd4Target,
				ecd4Attribute, ecd4Attach, ecd4SpecDet, ecd4DocRev, ecd4Qadc01,
				oidEcd4Det);
	}

}
