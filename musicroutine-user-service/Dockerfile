FROM java:8-jre
MAINTAINER Igor_Usachev <frostmasterwork@gmail.com>

COPY ./target/user-service-1.3.3.RELEASE.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/user-service-1.3.3.RELEASE.jar"]

EXPOSE 3000