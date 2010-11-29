package com.gopawpaw.erp.hibernate.a;

import java.util.Date;

/**
 * AbsiMstr entity. @author MyEclipse Persistence Tools
 */
public class AbsiMstr extends AbstractAbsiMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public AbsiMstr() {
	}

	/** full constructor */
	public AbsiMstr(AbsiMstrId id, String absiVoyage, String absiOrigin,
			String absiPortDepart, String absiPortArrive, Date absiDueDate,
			String absiContents, Date absiModDate, String absiModUserid,
			String absiUser1, String absiUser2, String absiQadc01,
			String absiQadc02, String absiCarrierRef2, Double oidAbsiMstr) {
		super(id, absiVoyage, absiOrigin, absiPortDepart, absiPortArrive,
				absiDueDate, absiContents, absiModDate, absiModUserid,
				absiUser1, absiUser2, absiQadc01, absiQadc02, absiCarrierRef2,
				oidAbsiMstr);
	}

}
