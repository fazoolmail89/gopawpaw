package com.gopawpaw.erp.hibernate.r;

/**
 * RqcMstr entity. @author MyEclipse Persistence Tools
 */
public class RqcMstr extends AbstractRqcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqcMstr() {
	}

	/** minimal constructor */
	public RqcMstr(RqcMstrId id, Double oidRqcMstr) {
		super(id, oidRqcMstr);
	}

	/** full constructor */
	public RqcMstr(RqcMstrId id, String rqcDesc, String rqcChr01,
			String rqcChr02, String rqcChr03, String rqcChr04,
			String rqcQadc01, String rqcQadc02, String rqcQadc03,
			String rqcQadc04, Double oidRqcMstr) {
		super(id, rqcDesc, rqcChr01, rqcChr02, rqcChr03, rqcChr04, rqcQadc01,
				rqcQadc02, rqcQadc03, rqcQadc04, oidRqcMstr);
	}

}
