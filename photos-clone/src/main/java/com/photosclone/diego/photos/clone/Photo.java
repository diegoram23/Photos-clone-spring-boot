package com.photosclone.diego.photos.clone;

public class Photo {
    private String id;
    private String fileName;

    //raw data

    public Photo() {

    }

    public Photo(String fileName, String id) {
        this.fileName = fileName;
        this.id = id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
