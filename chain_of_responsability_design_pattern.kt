interface AuthentificationHandler {
    fun setNextHandler(handler: AuthentificationHandler?)
    fun handleRequest(request: String)
}

class UsernamePasswordHandler : AuthentificationHandler {
    private var nextHandler: AuthentificationHandler? = null

    override fun setNextHandler(handler: AuthentificationHandler?) {
        nextHandler = handler
    }

    override fun handleRequest(request: String) {
        when {
            request == "username_password" -> println("Authenticated using username and password")
            nextHandler != null -> nextHandler?.handleRequest(request)
            else -> println("Invalid authentication method!")
        }
    }
}

class OAuthHandler : AuthentificationHandler {
    private var nextHandler: AuthentificationHandler? = null

    override fun setNextHandler(handler: AuthentificationHandler?) {
        nextHandler = handler
    }

    override fun handleRequest(request: String) {
        when {
            request == "oauth token" -> println("Authenticated using OAuth token")
            nextHandler != null -> nextHandler?.handleRequest(request)
            else -> println("Invalid authentication method!")
        }
    }
}

fun main() {
    val usernamePasswordHandler: AuthentificationHandler = UsernamePasswordHandler()
    val oauthHandler: AuthentificationHandler = OAuthHandler()

    usernamePasswordHandler.setNextHandler(oauthHandler)

    usernamePasswordHandler.handleRequest("oauth token")
    usernamePasswordHandler.handleRequest("username_password")
    usernamePasswordHandler.handleRequest("invalid_method")
}