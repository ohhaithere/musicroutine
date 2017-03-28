FROM java:8-jre
MAINTAINER Igor_Usachev <frostmasterwork@gmail.com>

ADD ./target/routine-service-1.0-SNAPSHOT.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/routine-service-1.0-SNAPSHOT.jar"]

EXPOSE 4000