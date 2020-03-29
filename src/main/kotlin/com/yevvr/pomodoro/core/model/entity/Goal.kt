package com.yevvr.pomodoro.core.model.entity

import com.yevvr.pomodoro.core.model.Status
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Goal(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val userId: Long,

        val expectedTime: Long,

        val spentTime: Long,

        val status: Status,

        val description: String,

        @CreationTimestamp
        val creationTimestamp: Timestamp,

        @UpdateTimestamp
        val updateTimestamp: Timestamp
)
