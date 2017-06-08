FROM java:8-jre
MAINTAINER Igor Usachev <frostmasterwork@gmail.com>

COPY ./target/gateway-1.0-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/gateway-1.0-SNAPSHOT.jar"]

EXPOSE 5000