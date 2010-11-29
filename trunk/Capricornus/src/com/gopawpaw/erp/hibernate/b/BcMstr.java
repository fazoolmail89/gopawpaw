package com.gopawpaw.erp.hibernate.b;

/**
 * BcMstr entity. @author MyEclipse Persistence Tools
 */
public class BcMstr extends AbstractBcMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public BcMstr() {
	}

	/** minimal constructor */
	public BcMstr(BcMstrId id, Double oidBcMstr) {
		super(id, oidBcMstr);
	}

	/** full constructor */
	public BcMstr(BcMstrId id, Boolean bcPerm, Integer bcPriority,
			String bcUser1, String bcUser2, String bcDesc, Integer bcCmtindx,
			String bcCanrun, String bcQadc01, Double oidBcMstr) {
		super(id, bcPerm, bcPriority, bcUser1, bcUser2, bcDesc, bcCmtindx,
				bcCanrun, bcQadc01, oidBcMstr);
	}

}
