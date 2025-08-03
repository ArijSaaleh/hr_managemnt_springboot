# Use the official OpenJDK 24 image as base
FROM eclipse-temurin:24-jdk-alpine

# Set working directory
WORKDIR /app

# Copy the JAR file
COPY target/*.jar app.jar


# Expose the app port
EXPOSE 8080

# Run the app
ENTRYPOINT ["java", "-jar", "app.jar"]