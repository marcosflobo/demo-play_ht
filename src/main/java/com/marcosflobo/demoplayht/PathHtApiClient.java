package com.marcosflobo.demoplayht;


import com.marcosflobo.demoplayht.dto.ResponseTTSJob;

import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.PathVariable;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;
import reactor.core.publisher.Flux;


@Client("https://play.ht")
@Header(name = "X-User-Id", value = "0X0Up69hKAgk0r8ScZklnIuOrP32")
@Header(name = "AUTHORIZATION", value = "Bearer d9ec519ab13642a9937554b7a4a2fcaa")
//@Header(name = "accept", value = "application/json")
@Header(name = "accept", value = "text/event-stream")
@Header(name = "content-type", value = "application/json")
public interface PathHtApiClient {

  @Post("/api/v2/tts")
  String get(@Body String request);

  // @Post("/api/v2/tts")
  // Flux<String> get(@Body String request);

  @Get("/api/v2/tts/{id}")
  String getJob(@PathVariable("id") String id);

}
