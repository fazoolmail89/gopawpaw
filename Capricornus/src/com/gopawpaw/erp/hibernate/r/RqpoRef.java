package com.gopawpaw.erp.hibernate.r;

/**
 * RqpoRef entity. @author MyEclipse Persistence Tools
 */
public class RqpoRef extends AbstractRqpoRef implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqpoRef() {
	}

	/** minimal constructor */
	public RqpoRef(RqpoRefId id, Double oidRqpoRef) {
		super(id, oidRqpoRef);
	}

	/** full constructor */
	public RqpoRef(RqpoRefId id, Double rqpoQtyOrd, String rqpoChr01,
			String rqpoChr02, String rqpoChr03, String rqpoChr04,
			String rqpoQadc01, String rqpoQadc02, String rqpoQadc03,
			String rqpoQadc04, Double oidRqpoRef) {
		super(id, rqpoQtyOrd, rqpoChr01, rqpoChr02, rqpoChr03, rqpoChr04,
				rqpoQadc01, rqpoQadc02, rqpoQadc03, rqpoQadc04, oidRqpoRef);
	}

}
