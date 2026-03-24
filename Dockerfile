# Use Java 17 base image
FROM openjdk:17-jdk-slim

# Set working directory
WORKDIR /app

# Copy jar file into container
COPY target/tes-institute-1.0.jar app.jar

# Expose port
EXPOSE 8081

# Run the application
ENTRYPOINT ["java","-jar","app.jar"]
