Code example from https://medium.com/@pelensky/java-tdd-with-junit-without-using-an-ide-cd24d38adff

# Setup
Download [junit-platform-console-standalone-1.9.0.jar](https://repo1.maven.org/maven2/org/junit/platform/junit-platform-console-standalone/1.9.0/junit-platform-console-standalone-1.9.0.jar), which includes JUnit5.

Compile the test with the following command:
```
javac -cp .:junit-platform-console-standalone-1.9.0.jar FizzbuzzTest.java
```

Run the test with the following command:
```
java -jar junit-platform-console-standalone-1.9.0.jar --class-path . --select-class FizzbuzzTest
```
