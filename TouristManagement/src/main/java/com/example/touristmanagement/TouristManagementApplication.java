package com.example.touristmanagement;
import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.repository.TouristRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TouristManagementApplication {
 public static void main(String[] args) { SpringApplication.run(TouristManagementApplication.class, args); }
 @Bean CommandLineRunner sample(TouristRepository repo) {
  return args -> { if (repo.count() == 0) {
   Tourist t = new Tourist(); t.setName("Chaitra"); t.setVisitedDestination("Hyderabad"); t.setContactDetails("9876543210"); repo.save(t);
  }};
 }
}
