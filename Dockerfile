# Fetching latest version of Java
FROM openjdk:11
 
# Setting up work directory
#WORKDIR /app

# Copy the jar file into our app
ADD /target/note.jar note.jar

# Exposing port 8080
EXPOSE 8080

# Starting the application
ENTRYPOINT ["java", "-jar", "note.jar"]