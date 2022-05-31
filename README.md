# Apollo Missions REST API

This REST API provides some basic data about the [Apollo missions](https://wehackthemoon.com/missions). It is meant as a sample Java REST API to be used within the ISAAC Developer Blog posts.

Endpoints regarding the Apollo Missions:
1. /missions/manned
2. /missions/manned/{missionId}

Endpoints that can be used when experimenting with [AWS EC2 Auto Scaling Service](https://aws.amazon.com/ec2/autoscaling/) 
and using [Elastic Load Balancing Service](https://aws.amazon.com/elasticloadbalancing/):
1. /longComputation
2. /health

## Requirements

To compile and run this application you will need:

- JDK 1.8+
- GraalVM (if you intend to make a native executable)

### Configuring JDK 1.8+

Make sure that the `JAVA_HOME` environment variable has been set, 
and that a JDK 1.8+ `java` command is on the path.

### Configuring GraalVM
Make sure that the `GRAALVM_HOME` environment variable has been set.

See the [Building a Native Executable guide](https://quarkus.io/guides/building-native-image-guide)
for help setting up your environment.

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

### Run Quarkus as a native executable

You can also create a native executable from this application without making any
source code changes. A native executable removes the dependency on the JVM:
everything needed to run the application on the target platform is included in
the executable, allowing the application to run with minimal resource overhead.

Compiling a native executable takes a bit longer, as GraalVM performs additional
steps to remove unnecessary codepaths. Use the  `native` profile to compile a
native executable:

> ./mvnw package -Dnative

After the compilation is done, you'll be able to run this executable directly:

> ./target/apollo-missions-api-1.0.0-runner

### Run Quarkus in JVM mode in a docker container
First compile it:

> ./mvnw package

Then, build the image with:

> docker build -f src/main/docker/Dockerfile.jvm -t isaacdeveloperblog/apollo-missions-api:1.0.0 .

Then run the container using:
> docker run -i --rm -p 8080:8080 isaacdeveloperblog/apollo-missions-api:1.0.0

### Run Quarkus as a native executable in a docker container
First compile it:

> ./mvnw package -Pnative -Dquarkus.native.container-build=true

Then, build the image with:

> docker build -f src/main/docker/Dockerfile.native -t isaacdeveloperblog/apollo-missions-api-native:1.0.0 .

Then run the container using:
> docker run -i --rm -p 8080:8080 isaacdeveloperblog/apollo-missions-api-native:1.0.0