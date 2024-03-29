package com.movie.server.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

import java.util.ArrayList;

public class Movie {

    @Id
    public ObjectId _id;
    public String name;
    public int year;
    public String genre;
    public ArrayList<String> actorIds;
    public String description;
    public String link;

    public Movie() {
    }

    public Movie(ObjectId _id, String name, int year, String genre, ArrayList<String> actorIds, String description, String link) {
        this._id = _id;
        this.name = name;
        this.year = year;
        this.genre = genre;
        this.actorIds = actorIds;
        this.description = description;
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

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<String> getActorIds() {
        return actorIds;
    }

    public void setActorIds(ArrayList<String> actorIds) {
        this.actorIds = actorIds;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
