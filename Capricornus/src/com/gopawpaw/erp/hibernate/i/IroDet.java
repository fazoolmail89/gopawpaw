package com.gopawpaw.erp.hibernate.i;

import java.util.Date;

/**
 * IroDet entity. @author MyEclipse Persistence Tools
 */
public class IroDet extends AbstractIroDet implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public IroDet() {
	}

	/** minimal constructor */
	public IroDet(IroDetId id, Double iroNrv, Double oidIroDet) {
		super(id, iroNrv, oidIroDet);
	}

	/** full constructor */
	public IroDet(IroDetId id, Double iroCostTot, Date iroDate,
			Double iroMtlTl, Double iroLbrTl, Double iroBdnTl, Double iroSubTl,
			Double iroOvhTl, Double iroMtlLl, Double iroLbrLl, Double iroBdnLl,
			Double iroSubLl, Double iroOvhLl, String iroUser1, String iroUser2,
			Double iroValue01, Double iroValue02, Double iroValue03,
			Double iroValue04, Double iroValue05, Double iroNrv,
			String iroQadc01, Double oidIroDet) {
		super(id, iroCostTot, iroDate, iroMtlTl, iroLbrTl, iroBdnTl, iroSubTl,
				iroOvhTl, iroMtlLl, iroLbrLl, iroBdnLl, iroSubLl, iroOvhLl,
				iroUser1, iroUser2, iroValue01, iroValue02, iroValue03,
				iroValue04, iroValue05, iroNrv, iroQadc01, oidIroDet);
	}

}
