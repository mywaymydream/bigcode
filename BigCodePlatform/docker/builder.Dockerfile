FROM ubuntu:18.04	

#Install required software
RUN apt-get update && apt-get install -y \
    git \
    openjdk-11-jdk

#Add user 
RUN useradd -ms /bin/bash builder

#Init workspace
RUN mkdir ~/workspace

#Add user
USER builder
WORKDIR /home/builder/workspace

ENV TERM xterm-256color

ENTRYPOINT ["bash"]


