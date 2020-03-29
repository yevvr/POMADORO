package com.yevvr.pomodoro.core.model.entity

import com.yevvr.pomodoro.core.model.Status
import org.hibernate.annotations.CreationTimestamp
import org.hibernate.annotations.UpdateTimestamp
import java.sql.Timestamp
import javax.persistence.*

@Entity
data class Pomodoro(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Long,

        @Column(nullable = false)
        val goalId: Long,

        @CreationTimestamp
        val startTime: Timestamp,

        @UpdateTimestamp
        val updatedTime: Timestamp,

        val durationTime: Timestamp,

        val status: Status
)
