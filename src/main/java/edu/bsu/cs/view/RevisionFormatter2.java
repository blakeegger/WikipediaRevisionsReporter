package edu.bsu.cs.view;

import com.google.inject.AbstractModule;

public final class RevisionFormatter2 extends AbstractModule {
    @Override
    protected void configure(){bind(RevisionInterface.class).to(RevisionFormatter.class);}

}
