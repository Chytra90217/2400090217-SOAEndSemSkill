package com.example.touristmanagement.repository;
import com.example.touristmanagement.entity.Tourist;
import org.springframework.data.jpa.repository.JpaRepository;
public interface TouristRepository extends JpaRepository<Tourist, Long> {}
