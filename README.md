# Simple Contact Management System, SD-03-PRODIGY

## Overview:
As part of my software development internship at Prodigy Infotech, I was tasked with developing a Simple Contact Management System. This web-based application is designed to help users efficiently manage their contacts, offering features such as adding new contacts, viewing the contact list, editing existing entries, and deleting contacts. The application leverages a robust technology stack to ensure scalability, reliability, and a user-friendly experience.

### Key Features:

**1. Add New Contact:**
Users can enter a contact's name, phone number, and email address to add it to the system. This information is stored in a MySQL database for persistent storage.

**2. View Contact List:**
The application displays all stored contacts in a clean, organized interface, allowing users to quickly browse through their contact list.

**3. Edit Existing Contacts:**
Users can update the details of any contact, ensuring that their contact information is accurate and up-to-date.

**4. Delete Contacts:**
The system allows users to remove contacts that are no longer needed, keeping the contact list uncluttered.

**5. Persistent Storage:**
All contacts are stored in a MySQL database, ensuring that data is retained between sessions. Spring Data JPA is used for seamless interaction with the database.

# Technical Stack:

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
  -  **Spring Data JPA:** For seamless database interactions.
  -  **Lombok:** Reduces boilerplate code by automatically generating getters, setters, and other common methods.
  - **Thymeleaf:** For server-side rendering of web pages.
  - **Servlet API:** For managing HTTP communication.
  - **Spring Boot DevTools:** Facilitates development by providing features like automatic restarts, live reload, and configurations for faster feedback loops.

### Implementation Details:
The application follows the MVC (Model-View-Controller) architecture, ensuring a clear separation of concerns. The backend, powered by Spring Boot, handles business logic and database interactions. JSP and Thymeleaf are employed in the frontend to create responsive and dynamic web pages. Contacts are stored in a MySQL database, with Spring Data JPA managing CRUD operations.

### Challenges & Learning Outcomes:
This project required careful integration of both backend and frontend technologies. Managing state across different layers of the application, ensuring smooth data flow, and maintaining a responsive user interface were key challenges. Through this project, I gained valuable experience in full-stack development, database management, and user interface design.
