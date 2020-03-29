package com.yevvr.pomodoro.core.service

import org.springframework.boot.info.BuildProperties
import org.springframework.stereotype.Service

@Service
class InfoService(private val buildProperties: BuildProperties) {
    fun getVersion(): String = buildProperties.version

}