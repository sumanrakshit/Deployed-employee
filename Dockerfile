# Use a lightweight JDK runtime
FROM eclipse-temurin:17-jdk-alpine

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY target/employee-image-latest.jar employee-image-latest.jar

# Expose port (optional)
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "employee-image-latest.jar"]