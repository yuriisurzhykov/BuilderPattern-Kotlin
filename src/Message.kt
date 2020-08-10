class Message(private val config: Builder) {

    var title: String
        get() = config.title
        set(value) {
            config.title = value
        }
    var sender: String
        get() = config.sender
        set(value) {
            config.sender = value
        }

    var message: String
        get() = config.message
        set(value) {
            config.message = value
        }

    var finalPolite: String
        get() = config.finalPolite
        set(value) {
            config.finalPolite = value
        }

    companion object Builder {

        private var sender: String = ""
        private var title: String = ""
        private var message: String = ""
        private var finalPolite: String = ""

        fun setSender(sender: String): Builder {
            this.sender = sender
            return this
        }

        fun setTitle(title: String): Builder {
            this.title = title
            return this
        }

        fun setMessage(message: String): Builder {
            this.message = message
            return this
        }

        fun setFinalPolite(s: String): Builder {
            this.finalPolite = s
            return this
        }

        fun build(): Message = Message(this)

        override fun toString(): String {
            return "$sender, $title, $message, $finalPolite"
        }
    }

    override fun toString(): String {
        return "Message(config=$config)"
    }


}