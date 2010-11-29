package com.gopawpaw.erp.hibernate.f;

/**
 * FcsSum entity. @author MyEclipse Persistence Tools
 */
public class FcsSum extends AbstractFcsSum implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public FcsSum() {
	}

	/** minimal constructor */
	public FcsSum(FcsSumId id, Double oidFcsSum) {
		super(id, oidFcsSum);
	}

	/** full constructor */
	public FcsSum(FcsSumId id, String fcsFcstQty, String fcsSoldQty,
			String fcsPrFcst, String fcsAbnormal, String fcsUser1,
			String fcsUser2, String fcsQadc01, Double oidFcsSum) {
		super(id, fcsFcstQty, fcsSoldQty, fcsPrFcst, fcsAbnormal, fcsUser1,
				fcsUser2, fcsQadc01, oidFcsSum);
	}

}
