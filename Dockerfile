FROM openjdk:8
ADD target/HammingBitsChecker.jar HammingBitsChecker.jar
ENTRYPOINT [ "java","-jar","/HammingBitsChecker.jar" ]
