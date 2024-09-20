# Simple Contact Management System 📞,

![home](https://github.com/user-attachments/assets/573e0d1a-30c5-4196-876f-c199036f9e29)


## Overview 🌟
As part of my software development internship at Prodigy Infotech, I developed a Simple Contact Management System. This web-based application enables users to efficiently manage their contacts, offering features such as adding new contacts, viewing the contact list, editing existing entries, and deleting contacts. The application leverages a robust technology stack to ensure scalability, reliability, and a user-friendly experience.

### Key Features 🔑:

**1. Add New Contact ➕:**
Users can enter a contact's name, phone number, and email address to add it to the system. This information is stored in a MySQL database for persistent storage.

**2. View Contact List 📋:**
The application displays all stored contacts in a clean, organized interface, allowing users to quickly browse through their contact list.

**3. Edit Existing Contacts ✏️:**
Users can update the details of any contact, ensuring that their contact information is accurate and up-to-date.

**4. Delete Contacts ❌:**
The system allows users to remove contacts that are no longer needed, keeping the contact list uncluttered.

**5. Search Contacts 🔍:**
The System includes powerful search functionalities, allowing users to quickly find contacts based on various criteria. This enhances the user experience by making contact retrieval efficient and straightforward.

**6. Persistent Storage 🗃️:**
All contacts are stored in a MySQL database, ensuring that data is retained between sessions. Spring Data JPA is used for seamless interaction with the database.

## Technical Stack ⚙️:

- **Backend:**
  - **Java:** Core programming language used for business logic and application flow.
  - **Spring Boot:** Framework for building the application, featuring dependency injection, REST API creation, and database integration.
  - **Servlets:** Utilized for handling HTTP requests and responses.
- **Frontend:**
  - **JSP (JavaServer Pages):** Used for building dynamic web pages that interact with the user.
  - **Thymeleaf:** Templating engine integrated with Spring Boot for rendering HTML content.
- **Database:**
  - **MySQL:** Relational database management system used for storing contact information, providing persistent storage, and ensuring data integrity.

- **Tools & Libraries:**
  - **Spring Data JPA:** For seamless database interactions.
  - **Lombok:** Reduces boilerplate code by automatically generating getters, setters, and other common methods.
  - **Thymeleaf:** For server-side rendering of web pages.
  - **Servlet API:** For managing HTTP communication.
  - **Spring Boot DevTools:** Facilitates development by providing features like automatic restarts, live reload, and configurations for faster feedback loops.

### Implementation Details 🛠️:
The application follows the **MVC (Model-View-Controller)** architecture, ensuring a clear separation of concerns. The backend, powered by Spring Boot, handles business logic and database interactions. JSP and Thymeleaf are employed in the frontend to create responsive and dynamic web pages. Contacts are stored in a MySQL database, with Spring Data JPA managing CRUD operations.

### Challenges & Learning Outcomes  📈:
This project required careful integration of both backend and frontend technologies. Managing state across different layers of the application, ensuring smooth data flow, and maintaining a responsive user interface were key challenges. Through this project, I gained valuable experience in full-stack development, database management, and user interface design.

## Project Setup Steps
### 1. Clone the repository
  ```
  git clone <repository-url>
  cd <project-directory>
  ```
### 2. Database Configuration 📊
- **Configure MySQL Database**: Ensure you have MySQL installed and create a database named   contactdb_SD_PRODIGY

### 3. Update `application.properties`:

```properties
spring.application.name=PRODIGY-SD-01-Internship

spring.datasource.url=jdbc:mysql://localhost:3306/contactdb_SD_PRODIGY
spring.datasource.username=<username>
spring.datasource.password=<password>
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

# Thymeleaf
spring.thymeleaf.prefix=classpath:/templates/
spring.thymeleaf.suffix=.html

spring.mvc.static-path-pattern=/resources/**
```
### 4. Run the application
```
./mvnw spring-boot:run
```

### API Endpoints 📡

| Endpoint                          | Method | Description                             |
|-----------------------------------|--------|-----------------------------------------|
| `http://localhost:8080/api`       |  GET   | Display the Home page                   |
| `/api/contacts`                   | GET    | Retrieve all contacts                   |
| `/api/contacts/{id}`              | GET    | Retrieve a specific contact by ID       |
| `/api/contacts/addContact`        | POST   | Add a new contact                       |
| `/api/contacts/updateContact/{id}`| PUT    | Update an existing contact              |
| `/api/contacts/deleteContact/{id}`| DELETE | Delete a contact                        |
| `api/contacts/search/findByName/{name}`       | GET    | Search for contacts by name            |
| `/api/contacts/search/findByemail/{email}`     | GET    | Search for contacts by email           |
| `/api/contacts/search/findBynumber/{number}`   | GET    | Search for contacts by phone number    |
| `/api/contacts/search/findBybirthday/{date}`   | GET    | Search for contacts by birthday date   |
| `/api/contacts/search/findBynickname/{nickname}`| GET   | Search for contacts by nickname        |
| `/api/contacts/search/findByrelationship/{relationship}`| GET | Search for contacts by relationship    |
| `/api/contacts/search/findByaddress/{address}` | GET    | Search for contacts by address         |

## Request and Response Examples 📜
- **Add Contact Request:**

   ```
    `POST /api/contacts/addContact`
    {
        "name": "John Doe",
        "number": "1234567890",
        "email": "john.doe@example.com",
        "address": "123 Main St",
        "photoUrl": "http://example.com/photo.jpg",
        "birthday": "2000-01-01",
        "nickname": "Johnny",
        "relationship": "Friend"
  }
    ```
- **Add Contact Response:**

    ```
    200 OK
      {
        "id": 1,
        "name": "John Doe",
        "number": "1234567890",
        "email": "john.doe@example.com",
        "address": "123 Main St",
        "photoUrl": "http://example.com/photo.jpg",
        "birthday": "2000-01-01",
        "nickname": "Johnny",
        "relationship": "Friend"
     }
    
    ```
- **Update Contact Request:**
    ```
    PUT /api/contacts/updateContact/1
    {
      "name": "Johnathan Doe",
      "number": "0987654321",
      "email": "johnathan.doe@example.com",
      "address": "456 Main St",
      "photoUrl": "http://example.com/newphoto.jpg",
      "birthday": "2000-01-01",
      "nickname": "Johnny",
      "relationship": "Best Friend"
    }
    ```
- **Update Contact Response:**
    ```
    {
      "id": 1,
      "name": "Johnathan Doe",
      "number": "0987654321",
      "email": "johnathan.doe@example.com",
      "address": "456 Main St",
      "photoUrl": "http://example.com/newphoto.jpg",
      "birthday": "2000-01-01",
      "nickname": "Johnny",
      "relationship": "Best Friend"
    }
    ```

  ### Search Requests
  - **Search by Name Request:**
    ```
      GET /api/contacts/search/findByname/John
    ```
  - **Responce**
    ```
    [
      {
          "id": 1,
          "name": "John Doe",
          "number": "1234567890",
          "email": "john.doe@example.com",
          "address": "123 Main St",
          "photoUrl": "http://example.com/photo.jpg",
          "birthday": "2000-01-01",
          "nickname": "Johnny",
          "relationship": "Friend"
      }
    ]
    ```
### Similarrly all search request and responces
| Method    | Search API URL |
|-----------|----------------|
| GET       | `/api/contacts/search/findByemail/{email}`|
| GET       | `/api/contacts/search/findBynumber/{number}`|
| GET       | `/api/contacts/search/findBybirthday/{date}`|
| GET       | `/api/contacts/search/findBynickname/{nickname}`|
| GET       | `/api/contacts/search/findByrelationship/{relationship}`|
| GET       | `/api/contacts/search/findByaddress/{address}`|

# Project Snapshots 📸

- **Home page**

    ![home](https://github.com/user-attachments/assets/29ccf9cf-b9fe-4ba2-8767-97048441edf2)

- **Add Contact Model**

    ![addcontact](https://github.com/user-attachments/assets/5311da82-5669-4548-b90f-546240ee4265)

- **View Contact Model**

    ![view](https://github.com/user-attachments/assets/d01dbaa2-cf57-4f10-b3f3-605564e53d65)

- **Update Contact Model**

    ![edit](https://github.com/user-attachments/assets/d0860d69-3302-4bde-b6f2-edab1c243313)
  
- **Search Contact:**

    ![search](https://github.com/user-attachments/assets/65b17397-d517-4e20-8517-cc681c23a590)

## Pop-ups for Actions 🎉
 
 - **Save Success:** "Contact saved successfully!" 🎉  
 
    ![sucess contact](https://github.com/user-attachments/assets/281a6e2d-7db1-4aef-8407-54aa42dd1e4a)

- **Save Error:** "Error saving contact. Please try again." ❌

    ![erroradd](https://github.com/user-attachments/assets/24457d83-9191-4cd6-90db-90b1ea914b86)

- **Update Success:** "Contact updated successfully!" 🎉

    ![editSuces](https://github.com/user-attachments/assets/983135ab-b30c-4130-a249-58506a7e6f38)

- **Update Error:** "Error updating contact. Please try again." ❌

    ![errEdit](https://github.com/user-attachments/assets/ce936b1c-d106-4446-ab25-5acded68f50c)

- **Delete Confirem & Success:** "Contact deleted successfully!" 🎉
    
    -  ![delete conf](https://github.com/user-attachments/assets/e6cb50cc-77c5-40d2-acf9-d040689426bf)
      
    -  ![deletesucess](https://github.com/user-attachments/assets/4f6ff147-5395-420d-8d59-daa3af7a12c2)

- **Search No Data Found**: "No Data Found"❌
  
    ![search err](https://github.com/user-attachments/assets/273815ae-7115-4709-99bd-af21bb16f601)

### Copyright © 2024 Deepak Singh

All rights reserved. This documentation and the associated software are protected by copyright law. You may not reproduce, distribute, or create derivative works from this documentation without permission from the copyright owner.

For inquiries, please contact:deepsinghkumar01@gmail.com




