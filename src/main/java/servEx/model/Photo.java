package servEx.model;

import java.time.LocalDate;

public class Photo {

    long id;
    LocalDate photoDate;
    String category;
    String title;
    String content;
    String tag;
    int likes;
    long idUser;
    long idRecords;

    public Photo(long id, LocalDate photoDate, String category,
                 String title, String content, String tag, int likes, long idUser, long idRecords) {
        this.id = id;
        this.photoDate = photoDate;
        this.category = category;
        this.title = title;
        this.content = content;
        this.tag = tag;
        this.likes = likes;
        this.idUser = idUser;
        this.idRecords = idRecords;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDate getPhotoDate() {
        return photoDate;
    }

    public void setPhotoDate(LocalDate photoDate) {
        this.photoDate = photoDate;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
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

    public long getIdRecords() {
        return idRecords;
    }

    public void setIdRecords(long idRecords) {
        this.idRecords = idRecords;
    }
}
