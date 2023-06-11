package com.marcosflobo.demoplayht;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.marcosflobo.demoplayht.dto.RequestHelloAudio;
import com.marcosflobo.demoplayht.dto.ResponseTTSJob;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.client.exceptions.HttpClientException;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;
import jakarta.inject.Singleton;

@Singleton
public class PathHtService {

  private final PathHtApiClient pathHtApiClient;
  private final TelegramSenderService telegramSenderService;

  public PathHtService(PathHtApiClient pathHtApiClient, TelegramSenderService telegramSenderService) {
    this.pathHtApiClient = pathHtApiClient;
    this.telegramSenderService = telegramSenderService;
  }

  public void get() {
    String request = "{\n"
        + "  \"text\": \"10 years ago, I started to be more active in the Tech Events thing. Some of the biggest events I had the opportunity to attend were OpenStack Summit 2015, DockerCon Europe 2018 (2,200 attendees), and KubeCon Europe 2019 (7,700 attendees).\",\n"
        + "  \"voice\": \"larry\"\n"
        + "}";
    
    // String request = "{\n"
    //     + "  \"text\": \"Hello\",\n"
    //     + "  \"voice\": \"larry\"\n"
    //     + "}";

    
    String url = "";
    String response = pathHtApiClient.get(request);
    String[] a = response.split("\n");
    // Pattern pattern = Pattern.compile("https:\\/\\/(.)+\\.mp3");
    // Matcher matcher = pattern.matcher(a[a.length - 1]);
    // if (matcher.find()) {
    //     url = matcher.group();
    //   }
    for(int i = 0; i < a.length; i ++) {
      Pattern pattern = Pattern.compile("https:\\/\\/(.)+\\.mp3");
      Matcher matcher = pattern.matcher(a[i]);
      if (matcher.find()) {
        url = matcher.group();
      }
    }
    if (!url.isEmpty()) {
      RequestHelloAudio requestHelloAudio = new RequestHelloAudio(url);
      System.out.println("Sending " + url + " to Telegram");
      //String responseTelegram = telegramSenderService.sendToTelegram(requestHelloAudio);
      HttpResponse<String> responseTelegram = telegramSenderService.sendToTelegram(requestHelloAudio);
      System.out.println("Status: " + responseTelegram.getStatus().getCode() + "; Body: " + responseTelegram.body());
      System.out.println("Sent to Telegram!");
    }

  }

}
