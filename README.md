# Demo Project for Docker

A Spring Boot demo application with Docker.

## Setup
###### Running the application via Docker Container

Open the terminal and run the commands below.

Do not forget to change the host, db name, username, and password on the *application.properties* if you want to rename these parameters.

```
docker run -d -p 6033:3306 --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=adesso" mysql
```

To build app image, Run the command below where the Dockerfile of the application located.
```
docker image build -t demoapp:latest .
```

Run the last command, to link MySQL database image to the *demoapp* image and, to run the container.

```
docker container run -it --link docker-mysql:mysql --publish 8080:8080 demoapp:latest
```

## Usage

The application includes SwaggerUI. Endpoints can be accessed on http://localhost:8080/swagger-ui.html 

