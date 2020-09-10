package com.france.operantic.angular.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.france.operantic.angular.model.Tutorial;

public interface TutorialRepository extends MongoRepository<Tutorial, String> {
  List<Tutorial> findByPublished(boolean published);
  List<Tutorial> findByTitleContaining(String title);
}
