package com.munichresearch.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.security.PermitAll;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.FormParam;
import javax.ws.rs.core.MediaType;
import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.munichresearch.api.Request;
import com.munichresearch.api.Sentence;
import com.munichresearch.auth.ApiUser;
import com.munichresearch.core.NLGenerator;

import io.dropwizard.auth.Auth;

import java.util.concurrent.atomic.AtomicLong;

@Path("/nlg")
@Produces(MediaType.APPLICATION_JSON)
public class NLGResource {
	
    private final AtomicLong counter;
    Logger log = LoggerFactory.getLogger(NLGResource.class);

    public NLGResource() {
        this.counter = new AtomicLong();
    }

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @PermitAll
   // @Timed
    public Sentence buildSentence(Request data) {
    	NLGenerator x = new NLGenerator();
    	
    	//Sentence sntc = new Sentence(counter.getAndIncrement(), s);
    	try {
    		
        } catch (Exception e) {
            log.error("Exception in buildSentence method.", e);
        }
        return x.process(data);
    }
}