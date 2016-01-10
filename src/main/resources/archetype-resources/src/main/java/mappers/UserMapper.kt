/**

 */
package net.hefun.consult.mappers

import net.hefun.consult.entities.User
import org.apache.ibatis.annotations.Select

/**
 * @author Peter
 */
interface UserMapper {

    @Select("SELECT userId, userName FROM sample_user WHERE userId=#{userId}")
    fun findUserById(userId: Int): User

    @Select("SELECT userId, userName FROM sample_user")
    fun findAllUsers(): List<User>
}
