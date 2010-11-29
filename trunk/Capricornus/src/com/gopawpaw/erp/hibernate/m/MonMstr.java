package com.gopawpaw.erp.hibernate.m;

import java.util.Date;

/**
 * MonMstr entity. @author MyEclipse Persistence Tools
 */
public class MonMstr extends AbstractMonMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public MonMstr() {
	}

	/** minimal constructor */
	public MonMstr(MonMstrId id, String monProgUser, String monInterface,
			Double oidMonMstr) {
		super(id, monProgUser, monInterface, oidMonMstr);
	}

	/** full constructor */
	public MonMstr(MonMstrId id, Integer monOraId1, Integer monOraId2,
			String monSelection, Integer monTimeStart, Integer monLoginTime,
			Integer monIdleTime, String monProgram, String monUser1,
			String monUser2, String monQadc01, Integer monQadi01,
			Double monQadd01, Boolean monQadl01, Date monQadt01,
			String monProgUser, Date monLoginDate, String monInterface,
			Date monDateStart, Double oidMonMstr) {
		super(id, monOraId1, monOraId2, monSelection, monTimeStart,
				monLoginTime, monIdleTime, monProgram, monUser1, monUser2,
				monQadc01, monQadi01, monQadd01, monQadl01, monQadt01,
				monProgUser, monLoginDate, monInterface, monDateStart,
				oidMonMstr);
	}

}
