package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Privilege generated by hbm2java
 */
@Entity
@Table(name="privilege"
    ,schema="public"
)
public class Privilege  implements java.io.Serializable {


     private PrivilegeId id;
     private Member member;
     private Unit unit;
     private boolean adminManager;
     private boolean unitManager;
     private boolean areaManager;
     private boolean votingRightManager;
     private boolean votingRight;

    public Privilege() {
    }

    public Privilege(PrivilegeId id, Member member, Unit unit, boolean adminManager, boolean unitManager, boolean areaManager, boolean votingRightManager, boolean votingRight) {
       this.id = id;
       this.member = member;
       this.unit = unit;
       this.adminManager = adminManager;
       this.unitManager = unitManager;
       this.areaManager = areaManager;
       this.votingRightManager = votingRightManager;
       this.votingRight = votingRight;
    }
   
     @EmbeddedId
    
    @AttributeOverrides( {
        @AttributeOverride(name="unitId", column=@Column(name="unit_id", nullable=false) ), 
        @AttributeOverride(name="memberId", column=@Column(name="member_id", nullable=false) ) } )
    public PrivilegeId getId() {
        return this.id;
    }
    
    public void setId(PrivilegeId id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="member_id", nullable=false, insertable=false, updatable=false)
    public Member getMember() {
        return this.member;
    }
    
    public void setMember(Member member) {
        this.member = member;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unit_id", nullable=false, insertable=false, updatable=false)
    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    
    @Column(name="admin_manager", nullable=false)
    public boolean isAdminManager() {
        return this.adminManager;
    }
    
    public void setAdminManager(boolean adminManager) {
        this.adminManager = adminManager;
    }
    
    @Column(name="unit_manager", nullable=false)
    public boolean isUnitManager() {
        return this.unitManager;
    }
    
    public void setUnitManager(boolean unitManager) {
        this.unitManager = unitManager;
    }
    
    @Column(name="area_manager", nullable=false)
    public boolean isAreaManager() {
        return this.areaManager;
    }
    
    public void setAreaManager(boolean areaManager) {
        this.areaManager = areaManager;
    }
    
    @Column(name="voting_right_manager", nullable=false)
    public boolean isVotingRightManager() {
        return this.votingRightManager;
    }
    
    public void setVotingRightManager(boolean votingRightManager) {
        this.votingRightManager = votingRightManager;
    }
    
    @Column(name="voting_right", nullable=false)
    public boolean isVotingRight() {
        return this.votingRight;
    }
    
    public void setVotingRight(boolean votingRight) {
        this.votingRight = votingRight;
    }




}


