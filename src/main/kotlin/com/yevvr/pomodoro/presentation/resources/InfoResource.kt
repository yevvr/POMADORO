package com.yevvr.pomodoro.presentation.resources

import com.yevvr.pomodoro.core.service.InfoService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/api/v1/")
class InfoResource(val infoService: InfoService) {

    @GetMapping("version")
    fun getVersion() = infoService.getVersion()
}