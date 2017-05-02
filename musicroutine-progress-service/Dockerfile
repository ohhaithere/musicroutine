FROM java:8-jre
MAINTAINER Igor_Usachev <frostmasterwork@gmail.com>

ADD ./target/progress-service-1.0-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/progress-service-1.0-SNAPSHOT.jar"]

EXPOSE 6000