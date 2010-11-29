package com.gopawpaw.erp.hibernate.o;



/**
 * AbstractOpglDetId entity provides the base persistence definition of the OpglDetId entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractOpglDetId  implements java.io.Serializable {


    // Fields    

     private String opglDomain;
     private Integer opglTrnbr;
     private String opglGlRef;
     private Integer opglSequence;


    // Constructors

    /** default constructor */
    public AbstractOpglDetId() {
    }

	/** minimal constructor */
    public AbstractOpglDetId(String opglDomain) {
        this.opglDomain = opglDomain;
    }
    
    /** full constructor */
    public AbstractOpglDetId(String opglDomain, Integer opglTrnbr, String opglGlRef, Integer opglSequence) {
        this.opglDomain = opglDomain;
        this.opglTrnbr = opglTrnbr;
        this.opglGlRef = opglGlRef;
        this.opglSequence = opglSequence;
    }

   
    // Property accessors

    public String getOpglDomain() {
        return this.opglDomain;
    }
    
    public void setOpglDomain(String opglDomain) {
        this.opglDomain = opglDomain;
    }

    public Integer getOpglTrnbr() {
        return this.opglTrnbr;
    }
    
    public void setOpglTrnbr(Integer opglTrnbr) {
        this.opglTrnbr = opglTrnbr;
    }

    public String getOpglGlRef() {
        return this.opglGlRef;
    }
    
    public void setOpglGlRef(String opglGlRef) {
        this.opglGlRef = opglGlRef;
    }

    public Integer getOpglSequence() {
        return this.opglSequence;
    }
    
    public void setOpglSequence(Integer opglSequence) {
        this.opglSequence = opglSequence;
    }
   



   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AbstractOpglDetId) ) return false;
		 AbstractOpglDetId castOther = ( AbstractOpglDetId ) other; 
         
		 return ( (this.getOpglDomain()==castOther.getOpglDomain()) || ( this.getOpglDomain()!=null && castOther.getOpglDomain()!=null && this.getOpglDomain().equals(castOther.getOpglDomain()) ) )
 && ( (this.getOpglTrnbr()==castOther.getOpglTrnbr()) || ( this.getOpglTrnbr()!=null && castOther.getOpglTrnbr()!=null && this.getOpglTrnbr().equals(castOther.getOpglTrnbr()) ) )
 && ( (this.getOpglGlRef()==castOther.getOpglGlRef()) || ( this.getOpglGlRef()!=null && castOther.getOpglGlRef()!=null && this.getOpglGlRef().equals(castOther.getOpglGlRef()) ) )
 && ( (this.getOpglSequence()==castOther.getOpglSequence()) || ( this.getOpglSequence()!=null && castOther.getOpglSequence()!=null && this.getOpglSequence().equals(castOther.getOpglSequence()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getOpglDomain() == null ? 0 : this.getOpglDomain().hashCode() );
         result = 37 * result + ( getOpglTrnbr() == null ? 0 : this.getOpglTrnbr().hashCode() );
         result = 37 * result + ( getOpglGlRef() == null ? 0 : this.getOpglGlRef().hashCode() );
         result = 37 * result + ( getOpglSequence() == null ? 0 : this.getOpglSequence().hashCode() );
         return result;
   }   





}