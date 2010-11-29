package com.gopawpaw.erp.hibernate.q;

/**
 * QadWkfl entity. @author MyEclipse Persistence Tools
 */
public class QadWkfl extends AbstractQadWkfl implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QadWkfl() {
	}

	/** minimal constructor */
	public QadWkfl(QadWkflId id, Double oidQadWkfl) {
		super(id, oidQadWkfl);
	}

	/** full constructor */
	public QadWkfl(QadWkflId id, String qadKey3, String qadKey4,
			String qadKey5, String qadKey6, String qadCharfld,
			String qadDecfld, String qadDatefld, String qadUser1,
			String qadUser2, String qadQadc01, String qadLogfld,
			String qadCharfld1, String qadIntfld, Double oidQadWkfl) {
		super(id, qadKey3, qadKey4, qadKey5, qadKey6, qadCharfld, qadDecfld,
				qadDatefld, qadUser1, qadUser2, qadQadc01, qadLogfld,
				qadCharfld1, qadIntfld, oidQadWkfl);
	}

}
