# Use the official OpenJDK 24 image as base
FROM openjdk:24-jdk-slim

# Set environment variables
ENV JAVA_OPTS=""

# Create app directory
WORKDIR /app

# Copy the jar file (replace with your actual JAR name if needed)
COPY target/*.jar app.jar

# Expose port 8080
EXPOSE 8080

# Run the application
ENTRYPOINT ["sh", "-c", "java $JAVA_OPTS -jar app.jar"]
