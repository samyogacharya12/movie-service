FROM public.ecr.aws/docker/library/eclipse-temurin:21-jre-alpine

WORKDIR /usr/share/app

COPY build/libs/*.jar movie-service-0.0.1-SNAPSHOT.jar

EXPOSE 8083

CMD [ "java", "-jar", "app.jar" ]
