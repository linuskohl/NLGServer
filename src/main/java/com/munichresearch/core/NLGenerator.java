package com.munichresearch.core;

import simplenlg.framework.*;
import simplenlg.lexicon.*;
import simplenlg.realiser.english.*;
import simplenlg.phrasespec.*;

import javax.inject.Singleton;

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

}
