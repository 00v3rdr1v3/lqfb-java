package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * ContactId generated by hbm2java
 */
@Embeddable
public class ContactId  implements java.io.Serializable {


     private int memberId;
     private int otherMemberId;

    public ContactId() {
    }

    public ContactId(int memberId, int otherMemberId) {
       this.memberId = memberId;
       this.otherMemberId = otherMemberId;
    }
   

    @Column(name="member_id", nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Column(name="other_member_id", nullable=false)
    public int getOtherMemberId() {
        return this.otherMemberId;
    }
    
    public void setOtherMemberId(int otherMemberId) {
        this.otherMemberId = otherMemberId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof ContactId) ) return false;
		 ContactId castOther = ( ContactId ) other; 
         
		 return (this.getMemberId()==castOther.getMemberId())
 && (this.getOtherMemberId()==castOther.getOtherMemberId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMemberId();
         result = 37 * result + this.getOtherMemberId();
         return result;
   }   


}


