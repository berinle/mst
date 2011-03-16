package com.jrock.hsdemo;

import org.hibernate.search.annotations.DocumentId;
import org.hibernate.search.annotations.Field;
import org.hibernate.search.annotations.Indexed;

import javax.persistence.*;

/**
 * @author berinle
 */
@Entity
@Table(name="MOVIE")
@Indexed
public class Movie {
    @Id @DocumentId
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    @Field
    String title;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
