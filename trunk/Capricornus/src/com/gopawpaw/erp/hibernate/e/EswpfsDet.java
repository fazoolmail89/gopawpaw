package com.gopawpaw.erp.hibernate.e;

import java.util.Date;

/**
 * EswpfsDet entity. @author MyEclipse Persistence Tools
 */
public class EswpfsDet extends AbstractEswpfsDet implements
		java.io.Serializable {

	// Constructors

	/** default constructor */
	public EswpfsDet() {
	}

	/** full constructor */
	public EswpfsDet(EswpfsDetId id, Double oidEswpfsDet, String eswpfsSetDesc,
			Date eswpfsModDate, String eswpfsModUserid, String eswpfsUser1,
			String eswpfsUser2, String eswpfsQadc01, String eswpfsQadc02) {
		super(id, oidEswpfsDet, eswpfsSetDesc, eswpfsModDate, eswpfsModUserid,
				eswpfsUser1, eswpfsUser2, eswpfsQadc01, eswpfsQadc02);
	}

}
