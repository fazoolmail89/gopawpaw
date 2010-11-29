package com.gopawpaw.erp.hibernate.c;

/**
 * CtryMstr entity. @author MyEclipse Persistence Tools
 */
public class CtryMstr extends AbstractCtryMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public CtryMstr() {
	}

	/** minimal constructor */
	public CtryMstr(String ctryCountry, Boolean ctryEcFlag,
			String ctryVatRegPrefix, String ctryIeCode, Double oidCtryMstr) {
		super(ctryCountry, ctryEcFlag, ctryVatRegPrefix, ctryIeCode,
				oidCtryMstr);
	}

	/** full constructor */
	public CtryMstr(String ctryCountry, Boolean ctryEcFlag, String ctryCode1,
			String ctryQad01, String ctryQad02, String ctryUser1,
			Boolean ctryQad04, String ctryUser2, String ctryQad03,
			Boolean ctryQad05, Boolean ctryLog01, String ctryChr01,
			String ctryGroup, Boolean ctryNaftaFlag, Integer ctryCmtindx,
			String ctryType, Boolean ctryDeaFlag, Boolean ctryGattFlag,
			String ctryVatRegPrefix, String ctryIeCode, Double oidCtryMstr) {
		super(ctryCountry, ctryEcFlag, ctryCode1, ctryQad01, ctryQad02,
				ctryUser1, ctryQad04, ctryUser2, ctryQad03, ctryQad05,
				ctryLog01, ctryChr01, ctryGroup, ctryNaftaFlag, ctryCmtindx,
				ctryType, ctryDeaFlag, ctryGattFlag, ctryVatRegPrefix,
				ctryIeCode, oidCtryMstr);
	}

}
