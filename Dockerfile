FROM public.ecr.aws/docker/library/eclipse-temurin:21-jre-alpine

WORKDIR /usr/share/app

COPY lib/*.jar movie-service-0.0.1-SNAPSHOT.jar

EXPOSE 8080

CMD [ "java", "-jar", "app.jar" ]
