package com.munichresearch;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;

public class NLGServerConfiguration extends Configuration {
	private int maxLength;

    @JsonProperty
    public int getMaxLength() {
        return maxLength;
    }
}
