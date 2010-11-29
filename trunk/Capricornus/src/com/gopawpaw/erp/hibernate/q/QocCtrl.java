package com.gopawpaw.erp.hibernate.q;

/**
 * QocCtrl entity. @author MyEclipse Persistence Tools
 */
public class QocCtrl extends AbstractQocCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QocCtrl() {
	}

	/** minimal constructor */
	public QocCtrl(String qocExRatetype, Double oidQocCtrl) {
		super(qocExRatetype, oidQocCtrl);
	}

	/** full constructor */
	public QocCtrl(Integer qocQo, Boolean qocLnFmt, Boolean qocPrint,
			String qocCompany, String qocFob, Boolean qocHcmmts,
			Boolean qocLcmmts, Integer qocDays, Integer qocQad01,
			String qocUser1, String qocUser2, Integer qocQadi01,
			Boolean qocFrBySite, String qocQoPre, Boolean qocPlReq,
			Boolean qocPcLine, Boolean qocPtReq, String qocExRatetype,
			Double oidQocCtrl) {
		super(qocQo, qocLnFmt, qocPrint, qocCompany, qocFob, qocHcmmts,
				qocLcmmts, qocDays, qocQad01, qocUser1, qocUser2, qocQadi01,
				qocFrBySite, qocQoPre, qocPlReq, qocPcLine, qocPtReq,
				qocExRatetype, oidQocCtrl);
	}

}
