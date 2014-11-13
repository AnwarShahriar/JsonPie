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
  String fullName = pie.getString("name->firstName") + " " + pie.getString("name->lastName");
  System.out.println(fullName);

  for (int i = 0; i < pie.getJSONArray("contacts").length(); i++) {
    String contact = pie.getString("contacts[" + i + "]");
    System.out.println(contact);
  }

  for (int i = 0; i < pie.getJSONArray("doc").length(); i++) {
    String title = pie.getString("doc[" + i + "] -> title");
    String text = pie.getString("doc[" + i + "] -> text");
    System.out.println(title + "\n" + text);
  }
```
