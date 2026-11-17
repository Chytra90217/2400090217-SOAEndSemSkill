TOURIST MANAGEMENT - UPDATE TOURIST RECORD WITH TOKEN VALIDATION

Requirements: Java 17+ and Maven 3.6+. Internet is needed on first build to download Maven dependencies.

RUN:
1. Extract this ZIP.
2. Import the folder as an Existing Maven Project in IntelliJ, Eclipse, or Spring Tool Suite.
3. Wait for Maven dependencies to download.
4. Run TouristManagementApplication.java.
5. Open http://localhost:8080/swagger-ui/index.html

SWAGGER TEST:
PUT /api/tourists/{id}
id: 1
Header: Token = abc123
Body:
{
  "name": "Chaitra",
  "visitedDestination": "Goa",
  "contactDetails": "9876543210"
}
Expected: 200 OK - Tourist Updated Successfully

Invalid token: use any other token. Expected: 500 Internal Server Error - Invalid Token.
(The 500 status is retained because the lab paper specifies it.)

Verify with GET /api/tourists/1. A sample record with ID 1 is inserted automatically.

This project uses an in-memory H2 database, so MySQL setup is not needed. Data resets when the app restarts. The fixed token is for this lab demonstration only.
