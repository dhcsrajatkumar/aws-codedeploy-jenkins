# AWS CodeDeploy Jenkins Sample Application

Sample application used as a reference for the CI/CD on AWS guidelines for the Java Chapter.

The application exposes the following endpoints:
1. /missions/manned
2. /missions/manned/{missionId}
3. /health
4. /longComputation

The files needed for AWS CodeDeploy are located in the resources' folder.

## Requirements

To compile and run this application you will need:

- JDK 1.8+

### Configuring JDK 1.8+

Make sure that the `JAVA_HOME` environment variable has been set, 
and that a JDK 1.8+ `java` command is on the path.

## Building the application

Launch the Maven build on the checked out sources of this application:

> ./mvnw package

### Live coding with Quarkus

The Maven Quarkus plugin provides a development mode that supports
live coding. To try this out:

> ./mvnw quarkus:dev

This command will leave Quarkus running in the foreground listening on port 8080.
Append the endpoints to the base URL [http://127.0.0.1:8080](http://127.0.0.1:8080).

### Run Quarkus in JVM mode

When you're done iterating in developer mode, you can run the application as a
conventional jar file.

First compile it:

> ./mvnw package

Then run it:

> java -jar ./target/apollo-missions-api-1.0.0-runner.jar
