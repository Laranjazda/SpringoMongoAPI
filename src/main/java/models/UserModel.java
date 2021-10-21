package models;

import javax.persistence.Id;

public class UserModel {
    @Id
    private String id;
    private String name;
    private String document;

    public UserModel(String name, String document) {
        this.name = name;
        this.document = document;
    }
    public UserModel() {
    }

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

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }
}
