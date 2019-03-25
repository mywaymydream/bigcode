
BigCodePlatform
=================

This is a root folder of **BigCodePlatform**. All required source artifacts are located here. 

# Prerequisites

1. Docker. version 18.09.3
    * [Ubuntu installation guide](https://docs.docker.com/install/linux/docker-ce/ubuntu/)
    * [Windows installation guide](https://docs.docker.com/docker-for-windows/install/)
    * [Other guides](https://docs.docker.com/install/)
2. Docker Compose (not needed in Windows because it is part of docker distributive) 
    * [installation guide](https://docs.docker.com/compose/install/)    
3. JDK11+

# Building 

The primary way to build a platform is using special docker image (called **bigcode platform builder**)

To run **bigcode platform builder**, you need to run **docker-compose** command in **docker** folder:

```bash
    docker-compose up bigcode-platform-builder         
```
_[!] In Linux, depends on your environment, you need to use `sudo` to run **docker-compose** command_

This task builds the following artifacts

    1. compile java code
    2. build jars
    3. run unit tests

## Local building

To build platform within your local environment use docker.

```bash
    gradlew build 
```

#Folder Structure

1. **[gradle](./gradle)** - gradle scripts and [gradle wrapper configuration](./gradle/wrapper/gradle-wrapper.properties) as well as **gradle-wrapper.jar** itself
2. **[docker](./docker)** folder - contains all docker images artifacts used in this project
3. Applications which are part of platform ecosystem:
    1. **[bigcode-sourcecode-repository](./bigcode-sourcecode-repository)** folder - contains source code related to **[BigCodeSourceCodeRepository](./bigcode-sourcecode-repository/README.md)** application which is part of

## Temporary folders

During building process or platform applications could be created folders which is not part of the source code

*TBD*

