FROM openjdk:14-jdk-slim
VOLUME /tmp
ADD quotation_app/target/QuotationBoot-0.0.1-SNAPSHOT.jar /opt/quotation_app.jar
EXPOSE 9090
#RUN bash -c 'touch /quotation_app.jar'
#ENTRYPOINT [ "java", "-Djava.security.egd=file:/dev/.urandom", "-jar","/quotation_app.jar" ]
ENTRYPOINT [ "java", "-jar","/opt/quotation_app.jar" ]
