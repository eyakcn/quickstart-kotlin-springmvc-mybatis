package net.hefun.consult

import net.hefun.consult.services.UserService
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner

@RunWith(SpringJUnit4ClassRunner::class)
@ContextConfiguration(locations = arrayOf("classpath:spring/applicationContext.xml"))
class UserServiceTest {
    @Autowired
    private val userService: UserService? = null

    @Test
    fun testFindAllusers() {
        val users = userService!!.findAllUsers()
        Assert.assertNotNull(users)
        for (user in users) {
            System.err.println(user)
        }
    }
}
