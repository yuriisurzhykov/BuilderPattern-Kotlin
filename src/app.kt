fun main() {
    println(Client().message)
}

class Client {
    var message: Message = Message
        .setSender("Yuriy Surzhikov")
        .setTitle("New title")
        .setMessage("Hello, World! It's Builder pattern!")
        .setFinalPolite("Dear sincerely")
        .build()
}