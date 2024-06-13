#springboot-
This is a Spring Boot project that implements all the HTTP methods GET, POST, PUT and DELETE.

## Table of contents
- [Project description](#project-description)
- [Installation](#installation)
- [Usage](#usage)
- [API endpoints](#api-endpoints)
- [Configuration](#configuration)
- [Development](#development)
- [Testing](#testing)
- [Deployment](#deployment)
- [Contributing](#contributing)
- [License](#license)
- [Authors and Acknowledgements](#authors-and-acknowledgements)
- [Contact Information](#contact-information)

## Project description

This project is a RESTful API built with Spring Boot.
It allows clients to create, read, update, and delete student records in a database. 
The project uses Spring Data JPA for data persistence and a MySQL database.

## Installation

### Prerequisites
- Java 17 and above
- Maven 
- MySQL

### Steps
1. Clone the repository:
````bash
git clone https://github.com/Astrie-num/springboot-.git
````

2. Navigate the project directory:
````bash
cd springbootProject
````

3. Configure MySQL database in `src/main/resources/application.properties`

````properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your-database
   spring.datasource.username=root
   spring.datasource.password=your-password
   spring.jpa.hibernate.ddl-auto=update
   server.port= your-port
   server.error.include-message = always
````

4. Install dependencis and build the project
````bash
mvn clean install
````
   
5. Run tha application
````bash
mvn spring-boot:run
````
   
## Usage

Example of a request

GET all students
````bash
curl -X GET http://localhost:8095/api/v1/student
````

POST a new student
````bash
curl -X POST http://localhost:8095/api/v1/student -H "Content-Type: application/json" -d '{"name": "John Doe", "email": "john.doe@example.com", "dob": "2000-01-01"}'
````
PUT update a student by Id

````bash
    curl -X PUT http://localhost:8095/api/v1/student/56?name=John doe && email=john@example.com && dob=2000-01-01
````

DELETE student by Id
````bash
curl -X DELETE http://localhost:8095/api/v1/student/53
````


## APi endpoints
- GET/api/v1/student - Retrieves all students
- POST/api/v1/student - Creates a new student
- PUT/api/v1/student - Updates a student by Id
- DELETE/api/v1/student - Deletes a student by Id

## Configuration

Open the `src/main/resources/application.properties` file and edit it according to your environment

````properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-database
spring.datasource.username=root
spring.datasource.password=your-password
spring.jpa.hibernate.ddl-auto=update
server.port= your-port
server.error.include-message = always
````

## Development
### Setting up the development environment
1. Open Intellij IDEA
2. Import the project as a Maven Project
3. Configure the JDK and other settings as needed

### Project structure
`src/main/java` - Main application code
`src/main/resources` - Configuration files
`src/test/java` - Test code


## Testing

````bash
mvn test
````

## Deployment
1. Build the project 
````bash
mvn clean package
````

2. Deploy the generated JAR file to your server or cloud provider.

## Contributing 

1. Fork the repository
2. Create a new branch
````bash
git checkout -b feature/your-feature
````

3. Commit changes 
````bash
git commit -m 'Add some feature'
````

4. Push to the branch
````bash
git push origin feature/your-feature
````

5. Open a pull request

## License

This project is licensed under the MIT License - see the `LICENSE` file for details.


## Authors and Acknowledgements
- Uwumviyimana Asterie -  Initial work - https://github.com/Astrie-num
- AmigosCode - https://www.youtube.com/@amigoscode
- Spring Boot Tutorial | Full Course [2023] [NEW]


## Contact Information
For any questions, please contact [uwasterie07@gmail.com]


### Additional Notes

- Replace placeholder values (e.g., `your-username`, `your-repo`, `your-database`, `your-password`, `Your Name`, `your-email@example.com`) with actual values relevant to your project.
- Update the example requests and endpoints if they differ from the actual implementation.
- Ensure the `LICENSE` file is present in your repository if you mention it in the README.
