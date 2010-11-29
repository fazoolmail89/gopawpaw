package com.gopawpaw.erp.hibernate.p;

/**
 * PodDetId entity. @author MyEclipse Persistence Tools
 */
public class PodDetId extends AbstractPodDetId implements java.io.Serializable {

	// Constructors

	/** default constructor */
	public PodDetId() {
	}

	/** minimal constructor */
	public PodDetId(String podDomain, String podNbr) {
		super(podDomain, podNbr);
	}

	/** full constructor */
	public PodDetId(String podDomain, String podNbr, Integer podLine) {
		super(podDomain, podNbr, podLine);
	}

}
