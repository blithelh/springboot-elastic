package com.xinghuo.elastic.bean;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Document(indexName = "lihang")
public class Book {

    public Book(){};

    public Book(String id,String name,String title){
        this.id = id;
        this.name = name;
        this.title = title;
    };


    @Id
    private String id;

    @Field(type = FieldType.Keyword,analyzer = "ik_max_word")
    private String name;

    @Field(type = FieldType.Keyword)
    private String title;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    @Override
    public String toString() {
        return "Book{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
