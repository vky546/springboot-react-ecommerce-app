#!/usr/bin/env bash

# Stop and delete the containers
sudo docker-compose down

# Deleting network
sudo docker network rm spring-cloud-microservices
