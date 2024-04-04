# Steps.

1. Run spring boot application.
    ```shell
    ./gradlew bootRun
    ```
   
2. Access to the swagger-ui. And 500 error with NPE.
    ```shell
    curl -v http://localhost:8080/v3/api-docs
    ```