package com.gopawpaw.erp.hibernate.i;

/**
 * IbDet entity. @author MyEclipse Persistence Tools
 */
public class IbDet extends AbstractIbDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IbDet() {
	}

	/** minimal constructor */
	public IbDet(IbDetId id, Double oidIbDet) {
		super(id, oidIbDet);
	}

	/** full constructor */
	public IbDet(IbDetId id, String ibLevel, String ibContract, Boolean ibTag,
			String ibCompSer, Integer ibCompRef, String ibCover, String ibDesc,
			Integer ibIntLevel, String ibUser1, String ibUser2,
			String ibQadc01, Double oidIbDet) {
		super(id, ibLevel, ibContract, ibTag, ibCompSer, ibCompRef, ibCover,
				ibDesc, ibIntLevel, ibUser1, ibUser2, ibQadc01, oidIbDet);
	}

}
