package com.ityj.batch.chunk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

import java.util.Iterator;
import java.util.List;

@Slf4j
public class MyItemReader implements ItemReader<Integer> {

    private Iterator<Integer> iterator;

    public MyItemReader(List<Integer> items) {
        this.iterator = items.iterator();
    }

    @Override
    public Integer read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
        if (iterator.hasNext()) {
            Integer data = iterator.next();
            log.info("Into MyItemReader.read()...getData:{}", data);
            return data;
        } else {
            return null;
        }

    }

}
