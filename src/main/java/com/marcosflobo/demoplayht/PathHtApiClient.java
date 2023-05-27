package com.marcosflobo.demoplayht;


import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Header;
import io.micronaut.http.annotation.Post;
import io.micronaut.http.client.annotation.Client;

@Client("https://play.ht")
@Header(name = "X-User-Id", value = "foo")
@Header(name = "AUTHORIZATION", value = "Bearer bar")
@Header(name = "accept", value = "text/event-stream")
@Header(name = "content-type", value = "application/json")
public interface PathHtApiClient {

  @Post("/api/v2/tts")
  String get(@Body String request);

}
