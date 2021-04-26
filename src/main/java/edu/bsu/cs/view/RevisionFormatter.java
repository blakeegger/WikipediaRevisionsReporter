package edu.bsu.cs.view;

import edu.bsu.cs.model.Revision;

import java.time.format.DateTimeFormatter;

public final class RevisionFormatter implements RevisionInterface{

    public String format(Revision revision) {
        return String.format("At %s, a change by %s",
                DateTimeFormatter.ISO_INSTANT.format(revision.timestamp),
                revision.name);
    }

}
