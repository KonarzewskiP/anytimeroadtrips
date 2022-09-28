FROM openjdk:17
EXPOSE 8080
ADD target/anytime-roadtrips.jar anytime-roadtrips.jar
ENTRYPOINT ["java", "-jar", "--enable-preview", "anytime-roadtrips.jar" ]