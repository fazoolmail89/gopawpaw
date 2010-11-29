package com.gopawpaw.erp.hibernate.r;

/**
 * RqlMstr entity. @author MyEclipse Persistence Tools
 */
public class RqlMstr extends AbstractRqlMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public RqlMstr() {
	}

	/** minimal constructor */
	public RqlMstr(RqlMstrId id, Double oidRqlMstr) {
		super(id, oidRqlMstr);
	}

	/** full constructor */
	public RqlMstr(RqlMstrId id, Double rqlAmt, String rqlDesc,
			String rqlChr01, String rqlChr02, String rqlChr03, Double rqlDec01,
			String rqlChr04, String rqlQadc01, String rqlQadc02,
			String rqlQadc03, String rqlQadc04, Double oidRqlMstr) {
		super(id, rqlAmt, rqlDesc, rqlChr01, rqlChr02, rqlChr03, rqlDec01,
				rqlChr04, rqlQadc01, rqlQadc02, rqlQadc03, rqlQadc04,
				oidRqlMstr);
	}

}
