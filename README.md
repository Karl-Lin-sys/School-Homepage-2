# China University of Science and Technology (CUST) - New Website

This repository contains the full-stack implementation of the modernized CUST website. Built with Java 21, Spring Boot 3, and a modern Vanilla CSS frontend. It incorporates a News Management System (CMS) and a Webmail Interface, rigorously adhering to NIST Cybersecurity Framework principles.

## Features
- **Modern UI/UX**: Fast, accessible, and fully responsive Vanilla CSS frontend.
- **News System**: Robust news publishing system.
- **Email System**: Integrated webmail client to manage campus emails.
- **Security**: NIST compliant authentication, RBAC, BCrypt hashing, and session management.

## Tech Stack
- **Backend**: Java 21, Spring Boot 3, Spring Security, Spring Data JPA
- **Frontend**: HTML5, Thymeleaf, Vanilla CSS, JS
- **Database**: PostgreSQL (Production) / H2 (Development)
- **Deployment**: Docker, Docker Compose

## How to Run Locally

### Using Docker Compose (Recommended)
1. Ensure Docker and Docker Compose are installed.
2. Run the following command in the root directory:
   ```bash
   docker-compose up --build
   ```
3. Access the application at `http://localhost:8080`

### Using Maven (Development Mode)
1. Ensure Java 21 and Maven are installed.
2. Run the application using the local H2 in-memory database:
   ```bash
   mvn spring-boot:run
   ```
3. Access the application at `http://localhost:8080`

## Security Notes
The default Spring Security configuration enables CSRF, strict authentication for specific routes (like `/admin` and `/email`), and password encoding.
