package controllers

import play.mvc.Controller
import play.mvc.Result
import javax.inject.Singleton

/**
 * @author <a href="mailto:d@davemaple.com">David Maple</a>
 */
@Singleton
class KotlinController : Controller() {
    fun index(): Result {
        return ok("Hello Kotlin!");
    }
}