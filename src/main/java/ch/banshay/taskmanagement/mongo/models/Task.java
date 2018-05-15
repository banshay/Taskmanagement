package ch.banshay.taskmanagement.mongo.models;

import org.springframework.data.annotation.Id;

public class Task {
  
  @Id
  private String id;
  
  private String text;
  private Integer priority;
  
  public String getText() {
    return text;
  }
  
  public void setText(String text) {
    this.text = text;
  }
  
  public Integer getPriority() {
    return priority;
  }
  
  public void setPriority(Integer priority) {
    this.priority = priority;
  }
}
