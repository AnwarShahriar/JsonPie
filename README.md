###Sample Json
``` josn
{
  "name": {
    "firstName": "Shahriar",
    "lastName": "Anwar"
  },
  "contacts":[
    "1234",
    "5678",
    "9876"
  ],
  "doc":[
    {
      "title": "one",
      "text": "this is doc one"
    },
    {
      "title": "two",
      "text": "this is doc two"
    },
    {
      "title": "three",
      "text": "this is doc three"
    }
  ]
}
```
You can just parse everything like that:
```java
  JSONPie pie = new JSONPie(jsonString);
  
```
