###Sample Json
``` josn
  {
    "array": [
        1,
        2,
        3
    ],
    "boolean": true,
    "number": 123,
    "object": {
        "a": "b",
        "c": "d",
        "e": "f"
    },
    "string": "Hello World"
  }
```
You can just parse everything like that:
```java
  JSONPie pie = new JSONPie(jsonString);
  
```
