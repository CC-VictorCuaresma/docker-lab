# Etapa 1: Build del JAR con Gradle (sin usar root, ni Ubuntu, ni ENV)
FROM eclipse-temurin:17-jdk-alpine AS build
WORKDIR /app
COPY . .
RUN ./gradlew build -x test

# Etapa 2: Imagen final
FROM eclipse-temurin:17-jre-alpine
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
EXPOSE 8085
USER nobody
ENTRYPOINT ["java", "-jar", "app.jar"]
