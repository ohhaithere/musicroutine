# musicroutine
Routine generator for musicians

## WHAT IS IT
This is a tool to generate your daily music routine. The idea is to create a personal virtual coach who will give you your personal routine everyday.

## WHAT'S INSIDE
This is a backend built with microservices architecture. It uses docker to setup environment and Netflix OSS stuff for monitoring and so on,

## HOW TO START IT
And first you need to install Docker - https://www.docker.com/
Then build root project with maven: **mvn clean install spring-boot:repackage**

Then build a docker image: **docker-compose build**

And start it: **docker-compose start**
