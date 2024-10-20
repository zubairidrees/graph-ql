# GraphQL with Spring Boot

A simple GraphQL API built using Spring Boot to demonstrate the capabilities of GraphQL for efficient data fetching and manipulation.

## Table of Contents

- [Features](#features)
- [Technologies Used](#technologies-used)
- [Getting Started](#getting-started)
- [API Documentation](#api-documentation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features

- Single endpoint for all data queries and mutations
- Efficient data fetching: request only what you need
- Strongly typed schema for clear data definitions
- Automatic DTO generation from schema definitions
- Resolvers for handling data fetching logic

## Technologies Used

- [Spring Boot](https://spring.io/projects/spring-boot)
- [GraphQL](https://graphql.org/)
- [H2 Database](https://www.h2database.com/)
- [Maven](https://maven.apache.org/)

## Getting Started

To run the project locally, follow these steps:

1. Clone the repository:
   ```bash
   git clone https://github.com/zubairidrees/graph-ql.git

2. Navigate to the project directory & generate sources:
  cd graph-ql 
  mvn clean generate-sources

3. Build the project with Maven:
   mvn clean install

4. Run the application:
   mvn spring-boot:run

5. Access the GraphQL endpoint at http://localhost:8080/graphql.
