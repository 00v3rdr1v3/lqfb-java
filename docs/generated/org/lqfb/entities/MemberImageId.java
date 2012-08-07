package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * MemberImageId generated by hbm2java
 */
@Embeddable
public class MemberImageId  implements java.io.Serializable {


     private int memberId;
     private Serializable imageType;
     private boolean scaled;

    public MemberImageId() {
    }

    public MemberImageId(int memberId, Serializable imageType, boolean scaled) {
       this.memberId = memberId;
       this.imageType = imageType;
       this.scaled = scaled;
    }
   

    @Column(name="member_id", nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Column(name="image_type", nullable=false)
    public Serializable getImageType() {
        return this.imageType;
    }
    
    public void setImageType(Serializable imageType) {
        this.imageType = imageType;
    }

    @Column(name="scaled", nullable=false)
    public boolean isScaled() {
        return this.scaled;
    }
    
    public void setScaled(boolean scaled) {
        this.scaled = scaled;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof MemberImageId) ) return false;
		 MemberImageId castOther = ( MemberImageId ) other; 
         
		 return (this.getMemberId()==castOther.getMemberId())
 && ( (this.getImageType()==castOther.getImageType()) || ( this.getImageType()!=null && castOther.getImageType()!=null && this.getImageType().equals(castOther.getImageType()) ) )
 && (this.isScaled()==castOther.isScaled());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMemberId();
         result = 37 * result + ( getImageType() == null ? 0 : this.getImageType().hashCode() );
         result = 37 * result + (this.isScaled()?1:0);
         return result;
   }   


}

