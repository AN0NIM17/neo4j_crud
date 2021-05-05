#!/bin/bash

./gradlew bootJar
sudo docker-compose up -d
sudo docker-compose logs -f neo4j-crud
