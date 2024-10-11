
# Spring Boot - Week 3 Assignment: Data Access Layer (DAO) Integration

## Overview

This is the **Week 3** assignment for mastering Enterprise Java Development. The focus of this project is to integrate the Data Access Layer (DAO) using **Spring Data JPA** to perform CRUD operations on a `Product` entity. You will implement the DAO methods to facilitate database interactions and integrate them with the service layer.

### Assignment Objectives:

1. **Set up DAO Layer**:
   - Integrate Spring Data JPA for database interaction.
   - Configure entity mappings and data sources.
   
2. **Implement DAO Methods**:
   - Implement CRUD operations in the DAO layer for the `Product` entity.
   - Handle exceptions and manage transactions properly.
   
3. **Integrate DAO with Service Layer**:
   - Inject DAO into the service layer.
   - Ensure proper error handling and transaction management.

---

## Project Structure

The project follows a standard Spring Boot folder structure with a focus on integrating the DAO layer with the service layer.

```
springboot-dao-assignment/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/productcrud/
│   │   │       ├── ProductCrudApplication.java
│   │   │       ├── model/
│   │   │       │   └── Product.java
│   │   │       ├── controller/
│   │   │       │   └── ProductController.java
│   │   │       ├── service/
│   │   │       │   └── ProductService.java
│   │   │       ├── repository/
│   │   │       │   └── ProductRepository.java
│   │   │       └── exception/
│   │   │           └── ResourceNotFoundException.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/ (JUnit tests if needed)
├── pom.xml
└── README.md (this file)
```

### Key Files:

1. **`ProductCrudApplication.java`**: Main class to run the Spring Boot application.
2. **`Product.java`**: Entity class representing the `Product` table in the database with `id`, `name`, and `price` attributes.
3. **`ProductController.java`**: REST controller to handle requests for `/products` endpoints, such as creating, reading, updating, and deleting products.
4. **`ProductService.java`**: Service class that contains business logic and interacts with the DAO layer.
5. **`ProductRepository.java`**: DAO layer using Spring Data JPA to interact with the database.
6. **`ResourceNotFoundException.java`**: Custom exception to handle cases where a product is not found.

---

## How to Run the Application

### Prerequisites:
- JDK 8 or later installed
- Maven installed
- A preferred IDE (IntelliJ IDEA, Eclipse, etc.)
- A relational database (e.g., MySQL, PostgreSQL)

### Steps to Run:

1. **Clone or Download the Project**:
   - Clone the repository or download the ZIP file.
   - Extract the project files if downloaded as a ZIP.

2. **Database Setup**:
   - Set up a database (e.g., MySQL, PostgreSQL).
   - Update the `application.properties` file with your database connection details:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/your_database
     spring.datasource.username=root
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Open the Project in Your IDE**:
   - Import the project as a Maven project.

4. **Build the Project**:
   - Run the following Maven command to build the project:
     ```bash
     mvn clean install
     ```

5. **Run the Spring Boot Application**:
   - You can run the application directly from your IDE or use the following command:
     ```bash
     mvn spring-boot:run
     ```

6. **Access the Endpoints**:
   - `http://localhost:8080/products` - Retrieve the list of products.
   - `http://localhost:8080/products/{id}` - Retrieve, update, or delete a specific product by its ID.

---

## CRUD Operations and DAO Integration

1. **Create Product** (`POST /products`):
   - To create a new product, send a POST request with the following JSON body:
     ```json
     {
       "name": "New Product",
       "price": 50.99
     }
     ```

2. **Read Product(s)** (`GET /products` or `GET /products/{id}`):
   - Get all products or a specific product by its ID.

3. **Update Product** (`PUT /products/{id}`):
   - Update an existing product by sending the following JSON body:
     ```json
     {
       "id": 1,
       "name": "Updated Product",
       "price": 99.99
     }
     ```

4. **Delete Product** (`DELETE /products/{id}`):
   - Delete a product by its ID.

---

## Handling Exceptions

If a product is not found for a given ID, the system will throw a `ResourceNotFoundException` and return the following JSON response:

```json
{
  "message": "Product not found with id: {id}",
  "timestamp": "2024-10-09T12:00:00"
}
```

---

## Sample Endpoints

- **`GET /products`**: Retrieve a list of all products.
- **`GET /products/{id}`**: Retrieve a specific product by its ID.
- **`POST /products`**: Create a new product.
- **`PUT /products/{id}`**: Update an existing product.
- **`DELETE /products/{id}`**: Delete a product by its ID.

---

## Conclusion

This assignment introduced the integration of the DAO layer using Spring Data JPA. You have learned how to implement CRUD operations, handle exceptions, and manage transactions between the DAO and service layers.
