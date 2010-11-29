package com.gopawpaw.erp.hibernate.q;

/**
 * QccCtrl entity. @author MyEclipse Persistence Tools
 */
public class QccCtrl extends AbstractQccCtrl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QccCtrl() {
	}

	/** minimal constructor */
	public QccCtrl(Double oidQccCtrl) {
		super(oidQccCtrl);
	}

	/** full constructor */
	public QccCtrl(String qccSite, String qccInspect, Integer qccQadi01,
			Boolean qccWcmmts, String qccUser1, String qccUser2,
			Boolean qccRcmmts, Integer qccNbr, Integer qccLot,
			Boolean qccAutoNbr, String qccQadc01, Double oidQccCtrl) {
		super(qccSite, qccInspect, qccQadi01, qccWcmmts, qccUser1, qccUser2,
				qccRcmmts, qccNbr, qccLot, qccAutoNbr, qccQadc01, oidQccCtrl);
	}

}
