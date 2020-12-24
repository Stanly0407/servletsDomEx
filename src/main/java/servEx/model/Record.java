package servEx.model;

import java.time.LocalDate;

public class Record {

    long id;
    String type;
    LocalDate recordDate;
    String headline;
    String content;
    int likes;
    long idUser;

    public Record(long id, String type, LocalDate recordDate, String headline, String content, int likes, long idUser) {
        this.id = id;
        this.type = type;
        this.recordDate = recordDate;
        this.headline = headline;
        this.content = content;
        this.likes = likes;
        this.idUser = idUser;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getRecordDate() {
        return recordDate;
    }

    public void setRecordDate(LocalDate recordDate) {
        this.recordDate = recordDate;
    }

    public String getHeadline() {
        return headline;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public long getIdUser() {
        return idUser;
    }

    public void setIdUser(long idUser) {
        this.idUser = idUser;
    }
}
