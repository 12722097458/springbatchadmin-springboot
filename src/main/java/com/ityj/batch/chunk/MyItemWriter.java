package com.ityj.batch.chunk;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@Component
public class MyItemWriter implements ItemWriter<Integer> {

    @Override
    public void write(List<? extends Integer> items) throws Exception {
        log.info("Into MyItemWriter.write()...items.size() = {}", items.size());
        items.forEach(item -> log.info("Data:{}", item));
    }

}
