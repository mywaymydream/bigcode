FROM ubuntu:18.04	

#Install required software
RUN apt-get update && apt-get install -y \
    git \
    openjdk-11-jdk

#Initialize workspace
RUN mkdir /app && \
    mkdir /app/workspace && \
    mkdir /app/tools
    
ADD ./tools /app/tools



#Initialize Environment
RUN groupadd builder && \
    useradd -g builder -ms /bin/bash builder && \
    chown -R builder:builder /app && \
    chmod -R +x /app/tools 
                 
USER builder
WORKDIR /app/workspace

ENV TERM="xterm-256color" 

ENTRYPOINT ["/app/tools/gradle/runGradleBuild.sh"]



