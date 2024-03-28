package com.batch.process.springbatch.batchprocessing;

import com.rometools.rome.feed.synd.SyndEntry;
import org.springframework.batch.item.Chunk;
import org.springframework.batch.item.ItemWriter;

public class ConsoleItemWriter implements ItemWriter<SyndEntry> {
    @Override
    public void write(Chunk<? extends SyndEntry> chunk) throws Exception {
        for (SyndEntry item : chunk) {
            System.out.println("Title: " + item.getTitle());
            System.out.println("Link: " + item.getLink());
            System.out.println("Description: " + item.getDescription().getValue());
            System.out.println("Published Date: " + item.getPublishedDate());
            System.out.println("---------------------------------------------");
        }
    }
}
