package com.tiqiiw.playersapi.entity;

//import javax.persistance.Entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.experimental.Accessors;

@Entity
@Data
@Accessors(chain = true)
public class Player {

    @Id
    private String id;
    private String name;
    private int rating;

}
