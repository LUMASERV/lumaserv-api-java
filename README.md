# lumaserv-api-java
Java Client for the LUMASERV API

## Usage
### Maven
```xml
<dependency>
    <groupId>com.lumaserv</groupId>
    <artifactId>lumaserv-api-client</artifactId>
    <version>1.0.0</version>
</dependency>
```

### Example
```java
CoreClient client = new CoreClient("YOUR_API_KEY");
try {
    client.getServers().getData().forEach(server -> {
        // Do whatever
    });
} catch (LUMASERVException ex) {
    // Handle error
}
```