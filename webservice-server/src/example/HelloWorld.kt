package example

class HelloWorld {
    fun sayHelloWorldFrom(from: String): String {
        val result = "Hello, world, from $from"
        System.out.println(result)
        return result
    }
}
