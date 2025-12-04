FROM eclipse-temurin:17-jre-alpine

WORKDIR /app

COPY target/*.jar app.jar

ENV JAVA_TOOL_OPTIONS="-Xms256m -Xmx256m"

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "/app/app.jar"]