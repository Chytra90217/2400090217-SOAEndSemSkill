package com.example.touristmanagement.controller;
import com.example.touristmanagement.entity.Tourist;
import com.example.touristmanagement.repository.TouristRepository;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tourists")
public class TouristController {
 private static final String VALID_TOKEN = "abc123";
 private final TouristRepository repo;
 public TouristController(TouristRepository repo) { this.repo = repo; }

 @PutMapping("/{id}")
 public ResponseEntity<String> update(@PathVariable Long id,
   @RequestHeader(value="Token", required=false) String token,
   @RequestBody Tourist request) {
  if (!VALID_TOKEN.equals(token))
   return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Invalid Token");
  Tourist old = repo.findById(id).orElse(null);
  if (old == null) return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Tourist Not Found");
  old.setName(request.getName());
  old.setVisitedDestination(request.getVisitedDestination());
  old.setContactDetails(request.getContactDetails());
  repo.save(old);
  return ResponseEntity.ok("Tourist Updated Successfully");
 }

 @GetMapping("/{id}")
 public ResponseEntity<Tourist> get(@PathVariable Long id) {
  return repo.findById(id).map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
 }
}
