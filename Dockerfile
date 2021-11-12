FROM openjdk:8-jdk-alpine
MAINTAINER Hendri_Daffa_Attaya <1941720199@student.polinema.ac.id>
RUN mkdir -p /java
WORKDIR /java

COPY Kubus.java /java

# Compile file java
RUN javac Kubus.java

# Running java
ENTRYPOINT java Kubus