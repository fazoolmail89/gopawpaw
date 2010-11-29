package com.gopawpaw.erp.hibernate.r;

/**
 * RsnRef entity. @author MyEclipse Persistence Tools
 */
public class RsnRef extends AbstractRsnRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RsnRef() {
	}

	/** minimal constructor */
	public RsnRef(RsnRefId id, Double oidRsnRef) {
		super(id, oidRsnRef);
	}

	/** full constructor */
	public RsnRef(RsnRefId id, String rsnDesc, String rsnUser1,
			String rsnUser2, String rsnQadc01, Double oidRsnRef) {
		super(id, rsnDesc, rsnUser1, rsnUser2, rsnQadc01, oidRsnRef);
	}

}
