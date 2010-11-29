package com.gopawpaw.erp.hibernate.l;

/**
 * AbstractLadDetId entity provides the base persistence definition of the
 * LadDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractLadDetId implements java.io.Serializable {

	// Fields

	private String ladDomain;
	private String ladDataset;
	private String ladNbr;
	private String ladLine;
	private String ladPart;
	private String ladSite;
	private String ladLoc;
	private String ladLot;
	private String ladRef;

	// Constructors

	/** default constructor */
	public AbstractLadDetId() {
	}

	/** minimal constructor */
	public AbstractLadDetId(String ladDomain) {
		this.ladDomain = ladDomain;
	}

	/** full constructor */
	public AbstractLadDetId(String ladDomain, String ladDataset, String ladNbr,
			String ladLine, String ladPart, String ladSite, String ladLoc,
			String ladLot, String ladRef) {
		this.ladDomain = ladDomain;
		this.ladDataset = ladDataset;
		this.ladNbr = ladNbr;
		this.ladLine = ladLine;
		this.ladPart = ladPart;
		this.ladSite = ladSite;
		this.ladLoc = ladLoc;
		this.ladLot = ladLot;
		this.ladRef = ladRef;
	}

	// Property accessors

	public String getLadDomain() {
		return this.ladDomain;
	}

	public void setLadDomain(String ladDomain) {
		this.ladDomain = ladDomain;
	}

	public String getLadDataset() {
		return this.ladDataset;
	}

	public void setLadDataset(String ladDataset) {
		this.ladDataset = ladDataset;
	}

	public String getLadNbr() {
		return this.ladNbr;
	}

	public void setLadNbr(String ladNbr) {
		this.ladNbr = ladNbr;
	}

	public String getLadLine() {
		return this.ladLine;
	}

	public void setLadLine(String ladLine) {
		this.ladLine = ladLine;
	}

	public String getLadPart() {
		return this.ladPart;
	}

	public void setLadPart(String ladPart) {
		this.ladPart = ladPart;
	}

	public String getLadSite() {
		return this.ladSite;
	}

	public void setLadSite(String ladSite) {
		this.ladSite = ladSite;
	}

	public String getLadLoc() {
		return this.ladLoc;
	}

	public void setLadLoc(String ladLoc) {
		this.ladLoc = ladLoc;
	}

	public String getLadLot() {
		return this.ladLot;
	}

	public void setLadLot(String ladLot) {
		this.ladLot = ladLot;
	}

	public String getLadRef() {
		return this.ladRef;
	}

	public void setLadRef(String ladRef) {
		this.ladRef = ladRef;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof AbstractLadDetId))
			return false;
		AbstractLadDetId castOther = (AbstractLadDetId) other;

		return ((this.getLadDomain() == castOther.getLadDomain()) || (this
				.getLadDomain() != null
				&& castOther.getLadDomain() != null && this.getLadDomain()
				.equals(castOther.getLadDomain())))
				&& ((this.getLadDataset() == castOther.getLadDataset()) || (this
						.getLadDataset() != null
						&& castOther.getLadDataset() != null && this
						.getLadDataset().equals(castOther.getLadDataset())))
				&& ((this.getLadNbr() == castOther.getLadNbr()) || (this
						.getLadNbr() != null
						&& castOther.getLadNbr() != null && this.getLadNbr()
						.equals(castOther.getLadNbr())))
				&& ((this.getLadLine() == castOther.getLadLine()) || (this
						.getLadLine() != null
						&& castOther.getLadLine() != null && this.getLadLine()
						.equals(castOther.getLadLine())))
				&& ((this.getLadPart() == castOther.getLadPart()) || (this
						.getLadPart() != null
						&& castOther.getLadPart() != null && this.getLadPart()
						.equals(castOther.getLadPart())))
				&& ((this.getLadSite() == castOther.getLadSite()) || (this
						.getLadSite() != null
						&& castOther.getLadSite() != null && this.getLadSite()
						.equals(castOther.getLadSite())))
				&& ((this.getLadLoc() == castOther.getLadLoc()) || (this
						.getLadLoc() != null
						&& castOther.getLadLoc() != null && this.getLadLoc()
						.equals(castOther.getLadLoc())))
				&& ((this.getLadLot() == castOther.getLadLot()) || (this
						.getLadLot() != null
						&& castOther.getLadLot() != null && this.getLadLot()
						.equals(castOther.getLadLot())))
				&& ((this.getLadRef() == castOther.getLadRef()) || (this
						.getLadRef() != null
						&& castOther.getLadRef() != null && this.getLadRef()
						.equals(castOther.getLadRef())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getLadDomain() == null ? 0 : this.getLadDomain().hashCode());
		result = 37
				* result
				+ (getLadDataset() == null ? 0 : this.getLadDataset()
						.hashCode());
		result = 37 * result
				+ (getLadNbr() == null ? 0 : this.getLadNbr().hashCode());
		result = 37 * result
				+ (getLadLine() == null ? 0 : this.getLadLine().hashCode());
		result = 37 * result
				+ (getLadPart() == null ? 0 : this.getLadPart().hashCode());
		result = 37 * result
				+ (getLadSite() == null ? 0 : this.getLadSite().hashCode());
		result = 37 * result
				+ (getLadLoc() == null ? 0 : this.getLadLoc().hashCode());
		result = 37 * result
				+ (getLadLot() == null ? 0 : this.getLadLot().hashCode());
		result = 37 * result
				+ (getLadRef() == null ? 0 : this.getLadRef().hashCode());
		return result;
	}

}