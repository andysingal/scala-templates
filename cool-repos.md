[json4s](https://github.com/json4s/json4s)

```scala
import org.json4s._
import org.json4s.jackson.Serialization.read

implicit val formats: DefaultFormats.type = DefaultFormats

case class Person(val name: String, val address: Option[String])

println(jackson.parseJson(f"""{ "name": "foo" }""").extract[Person])
```
