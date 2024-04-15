package com.learn.libraryeventsproducer.domain;

public record LibraryEvent(
        Integer libraryEventId,
        LibraryEventType libraryEventType,

        Book book
) {
}
