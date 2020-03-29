package com.yevvr.pomodoro.core.model.entity

import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Table(name="USER")
data class User(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val token: String,

        val userName: String,

        val email: String,

        val password: String,

        @CreationTimestamp
        val creationTimestamp: Timestamp,

        @UpdateTimestamp
        val updateTimestamp: Timestamp
)