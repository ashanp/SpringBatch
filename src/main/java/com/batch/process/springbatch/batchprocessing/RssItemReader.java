package com.batch.process.springbatch.batchprocessing;

import com.rometools.rome.feed.atom.Content;
import com.rometools.rome.feed.atom.Entry;
import com.rometools.rome.feed.atom.Feed;
import com.rometools.rome.feed.synd.SyndEntry;
import com.rometools.rome.feed.synd.SyndFeed;
import com.rometools.rome.io.SyndFeedInput;
import com.rometools.rome.io.XmlReader;
import org.springframework.batch.item.ItemReader;
import org.springframework.core.io.Resource;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.util.Iterator;

public class RssItemReader implements ItemReader<SyndEntry> {

    private final Iterator<SyndEntry> entryIterator;

//    public RssItemReader(Resource resource) throws Exception {
//        SyndFeedInput input = new SyndFeedInput();
//        URL url = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.atom");
//        try (InputStream is = url.openStream()) {
//            Reader reader = new InputStreamReader(is);
//            SyndFeed feed = input.build(reader);
//            this.entryIterator = feed.getEntries().iterator();
//        }
//    }

    public RssItemReader(Resource resource) throws Exception {
        SyndFeedInput input = new SyndFeedInput();
        URL url = new URL("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/4.5_week.atom");
        try (InputStream is = url.openStream()) {
            Reader reader = new InputStreamReader(is);
            SyndFeed feed = input.build(reader);
            this.entryIterator = feed.getEntries().iterator();
        }
    }


    @Override
    public SyndEntry read() throws Exception {
        return entryIterator.hasNext() ? entryIterator.next() : null;
    }
}
