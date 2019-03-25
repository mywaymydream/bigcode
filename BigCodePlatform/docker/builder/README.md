BigCode Platform Builder
========================

Here you find all required artifacts to build and run **BigCode Platform Builder** from the source code. 

#Configuration

Configuration which drives building and starting could be found in [docker-compose.yml](../docker-compose.yml) located in **docker** (parent) folder.

#Artifacts

1. **[builder.Dockerfile](./builder.Dockerfile)** - docker image build instructions. 
2. **[tools/](./tools/)** folder - contains commands and tools that could be used inside the container. They will simply copied into the container. All "*.sh" will be allowed for execution. Currently it contains the following tools:
    1. **[gradle](../tools/gradle/)** folder - here located shell scripts to run gradle build

#Folder Structure
1. Current folder contains docker assemble information
2. **[tools/](./tools/)** folder - contains folders. Each folder corresponds to particular tool. All contant of this folder will be copied into the container as is so **put only required artifacts here**

#Docker Image

Docker image contains workspace and required software for building project from the source code.

## Environment 

All operations within docker image are executed under "**builder**" user and "**builder**" group

## Workspace

Docker image has the following structure of workspace

* **/app** folder - root folder of workspace. All artifacts and actions must be executed under this folder
* **/app/tools** folder - contains different tools and scripts which could be used during build process. This folder is populated with content from **[tools](./tools)** folder
* **/app/workspace** folder - this folder is used as mounting point to which the project code, located on host system, is mounted (as docker volume).
 