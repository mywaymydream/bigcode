Docker Folder
==============

This folder contains source code for major docker images used in this project

#Folder Structure

Each folder corresponds to its own docker image. The folder must contains all required artifacts required to build docker image.
More details related to each particular docker image could be found in README file inside correspondent folder.

**[docker-compose.yml](./docker-compose.yml)** file contains configuration required to build and run all docker images located here.

Currently folder contains following docker images:
1. **builder** - corresponds to **BigCode Platform Builder**. Which is primary way for building platform. See [README file of BigCode Platform Builder](./builder/README.md) for mode details
