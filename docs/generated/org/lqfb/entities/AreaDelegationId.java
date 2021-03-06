package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * AreaDelegationId generated by hbm2java
 */
@Embeddable
public class AreaDelegationId  implements java.io.Serializable {


     private Integer areaId;
     private Long id;
     private Integer trusterId;
     private Integer trusteeId;
     private Serializable scope;

    public AreaDelegationId() {
    }

    public AreaDelegationId(Integer areaId, Long id, Integer trusterId, Integer trusteeId, Serializable scope) {
       this.areaId = areaId;
       this.id = id;
       this.trusterId = trusterId;
       this.trusteeId = trusteeId;
       this.scope = scope;
    }
   

    @Column(name="area_id")
    public Integer getAreaId() {
        return this.areaId;
    }
    
    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    @Column(name="id")
    public Long getId() {
        return this.id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    @Column(name="truster_id")
    public Integer getTrusterId() {
        return this.trusterId;
    }
    
    public void setTrusterId(Integer trusterId) {
        this.trusterId = trusterId;
    }

    @Column(name="trustee_id")
    public Integer getTrusteeId() {
        return this.trusteeId;
    }
    
    public void setTrusteeId(Integer trusteeId) {
        this.trusteeId = trusteeId;
    }

    @Column(name="scope")
    public Serializable getScope() {
        return this.scope;
    }
    
    public void setScope(Serializable scope) {
        this.scope = scope;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof AreaDelegationId) ) return false;
		 AreaDelegationId castOther = ( AreaDelegationId ) other; 
         
		 return ( (this.getAreaId()==castOther.getAreaId()) || ( this.getAreaId()!=null && castOther.getAreaId()!=null && this.getAreaId().equals(castOther.getAreaId()) ) )
 && ( (this.getId()==castOther.getId()) || ( this.getId()!=null && castOther.getId()!=null && this.getId().equals(castOther.getId()) ) )
 && ( (this.getTrusterId()==castOther.getTrusterId()) || ( this.getTrusterId()!=null && castOther.getTrusterId()!=null && this.getTrusterId().equals(castOther.getTrusterId()) ) )
 && ( (this.getTrusteeId()==castOther.getTrusteeId()) || ( this.getTrusteeId()!=null && castOther.getTrusteeId()!=null && this.getTrusteeId().equals(castOther.getTrusteeId()) ) )
 && ( (this.getScope()==castOther.getScope()) || ( this.getScope()!=null && castOther.getScope()!=null && this.getScope().equals(castOther.getScope()) ) );
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getAreaId() == null ? 0 : this.getAreaId().hashCode() );
         result = 37 * result + ( getId() == null ? 0 : this.getId().hashCode() );
         result = 37 * result + ( getTrusterId() == null ? 0 : this.getTrusterId().hashCode() );
         result = 37 * result + ( getTrusteeId() == null ? 0 : this.getTrusteeId().hashCode() );
         result = 37 * result + ( getScope() == null ? 0 : this.getScope().hashCode() );
         return result;
   }   


}


