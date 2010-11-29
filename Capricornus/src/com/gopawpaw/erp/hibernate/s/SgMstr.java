package com.gopawpaw.erp.hibernate.s;

/**
 * SgMstr entity. @author MyEclipse Persistence Tools
 */
public class SgMstr extends AbstractSgMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public SgMstr() {
	}

	/** minimal constructor */
	public SgMstr(SgMstrId id, String sgDesc, String sgInvMov,
			Boolean sgAutoTr, String sgMasterNrId, Double oidSgMstr) {
		super(id, sgDesc, sgInvMov, sgAutoTr, sgMasterNrId, oidSgMstr);
	}

	/** full constructor */
	public SgMstr(SgMstrId id, String sgDesc, String sgInvMov,
			Boolean sgAutoTr, String sgMasterNrId, String sgUser1,
			String sgUser2, String sgQadc01, Double oidSgMstr) {
		super(id, sgDesc, sgInvMov, sgAutoTr, sgMasterNrId, sgUser1, sgUser2,
				sgQadc01, oidSgMstr);
	}

}
