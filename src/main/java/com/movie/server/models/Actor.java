package com.movie.server.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Actor {
    @Id
    public ObjectId _id;

    public String name;
    public String dateofbirth;
    public String description;
    public String link;

    public Actor() {}

    public Actor(ObjectId _id, String name, String dateofbirth, String description, String link) {
        this._id = _id;
        this.name = name;
        this.dateofbirth = dateofbirth;
        this.description = description;
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String get_id() {
        return _id.toHexString();
    }

    public void set_id(ObjectId _id) {
        this._id = _id;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
