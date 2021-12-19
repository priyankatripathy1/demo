package com.priyanka.demo.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="tbl_lms_skill_master")
public class Skill {

    @Id
    @GeneratedValue
    @Column(name="skill_id")
    private int skillId;
    @Column(name="skill_name")
    private String skillName;
    @Column(name="creation_time")
    private Date creationTime;
    @Column(name="last_mod_time")
    private Date lastModTime;

    public int getSkillId() {
        return skillId;
    }

    public void setSkillId(int skillId) {
        this.skillId = skillId;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getLastModTime() {
        return lastModTime;
    }

    public void setLastModTime(Date lastModTime) {
        this.lastModTime = lastModTime;
    }

}
