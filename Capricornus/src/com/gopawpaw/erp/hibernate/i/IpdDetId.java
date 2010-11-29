package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IpdDetId entity. @author MyEclipse Persistence Tools
 */
public class IpdDetId extends AbstractIpdDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IpdDetId() {
	}

	/** minimal constructor */
	public IpdDetId(String ipdDomain, Double oidIpdDet) {
		super(ipdDomain, oidIpdDet);
	}

	/** full constructor */
	public IpdDetId(String ipdPart, String ipdRouting, Integer ipdOp,
			String ipdNbr, String ipdTest, String ipdLabel, String ipdTol,
			Boolean ipdInclude, Integer ipdCmtindx, String ipdUser1,
			String ipdUser2, String ipdTolType, String ipdChr01,
			String ipdChr02, String ipdChr03, String ipdChr04, String ipdChr05,
			Double ipdDec01, Double ipdDec02, Date ipdStart, Date ipdEnd,
			String ipdTestmthd, String ipdAttribute, String ipdDomain,
			Double oidIpdDet) {
		super(ipdPart, ipdRouting, ipdOp, ipdNbr, ipdTest, ipdLabel, ipdTol,
				ipdInclude, ipdCmtindx, ipdUser1, ipdUser2, ipdTolType,
				ipdChr01, ipdChr02, ipdChr03, ipdChr04, ipdChr05, ipdDec01,
				ipdDec02, ipdStart, ipdEnd, ipdTestmthd, ipdAttribute,
				ipdDomain, oidIpdDet);
	}

}
