package net.engineeringdigest.journalApp.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;


public class JournalEntry {
    private long id;
    private String title;
    private String content;

    public JournalEntry() {
    }

    public JournalEntry(String title, String content) {
        this.title = title;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
