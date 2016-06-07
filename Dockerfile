FROM java:8-jre

VOLUME /tmp
ADD ./target/ghost-io.jar /opt/app/
RUN sh -c 'touch /opt/app/ghost-io.jar'

CMD ["java", "-Xmx200m", "-jar", "/opt/app/ghost-io.jar"]

EXPOSE 80