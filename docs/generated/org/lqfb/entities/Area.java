package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Area generated by hbm2java
 */
@Entity
@Table(name="area"
    ,schema="public"
)
public class Area  implements java.io.Serializable {


     private int id;
     private Unit unit;
     private boolean active;
     private String name;
     private String description;
     private Integer directMemberCount;
     private Integer memberWeight;
     private Serializable textSearchData;
     private Set<Delegation> delegations = new HashSet<Delegation>(0);
     private Set<Issue> issues = new HashSet<Issue>(0);
     private Set<Member> members = new HashSet<Member>(0);
     private Set<AllowedPolicy> allowedPolicies = new HashSet<AllowedPolicy>(0);
     private Set<AreaSetting> areaSettings = new HashSet<AreaSetting>(0);

    public Area() {
    }

	
    public Area(int id, Unit unit, boolean active, String name, String description) {
        this.id = id;
        this.unit = unit;
        this.active = active;
        this.name = name;
        this.description = description;
    }
    public Area(int id, Unit unit, boolean active, String name, String description, Integer directMemberCount, Integer memberWeight, Serializable textSearchData, Set<Delegation> delegations, Set<Issue> issues, Set<Member> members, Set<AllowedPolicy> allowedPolicies, Set<AreaSetting> areaSettings) {
       this.id = id;
       this.unit = unit;
       this.active = active;
       this.name = name;
       this.description = description;
       this.directMemberCount = directMemberCount;
       this.memberWeight = memberWeight;
       this.textSearchData = textSearchData;
       this.delegations = delegations;
       this.issues = issues;
       this.members = members;
       this.allowedPolicies = allowedPolicies;
       this.areaSettings = areaSettings;
    }
   
     @Id 
    
    @Column(name="id", unique=true, nullable=false)
    public int getId() {
        return this.id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="unit_id", nullable=false)
    public Unit getUnit() {
        return this.unit;
    }
    
    public void setUnit(Unit unit) {
        this.unit = unit;
    }
    
    @Column(name="active", nullable=false)
    public boolean isActive() {
        return this.active;
    }
    
    public void setActive(boolean active) {
        this.active = active;
    }
    
    @Column(name="name", nullable=false)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    @Column(name="description", nullable=false)
    public String getDescription() {
        return this.description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    @Column(name="direct_member_count")
    public Integer getDirectMemberCount() {
        return this.directMemberCount;
    }
    
    public void setDirectMemberCount(Integer directMemberCount) {
        this.directMemberCount = directMemberCount;
    }
    
    @Column(name="member_weight")
    public Integer getMemberWeight() {
        return this.memberWeight;
    }
    
    public void setMemberWeight(Integer memberWeight) {
        this.memberWeight = memberWeight;
    }
    
    @Column(name="text_search_data")
    public Serializable getTextSearchData() {
        return this.textSearchData;
    }
    
    public void setTextSearchData(Serializable textSearchData) {
        this.textSearchData = textSearchData;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="area")
    public Set<Delegation> getDelegations() {
        return this.delegations;
    }
    
    public void setDelegations(Set<Delegation> delegations) {
        this.delegations = delegations;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="area")
    public Set<Issue> getIssues() {
        return this.issues;
    }
    
    public void setIssues(Set<Issue> issues) {
        this.issues = issues;
    }
@ManyToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    @JoinTable(name="membership", schema="public", joinColumns = { 
        @JoinColumn(name="area_id", nullable=false, updatable=false) }, inverseJoinColumns = { 
        @JoinColumn(name="member_id", nullable=false, updatable=false) })
    public Set<Member> getMembers() {
        return this.members;
    }
    
    public void setMembers(Set<Member> members) {
        this.members = members;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="area")
    public Set<AllowedPolicy> getAllowedPolicies() {
        return this.allowedPolicies;
    }
    
    public void setAllowedPolicies(Set<AllowedPolicy> allowedPolicies) {
        this.allowedPolicies = allowedPolicies;
    }
@OneToMany(cascade=CascadeType.ALL, fetch=FetchType.LAZY, mappedBy="area")
    public Set<AreaSetting> getAreaSettings() {
        return this.areaSettings;
    }
    
    public void setAreaSettings(Set<AreaSetting> areaSettings) {
        this.areaSettings = areaSettings;
    }




}


