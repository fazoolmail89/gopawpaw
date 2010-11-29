package com.gopawpaw.erp.hibernate.c;

/**
 * CildDetId entity. @author MyEclipse Persistence Tools
 */
public class CildDetId extends AbstractCildDetId implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public CildDetId() {
	}

	/** full constructor */
	public CildDetId(String cildDomain, String cildCorInv, String cildCorSoNbr,
			Integer cildCorLine, String cildLineType) {
		super(cildDomain, cildCorInv, cildCorSoNbr, cildCorLine, cildLineType);
	}

}
