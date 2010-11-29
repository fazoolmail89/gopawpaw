package com.gopawpaw.erp.hibernate.q;

/**
 * QcsMstr entity. @author MyEclipse Persistence Tools
 */
public class QcsMstr extends AbstractQcsMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public QcsMstr() {
	}

	/** minimal constructor */
	public QcsMstr(QcsMstrId id, Double oidQcsMstr) {
		super(id, oidQcsMstr);
	}

	/** full constructor */
	public QcsMstr(QcsMstrId id, Integer qcsLotInt, Integer qcsDays,
			String qcsUser1, String qcsUser2, String qcsChr01, String qcsChr02,
			String qcsChr03, String qcsChr04, String qcsChr05, Double oidQcsMstr) {
		super(id, qcsLotInt, qcsDays, qcsUser1, qcsUser2, qcsChr01, qcsChr02,
				qcsChr03, qcsChr04, qcsChr05, oidQcsMstr);
	}

}
