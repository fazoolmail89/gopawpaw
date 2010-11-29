package com.gopawpaw.erp.hibernate.o;

import java.util.Date;


/**
 * AbstractOaDetId entity provides the base persistence definition of the OaDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOaDetId  implements java.io.Serializable {


    // Fields    

     private String oaDomain;
     private String oaPart;
     private String oaSite;
     private Integer oaCode;
     private String oaNbr;
     private String oaLine;
     private Date oaToDate;


    // Constructors

    /** default constructor */
    public AbstractOaDetId() {
    }

	/** minimal constructor */
    public AbstractOaDetId(String oaDomain, String oaPart) {
        this.oaDomain = oaDomain;
        this.oaPart = oaPart;
    }
    
    /** full constructor */
    public AbstractOaDetId(String oaDomain, String oaPart, String oaSite, Integer oaCode, String oaNbr, String oaLine, Date oaToDate) {
        this.oaDomain = oaDomain;
        this.oaPart = oaPart;
        this.oaSite = oaSite;
        this.oaCode = oaCode;
        this.oaNbr = oaNbr;
        this.oaLine = oaLine;
        this.oaToDate = oaToDate;
    }

   
    // Property accessors

    public String getOaDomain() {
        return this.oaDomain;
    }
    
    public void setOaDomain(String oaDomain) {
        this.oaDomain = oaDomain;
    }

    public String getOaPart() {
        return this.oaPart;
    }
    
    public void setOaPart(String oaPart) {
        this.oaPart = oaPart;
    }

    public String getOaSite() {
        return this.oaSite;
    }
    
    public void setOaSite(String oaSite) {
        this.oaSite = oaSite;
    }

    public Integer getOaCode() {
        return this.oaCode;
    }
    
    public void setOaCode(Integer oaCode) {
        this.oaCode = oaCode;
    }

    public String getOaNbr() {
        return this.oaNbr;
    }
    
    public void setOaNbr(String oaNbr) {
        this.oaNbr = oaNbr;
    }

    public String getOaLine() {
        return this.oaLine;
    }
    
    public void setOaLine(String oaLine) {
        this.oaLine = oaLine;
    }

    public Date getOaToDate() {
        return this.oaToDate;
    }
    
    public void setOaToDate(Date oaToDate) {
        this.oaToDate = oaToDate;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOaDetId) ) return false;
		 AbstractOaDetId castOther = ( AbstractOaDetId ) other; 
         
		 return ( (this.getOaDomain()==castOther.getOaDomain()) || ( this.getOaDomain()!=null && castOther.getOaDomain()!=null && this.getOaDomain().equals(castOther.getOaDomain()) ) )
 && ( (this.getOaPart()==castOther.getOaPart()) || ( this.getOaPart()!=null && castOther.getOaPart()!=null && this.getOaPart().equals(castOther.getOaPart()) ) )
 && ( (this.getOaSite()==castOther.getOaSite()) || ( this.getOaSite()!=null && castOther.getOaSite()!=null && this.getOaSite().equals(castOther.getOaSite()) ) )
 && ( (this.getOaCode()==castOther.getOaCode()) || ( this.getOaCode()!=null && castOther.getOaCode()!=null && this.getOaCode().equals(castOther.getOaCode()) ) )
 && ( (this.getOaNbr()==castOther.getOaNbr()) || ( this.getOaNbr()!=null && castOther.getOaNbr()!=null && this.getOaNbr().equals(castOther.getOaNbr()) ) )
 && ( (this.getOaLine()==castOther.getOaLine()) || ( this.getOaLine()!=null && castOther.getOaLine()!=null && this.getOaLine().equals(castOther.getOaLine()) ) )
 && ( (this.getOaToDate()==castOther.getOaToDate()) || ( this.getOaToDate()!=null && castOther.getOaToDate()!=null && this.getOaToDate().equals(castOther.getOaToDate()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOaDomain() == null ? 0 : this.getOaDomain().hashCode() );
         result = 37 * result + ( getOaPart() == null ? 0 : this.getOaPart().hashCode() );
         result = 37 * result + ( getOaSite() == null ? 0 : this.getOaSite().hashCode() );
         result = 37 * result + ( getOaCode() == null ? 0 : this.getOaCode().hashCode() );
         result = 37 * result + ( getOaNbr() == null ? 0 : this.getOaNbr().hashCode() );
         result = 37 * result + ( getOaLine() == null ? 0 : this.getOaLine().hashCode() );
         result = 37 * result + ( getOaToDate() == null ? 0 : this.getOaToDate().hashCode() );
         return result;
   }   





}