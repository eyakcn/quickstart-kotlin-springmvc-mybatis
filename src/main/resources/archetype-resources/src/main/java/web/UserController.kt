/**

 */
package net.hefun.consult.web

import net.hefun.consult.services.UserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.RequestMapping

/**
 * @author Peter
 */
@Controller
class UserController {

    @Autowired
    private val userService: UserService? = null

    @RequestMapping("/welcome")
    fun welcome(model: Model): String {
        val blogs = userService!!.findAllUsers()
        model.addAttribute("USERS", blogs)
        return "welcome"
    }
}
