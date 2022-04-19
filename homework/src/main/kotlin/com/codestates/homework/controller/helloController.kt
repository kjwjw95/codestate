package com.codestates.homework.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import reactor.core.publisher.Mono
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.reactive.function.server.ServerResponse
import org.springframework.http.MediaType

@Controller
class helloController {
	@GetMapping("/hello")
	@ResponseBody
	fun  hello(@RequestParam("name") name:String):Mono<ServerResponse>{
		var result={
			var to: String = name
			var message: String = "hello "+name
		}
		
		return ServerResponse.ok().contentType(MediaType.APPLICATION_JSON).bodyValue(Mono.just(result));
	}
}