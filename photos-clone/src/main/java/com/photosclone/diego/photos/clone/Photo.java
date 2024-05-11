package com.photosclone.diego.photos.clone;

import jakarta.validation.constraints.NotEmpty;

public class Photo {
    private String id;
    @NotEmpty
    private String fileName;


    private byte[] data;

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

    public byte[] getData() {
        return data;
    }

    public void setData(byte[] data) {
        this.data = data;
    }
}
