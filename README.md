# spring-boot-docker
> Example dockerized Java spring boot web service using a Dockerfile for container configurations.


## Build and Run Container

1. `mvn clean install`
2. `docker build -t springbootdocker`
3. `docker images`
4. `docker run -p 8080:8080 springbootdocker`
5. Browse to localhost:8080

_Stop the service_

6. `docker ps -aq` -> (copy sha displayed)
7. `docker rm <sha of container>`


## Troubleshooting

| Error | Fix |
| --- | --- |
| error “Port 8080 already in use, Tomcat server” | On linux ``sudo kill `sudo lsof -t -i:8080``| 











