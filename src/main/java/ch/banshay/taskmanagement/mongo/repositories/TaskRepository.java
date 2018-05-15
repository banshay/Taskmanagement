package ch.banshay.taskmanagement.mongo.repositories;

import ch.banshay.taskmanagement.mongo.models.Task;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "tasks", path = "tasks")
public interface TaskRepository extends MongoRepository<Task, String> {
  
  @Override
  List<Task> findAll(Sort sort);
  
}
