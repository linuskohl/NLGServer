package com.munichresearch.resources;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.codahale.metrics.annotation.Timed;
import com.google.common.base.Optional;
import com.munichresearch.api.Sentence;

import java.util.concurrent.atomic.AtomicLong;

@Path("/nlg")
@Produces(MediaType.APPLICATION_JSON)
public class NLGResource {
	
    private final AtomicLong counter;
    Logger log = LoggerFactory.getLogger(NLGResource.class);

    public NLGResource() {
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Sentence buildSentence(@QueryParam("request") Optional<String> request) {
    	String s = "";
    	if(request.isPresent())
    		s = request.get();
    	Sentence sntc = new Sentence(counter.getAndIncrement(), s);
    	try {
    		//TODO:
        } catch (Exception e) {
            log.error("Exception in buildSentence method.", e);
        }
        return sntc;
    }
}