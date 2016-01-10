/**

 */
package net.hefun.consult.entities

/**
 * @author Peter
 */
data class User(val userId: Int, val userName: String) {
    constructor(userId: java.lang.Integer, userName: java.lang.String) : this(userId.toInt(), userName.toString())
}
