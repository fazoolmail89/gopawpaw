package com.gopawpaw.erp.hibernate.r;

/**
 * RqrMstr entity. @author MyEclipse Persistence Tools
 */
public class RqrMstr extends AbstractRqrMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqrMstr() {
	}

	/** minimal constructor */
	public RqrMstr(RqrMstrId id, Double oidRqrMstr) {
		super(id, oidRqrMstr);
	}

	/** full constructor */
	public RqrMstr(RqrMstrId id, String rqrChr01, String rqrChr02,
			String rqrChr03, String rqrChr04, String rqrQadc01,
			String rqrQadc02, String rqrQadc03, String rqrQadc04,
			Double oidRqrMstr) {
		super(id, rqrChr01, rqrChr02, rqrChr03, rqrChr04, rqrQadc01, rqrQadc02,
				rqrQadc03, rqrQadc04, oidRqrMstr);
	}

}
