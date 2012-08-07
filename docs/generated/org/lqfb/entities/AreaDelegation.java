package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * AreaDelegation generated by hbm2java
 */
@Entity
@Table(name="area_delegation"
    ,schema="public"
)
public class AreaDelegation  implements java.io.Serializable {


     private AreaDelegationId id;

    public AreaDelegation() {
    }

    public AreaDelegation(AreaDelegationId id) {
       this.id = id;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="areaId", column=@Column(name="area_id") ), 
        @AttributeOverride(name="id", column=@Column(name="id") ), 
        @AttributeOverride(name="trusterId", column=@Column(name="truster_id") ), 
        @AttributeOverride(name="trusteeId", column=@Column(name="trustee_id") ), 
        @AttributeOverride(name="scope", column=@Column(name="scope") ) } )
    public AreaDelegationId getId() {
        return this.id;
    }
    
    public void setId(AreaDelegationId id) {
        this.id = id;
    }




}


