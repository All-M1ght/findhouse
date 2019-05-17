package com.findhouse.service.search;

import com.findhouse.ApplicationTests;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.TestPropertySource;

@TestPropertySource(locations={"classpath:application.properties"})
public class SearchServiceTest extends ApplicationTests {
    @Autowired
    private ISearchService searchService;
    @Test
    public void testIndex(){
        Long targetHouseId = 15L;
        searchService.index(targetHouseId);
    }
    @Test
    public void testRemove(){
        Long targetHouseId = 15L;
        searchService.remove(targetHouseId);
    }
}
