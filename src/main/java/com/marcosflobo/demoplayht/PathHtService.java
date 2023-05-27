package com.marcosflobo.demoplayht;

import jakarta.inject.Singleton;

@Singleton
public class PathHtService {

  private final PathHtApiClient pathHtApiClient;

  public PathHtService(PathHtApiClient pathHtApiClient) {
    this.pathHtApiClient = pathHtApiClient;
  }

  public String get() {
    String request = "{\n"
        + "  \"text\": \"10 years ago, I started to be more active in the Tech Events thing. Some of the biggest events I had the opportunity to attend were OpenStack Summit 2015, DockerCon Europe 2018 (2.200 attendees), and KubeCon Europe 2019 (7.700 attendees).\",\n"
        + "  \"voice\": \"larry\"\n"
        + "}";
    return pathHtApiClient.get(request);
  }
}
