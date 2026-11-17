package com.example.touristmanagement.entity;
import jakarta.persistence.*;

@Entity
public class Tourist {
 @Id @GeneratedValue(strategy = GenerationType.IDENTITY) private Long id;
 private String name;
 private String visitedDestination;
 private String contactDetails;
 public Tourist() {}
 public Long getId() { return id; }
 public String getName() { return name; }
 public void setName(String name) { this.name = name; }
 public String getVisitedDestination() { return visitedDestination; }
 public void setVisitedDestination(String v) { this.visitedDestination = v; }
 public String getContactDetails() { return contactDetails; }
 public void setContactDetails(String c) { this.contactDetails = c; }
}
