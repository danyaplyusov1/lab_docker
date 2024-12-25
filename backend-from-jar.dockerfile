FROM openjdk:17-alpine

RUN addgroup -S newuser && adduser -S newuser -G newuser
WORKDIR /app

COPY "target/lb_docker-*.jar" application.jar

RUN chown newuser:newuser /app/application.jar

USER newuser

ENTRYPOINT ["java", "-jar", "application.jar"]
