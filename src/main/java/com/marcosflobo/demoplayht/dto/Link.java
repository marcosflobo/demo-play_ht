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
public class Link {
        private String contentType;
        private String description;
        private String href;
        private String method;
        private String rel;

    public Link() {}

    @JsonCreator
    public Link(@JsonProperty(required = true, value = "contentType") String contentType,
        @JsonProperty(required = true, value = "description") String description,
        @JsonProperty(required = true, value = "href") String href,
        @JsonProperty(required = true, value = "method") String method,
        @JsonProperty(required = true, value = "rel") String rel) {

        this.contentType = contentType;
        this.description = description;
        this.href = href;
        this.method = method;
        this.rel = rel;
    }
}
