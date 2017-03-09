package com.munichresearch.core;

import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.realiser.english.*;
import simplenlg.phrasespec.*;

import javax.inject.Singleton;

import com.munichresearch.api.Request;
import com.munichresearch.api.Sentence;

import simplenlg.features.*;

@Singleton
public class NLGenerator {
	private Lexicon lexicon;
    private NLGFactory nlgFactory;
    private Realiser realiser;
    
    public NLGenerator() {
            this.lexicon = Lexicon.getDefaultLexicon();
            this.nlgFactory = new NLGFactory(lexicon);
            this.realiser = new Realiser(lexicon);
    }
    
    public NLGFactory getFactory() {
            return this.nlgFactory;
    }
    
    public Realiser getRealiser() {
            return this.realiser;
    }
    
    public Sentence process(Request r) {
        SPhraseSpec p = this.nlgFactory.createClause();
        p.setSubject(r.getSubjects().get(0));
        for (String verb : r.getVerbs()) {
			p.setVerb(verb);
		}
        Sentence result = new Sentence((long)1, realiser.realiseSentence(p));
        return result;
    }

}
