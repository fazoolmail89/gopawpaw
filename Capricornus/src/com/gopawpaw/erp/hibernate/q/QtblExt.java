package com.gopawpaw.erp.hibernate.q;

import java.util.Date;

/**
 * QtblExt entity. @author MyEclipse Persistence Tools
 */
public class QtblExt extends AbstractQtblExt implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QtblExt() {
	}

	/** minimal constructor */
	public QtblExt(QtblExtId id, String qtblQadc01, String qtblQadc02,
			String qtblQadc03, String qtblQadc04, String qtblQadc05,
			Double qtblQadd01, Double qtblQadd02, Double qtblQadd03,
			Double qtblQadd04, Double qtblQadd05, Boolean qtblQadl01,
			Boolean qtblQadl02, Double oidQtblExt) {
		super(id, qtblQadc01, qtblQadc02, qtblQadc03, qtblQadc04, qtblQadc05,
				qtblQadd01, qtblQadd02, qtblQadd03, qtblQadd04, qtblQadd05,
				qtblQadl01, qtblQadl02, oidQtblExt);
	}

	/** full constructor */
	public QtblExt(QtblExtId id, String qtblQadc01, String qtblQadc02,
			String qtblQadc03, String qtblQadc04, String qtblQadc05,
			Double qtblQadd01, Double qtblQadd02, Double qtblQadd03,
			Double qtblQadd04, Double qtblQadd05, Boolean qtblQadl01,
			Boolean qtblQadl02, Date qtblQadt01, Date qtblQadt02,
			Double oidQtblExt) {
		super(id, qtblQadc01, qtblQadc02, qtblQadc03, qtblQadc04, qtblQadc05,
				qtblQadd01, qtblQadd02, qtblQadd03, qtblQadd04, qtblQadd05,
				qtblQadl01, qtblQadl02, qtblQadt01, qtblQadt02, oidQtblExt);
	}

}
