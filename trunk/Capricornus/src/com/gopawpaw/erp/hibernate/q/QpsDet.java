package com.gopawpaw.erp.hibernate.q;

/**
 * QpsDet entity. @author MyEclipse Persistence Tools
 */
public class QpsDet extends AbstractQpsDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QpsDet() {
	}

	/** minimal constructor */
	public QpsDet(QpsDetId id, Double qpsQty, Double oidQpsDet) {
		super(id, qpsQty, oidQpsDet);
	}

	/** full constructor */
	public QpsDet(QpsDetId id, String qpsUser1, Double qpsQty, String qpsUser2,
			String qpsChr01, String qpsChr03, String qpsChr04, String qpsChr05,
			Double qpsDec01, Double qpsDec02, Double qpsDec03,
			Boolean qpsLog01, Double oidQpsDet) {
		super(id, qpsUser1, qpsQty, qpsUser2, qpsChr01, qpsChr03, qpsChr04,
				qpsChr05, qpsDec01, qpsDec02, qpsDec03, qpsLog01, oidQpsDet);
	}

}
