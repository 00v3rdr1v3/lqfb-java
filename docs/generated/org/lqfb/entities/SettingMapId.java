package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SettingMapId generated by hbm2java
 */
@Embeddable
public class SettingMapId  implements java.io.Serializable {


     private int memberId;
     private String key;
     private String subkey;

    public SettingMapId() {
    }

    public SettingMapId(int memberId, String key, String subkey) {
       this.memberId = memberId;
       this.key = key;
       this.subkey = subkey;
    }
   

    @Column(name="member_id", nullable=false)
    public int getMemberId() {
        return this.memberId;
    }
    
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    @Column(name="key", nullable=false)
    public String getKey() {
        return this.key;
    }
    
    public void setKey(String key) {
        this.key = key;
    }

    @Column(name="subkey", nullable=false)
    public String getSubkey() {
        return this.subkey;
    }
    
    public void setSubkey(String subkey) {
        this.subkey = subkey;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof SettingMapId) ) return false;
		 SettingMapId castOther = ( SettingMapId ) other; 
         
		 return (this.getMemberId()==castOther.getMemberId())
 && ( (this.getKey()==castOther.getKey()) || ( this.getKey()!=null && castOther.getKey()!=null && this.getKey().equals(castOther.getKey()) ) )
 && ( (this.getSubkey()==castOther.getSubkey()) || ( this.getSubkey()!=null && castOther.getSubkey()!=null && this.getSubkey().equals(castOther.getSubkey()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getMemberId();
         result = 37 * result + ( getKey() == null ? 0 : this.getKey().hashCode() );
         result = 37 * result + ( getSubkey() == null ? 0 : this.getSubkey().hashCode() );
         return result;
   }   


}


