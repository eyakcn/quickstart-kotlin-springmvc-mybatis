/**

 */
package net.hefun.consult.services

import net.hefun.consult.entities.User
import net.hefun.consult.mappers.UserMapper
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * @author Peter
 */
@Service
@Transactional
open class UserService {

    @Autowired
    private val userMapper: UserMapper? = null

    open fun findAllUsers(): List<User> {
        return userMapper!!.findAllUsers()
    }
}
