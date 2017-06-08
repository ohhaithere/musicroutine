FROM java:8-jre
MAINTAINER Igor Usachev <frostmasterwork@gmail.com>

COPY ./target/config-1.0.0-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/config-1.0.0-SNAPSHOT.jar"]

EXPOSE 8888