FROM eclipse-temurin:17-jdk-jammy AS build

WORKDIR /app
COPY . /app/

RUN java --version
RUN ./mvnw clean package

FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

COPY --from=build /app/target/admin-service*.jar /app/
RUN find /app -iname admin-service-\* -exec ln -sf '{}' /app/admin-service.jar \;

RUN ls -l /app

ENV JAVA_OPTS "-Xms512m -Xmx512m"
#ENV APP_ARGS "-Dspring.config.location=/app/conf/application.properties "

HEALTHCHECK CMD nc -z localhost 8081
EXPOSE 8081

CMD java $JAVA_OPTS $APP_ARGS -jar /app/admin-service.jar