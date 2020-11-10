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
    private UUID uuid = UUID.randomUUID();

   private String name;

   private String lastname;

   @NotNull
   @Column(name="created_at")
   @DateTimeFormat(pattern="yyyy-MM-dd")
   private Date createdAt;

    @Column(name="updated_at")
    @DateTimeFormat(pattern="yyyy-MM-dd")
    private Date updatedAt;


    public Teacher(){
        super();
    }

    public Teacher(UUID uuid, String name, String lastname, Date createdAt) {
        super();
        this.uuid = uuid;
        this.name = name;
        this.lastname = lastname;
        this.createdAt = createdAt;
    }

    public UUID getUuid() {
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
