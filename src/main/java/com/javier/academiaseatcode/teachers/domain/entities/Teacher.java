package com.javier.academiaseatcode.teachers.domain.entities;


import com.sun.istack.NotNull;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Entity
@Table(name="teachers")
public class Teacher  implements Serializable {


    @Id
    @Column(name="uuid", length=180, unique=true, nullable=false)
    private String uuid = UUID.randomUUID().toString();

   private String name;

   private String lastname;

   @NotNull
   @Column(name="created_at")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date createdAt = new Date();

    @Column(name="updated_at")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;


    public Teacher(){
        super();
    }

    public Teacher(String name, String lastname) {
        super();
        this.uuid = uuid.toString();
        this.name = name;
        this.lastname = lastname;
        this.createdAt = new Date();
    }

    public String getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }
}
