package com.ruiyun.jvppeteer.protocol.page.payload;

import com.ruiyun.jvppeteer.protocol.log.LogEntry;

/**
 * Issued when new message was logged.
 */
public class EntryAddedPayload {

    /**
     * The entry.
     */
    private LogEntry entry;

    public LogEntry getEntry() {
        return entry;
    }

    public void setEntry(LogEntry entry) {
        this.entry = entry;
    }
}
