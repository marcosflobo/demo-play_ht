package com.marcosflobo.demoplayht.dto;

import java.util.List;

import io.micronaut.http.hateoas.Link;
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
public class ResponseTTSJob {
    private String id;
    private String created;
    private InputData input;
    private String output;
    private List<Link> links;

    public ResponseTTSJob(){}

    @JsonCreator
    public ResponseTTSJob(@JsonProperty(required = true, value = "id") String id,
        @JsonProperty(required = true, value = "created") String created,
        @JsonProperty(required = true, value = "input") InputData input,
        @JsonProperty(required = true, value = "output") String output,
        @JsonProperty(value = "links") List<Link> links) {

        this.id = id;
        this.created = created;
        this.input = input;
        this.output = output;
        this.links = links;
    }
}

