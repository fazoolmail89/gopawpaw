package com.gopawpaw.erp.hibernate.e;

/**
 * EgaMstr entity. @author MyEclipse Persistence Tools
 */
public class EgaMstr extends AbstractEgaMstr implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public EgaMstr() {
	}

	/** minimal constructor */
	public EgaMstr(EgaMstrId id, Double oidEgaMstr) {
		super(id, oidEgaMstr);
	}

	/** full constructor */
	public EgaMstr(EgaMstrId id, String egaAvailHours, String egaHours,
			String egaCalls, String egaUser1, String egaUser2,
			Integer egaInt01, Integer egaQadi01, Double egaDec01,
			Double egaQade01, Boolean egaLog01, Boolean egaQadl01,
			Double oidEgaMstr) {
		super(id, egaAvailHours, egaHours, egaCalls, egaUser1, egaUser2,
				egaInt01, egaQadi01, egaDec01, egaQade01, egaLog01, egaQadl01,
				oidEgaMstr);
	}

}
