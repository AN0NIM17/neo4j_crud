FROM openjdk:11-oracle
EXPOSE 8585
COPY build/libs/*.jar neo4j-crud.jar
ENTRYPOINT ["java","-jar","neo4j-crud.jar"]
