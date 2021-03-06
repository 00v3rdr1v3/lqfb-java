package org.lqfb.entities;
// Generated 07.08.2012 15:13:19 by Hibernate Tools 3.2.2.GA


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * MemberCountView generated by hbm2java
 */
@Entity
@Table(name="member_count_view"
    ,schema="public"
)
public class MemberCountView  implements java.io.Serializable {


     private Long totalCount;

    public MemberCountView() {
    }

    public MemberCountView(Long totalCount) {
       this.totalCount = totalCount;
    }
   
     @Id 
    
    @Column(name="total_count")
    public Long getTotalCount() {
        return this.totalCount;
    }
    
    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }




}


