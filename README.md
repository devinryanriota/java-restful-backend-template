# java-restful-backend-template

using dropwizard 2.0.10

gradle:

from project directory
1. `gradle shadowJar`
2. to run: `java -jar build/libs/dw-test-1.0-SNAPSHOT.jar server config.yml`
3. access at localhost:8080 or ports based on config.yml


maven:

from project directory
1. `mvn clean install`
2. to run `java -jar target/dw-test-1.0-SNAPSHOT.jar server config.yml`
3. access at localhost: 8080 or ports based on config.yml


IDEA:
1. create an application  
specs:  
Main class: `com.devin.TestingApplication`  
Program args: `server config.yml`  
module: `testing` or `testing.main`  

2. run the app


jooq:
`gradle generateSampleJooqSchemaSource`
`gradle cleanGenerateSampleJooqSchemaSource`
