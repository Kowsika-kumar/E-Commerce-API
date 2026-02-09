1. Project Overview
   This project is a simple Java Spring Boot backend application that implements a RESTful API for managing a collection of items, similar to an e-commerce platform (like Flipkart).

   The application allows users to:

   Add new items
   Retrieve an item by its ID
   The project uses in-memory storage (ArrayList) instead of a database to keep the implementation simple and focused on understanding REST APIs, Spring Boot fundamentals, and backend architecture.
2. Objective

   Build a RESTful API using Java
   Manage a collection of items (e-commerce style)
   Implement input validation
   Use in-memory data storage
   Provide clear documentation
   Host the application and share the live link
3.Tech Stack

   Java 17
   Spring Boot
   Maven
   REST API
   Jakarta Validation
   Lombok
   In-Memory Storage (ArrayList)
4.Project Structure
Ecom
│
├── src/main/java/com/example/Ecom
│   ├── EcomApplication.java
│   │
│   ├── controller
│   │   └── ItemController.java
│   │
│   ├── model
│   │   └── Item.java
│   │
│   └── service
│       └── ItemService.java
│
├── src/main/resources
│   └── application.properties
│
├── pom.xml
└── README.md

5. Data Storage
   The application uses an in-memory ArrayList
   No database is used
   Data resets when the application restarts
6. REST API Endpoints
1️⃣ Add a New Item

Endpoint

POST /api/items/add


Description
Adds a new item to the in-memory collection.

Request Body (JSON)

{
  "id": 1,
  "name": "Laptop",
  "description": "HP Pavilion i5",
  "price": 65000
}


Success Response

Status: 201 CREATED

Body: Item object

2️⃣ Get Item by ID

Endpoint

GET /api/items/getById/{id}


Example

GET /api/items/getById/1


Success Response

Status: 200 OK

{
  "id": 1,
  "name": "Laptop",
  "description": "HP Pavilion i5",
  "price": 65000
}


If Item Not Found

Status: 404 NOT FOUND

Item not found with ID: 1

7. Input Validation

The application uses Jakarta Bean Validation:
@NotNull for required fields
@NotBlank for strings
@PositiveOrZero for price

Invalid input results in:
400 Bad Request
