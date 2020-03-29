package com.yevvr.pomodoro.core.utils

import org.hibernate.boot.model.naming.Identifier
import org.hibernate.engine.jdbc.env.spi.JdbcEnvironment
import org.springframework.boot.orm.jpa.hibernate.SpringPhysicalNamingStrategy

class UpperCaseNamingStrategy : SpringPhysicalNamingStrategy() {

    override fun getIdentifier(name: String, quoted: Boolean, jdbcEnvironment: JdbcEnvironment): Identifier {
        return Identifier(name.toUpperCase(), quoted)
    }
}