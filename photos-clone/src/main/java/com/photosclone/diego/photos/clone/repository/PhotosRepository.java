package com.photosclone.diego.photos.clone.repository;

import com.photosclone.diego.photos.clone.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo,Integer> {

}
