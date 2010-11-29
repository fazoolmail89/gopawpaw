package com.gopawpaw.erp.hibernate.r;

/**
 * RqhHist entity. @author MyEclipse Persistence Tools
 */
public class RqhHist extends AbstractRqhHist implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqhHist() {
	}

	/** minimal constructor */
	public RqhHist(RqhHistId id, Double oidRqhHist) {
		super(id, oidRqhHist);
	}

	/** full constructor */
	public RqhHist(RqhHistId id, Integer rqhLine, String rqhAprUserid,
			String rqhRole, String rqhAction, String rqhEntUserid,
			String rqhRttoUserid, String rqhEmailList, String rqhRoleList,
			String rqhChr01, String rqhChr02, String rqhChr03, String rqhChr04,
			String rqhQadc01, String rqhQadc02, String rqhQadc03,
			String rqhQadc04, Double oidRqhHist) {
		super(id, rqhLine, rqhAprUserid, rqhRole, rqhAction, rqhEntUserid,
				rqhRttoUserid, rqhEmailList, rqhRoleList, rqhChr01, rqhChr02,
				rqhChr03, rqhChr04, rqhQadc01, rqhQadc02, rqhQadc03, rqhQadc04,
				oidRqhHist);
	}

}
