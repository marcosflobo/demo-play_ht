package com.marcosflobo.demoplayht.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.EqualsAndHashCode;
import lombok.Generated;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Generated
@Getter
@Setter
@ToString
@EqualsAndHashCode
@JsonInclude(Include.NON_NULL)
public class InputData {
        private String output_format;
        private String quality;
        private Integer sample_rate;
        private Integer seed;
        private int speed;
        private String text;
        private String voice;

    public InputData() {}

    @JsonCreator
    public InputData(@JsonProperty(required = true, value = "output_format") String output_format,
        @JsonProperty(required = true, value = "quality") String quality,
        @JsonProperty(required = true, value = "sample_rate") Integer sample_rate,
        @JsonProperty(required = true, value = "seed") Integer seed,
        @JsonProperty(required = true, value = "speed") int speed,
        @JsonProperty(required = true, value = "text") String text,
        @JsonProperty(required = true, value = "voice") String voice) {

        this.output_format = output_format;
        this.quality = quality;
        this.sample_rate = sample_rate;
        this.seed = seed;
        this.speed = speed;
        this.text = text;
        this.voice = voice;
    }

}
