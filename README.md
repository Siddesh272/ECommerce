# 🛒 E-Commerce Web Application

A full-stack E-Commerce application built using **Spring Boot** and **Angular** following a modern REST API architecture. The project demonstrates enterprise-level concepts such as secure authentication, payment processing, reactive frontend development, and layered backend architecture.

---

## 📸 Project Overview

This application allows customers to browse products, search items, manage a shopping cart, securely place orders, and complete payments using Stripe.

The backend exposes REST APIs using Spring Boot while the frontend consumes these APIs using Angular.

---

# 🚀 Tech Stack

## Frontend

- Angular 21
- TypeScript
- RxJS
- Angular Router
- Reactive Forms
- Bootstrap 5
- Font Awesome
- Okta Authentication
- Stripe.js

---

## Backend

- Spring Boot 3.5
- Spring Data JPA
- Spring Data REST
- Spring Security
- OAuth2 Resource Server
- Hibernate
- MySQL
- Maven

---

## Third-Party Integrations

- Stripe Payment Gateway
- Okta Authentication
- HTTPS SSL Configuration

---

# 📂 Project Structure

```
ecommerce-project
│
├── backend
│   ├── src/main/java
│   ├── src/main/resources
│   ├── pom.xml
│
├── frontend
│   ├── src
│   ├── angular.json
│   ├── package.json
│
└── README.md
```

---

# ✨ Features

## Product Catalog

- Browse products
- Browse by category
- Product details page
- Product pagination
- Dynamic routing

---

## Search

- Search by product name
- Instant product filtering
- Pagination support

---

## Shopping Cart

- Add products
- Remove products
- Quantity update
- Persistent cart
- Real-time total calculation

---

## Checkout

- Customer information
- Shipping address
- Billing address
- Country & State dropdowns
- Form validation

---

## Payment

- Stripe Payment Integration
- Payment Intent API
- Secure checkout
- Card validation

---

## Authentication

- Okta Login
- JWT Authentication
- OAuth2 Resource Server
- Protected Order APIs

---

## Orders

- Place orders
- Order history
- Customer lookup
- Secure endpoints

---

# 🏗 Backend Architecture

```
Controller
      │
      ▼
Repository (Spring Data REST)
      │
      ▼
Service Layer
      │
      ▼
Database
```

---

# Angular Architecture

```
Components
      │
      ▼
Services
      │
      ▼
HTTP Client
      │
      ▼
Spring Boot REST API
```

---

# Database

MySQL

Main Tables

- Product
- Product Category
- Country
- State
- Customer
- Address
- Orders
- Order Items

---

# REST APIs

## Products

```
GET /api/products
```

Retrieve all products.

---

## Product Categories

```
GET /api/product-category
```

Returns available categories.

---

## Search Products

```
GET /api/products/search/findByNameContaining
```

Search products by keyword.

---

## Countries

```
GET /api/countries
```

Retrieve countries.

---

## States

```
GET /api/states/search/findByCountryCode
```

Retrieve states based on country.

---

## Checkout

```
POST /api/checkout/purchase
```

Places an order.

---

## Stripe

```
POST /api/checkout/payment-intent
```

Creates a Stripe Payment Intent.

---

# Security

- Spring Security
- OAuth2
- JWT Validation
- CORS Configuration
- HTTPS Support
- Secure REST APIs

---

# Angular Concepts Used

- Standalone Components
- Reactive Forms
- Dependency Injection
- Observables
- RxJS Operators
- Route Parameters
- Lazy Loading
- Services
- HTTP Interceptors

---

# Spring Boot Concepts Used

- REST APIs
- Dependency Injection
- Spring Data JPA
- Spring Data REST
- Repository Pattern
- DTO
- Validation
- Exception Handling
- Configuration Properties
- Security Filter Chain

---

# Payment Flow

```
User
   │
   ▼
Angular Checkout
   │
   ▼
Spring Boot
   │
   ▼
Stripe Payment Intent
   │
   ▼
Payment Success
   │
   ▼
Save Order
```

---

# Authentication Flow

```
Angular
    │
    ▼
Okta Login
    │
    ▼
JWT Token
    │
    ▼
Spring Security
    │
    ▼
Protected APIs
```

---

# Skills Demonstrated

- Full Stack Development
- REST API Design
- Angular Development
- Spring Boot Development
- Authentication & Authorization
- Payment Gateway Integration
- Secure API Development
- Database Design
- Reactive Programming
- Enterprise Application Development

---

# Future Improvements

- Wishlist
- Product Reviews
- Admin Dashboard
- Inventory Management
- Email Notifications
- Docker Deployment
- Kubernetes Deployment
- CI/CD Pipeline
- Redis Cache
- Elasticsearch Search
- Unit & Integration Testing

---

# Getting Started

## Backend

```bash
cd backend

mvn clean install

mvn spring-boot:run
```

Runs on

```
https://localhost:8443
```

---

## Frontend

```bash
cd frontend

npm install

npm start
```

Runs on

```
https://localhost:4200
```

---

# Learning Outcomes

This project strengthened my understanding of:

- Enterprise Java Development
- Angular Application Development
- RESTful API Design
- Authentication with OAuth2 & JWT
- Payment Gateway Integration
- Layered Architecture
- Spring Security
- Reactive Programming
- Full Stack Application Development

---

# Credits

This project is inspired by Chad Darby's Full Stack Spring Boot & Angular course. The application has been updated and adapted using newer versions of Angular, Spring Boot, and related dependencies, with additional compatibility fixes and enhancements."# ECommerce" 
