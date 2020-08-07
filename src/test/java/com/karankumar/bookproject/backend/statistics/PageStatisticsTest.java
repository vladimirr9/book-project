package com.karankumar.bookproject.backend.statistics;

import com.karankumar.bookproject.backend.service.BookService;
import com.karankumar.bookproject.backend.service.PredefinedShelfService;
import com.karankumar.bookproject.backend.statistics.utils.StatisticTestUtils;
import com.karankumar.bookproject.tags.IntegrationTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

@IntegrationTest
public class PageStatisticsTest {
    private static BookService bookService;
    private static PredefinedShelfService predefinedShelfService;
    private static PageStatistics pageStatistics;

    @BeforeAll
    public static void setupBeforeAll(@Autowired BookService bookService,
                                      @Autowired PredefinedShelfService predefinedShelfService) {
        PageStatisticsTest.bookService = bookService;
        PageStatisticsTest.predefinedShelfService = predefinedShelfService;
    }

    @BeforeEach
    public void beforeEachSetup() {
        bookService.deleteAll();
        StatisticTestUtils.populateReadBooks(bookService, predefinedShelfService);
        PageStatisticsTest.pageStatistics = new PageStatistics(predefinedShelfService);
    }

    @Test
    public void bookWithMostPagesExistsAndIsFound() {
        // TODO
    }

    @Test
    public void testAveragePageLengthDivideByZero() {
        resetPageStatistics();
        Assertions.assertNull(pageStatistics.calculateAveragePageLength());
    }

    private void resetPageStatistics() {
        bookService.deleteAll();
        pageStatistics = new PageStatistics(predefinedShelfService);
    }

    @Test
    public void onlyReadBooksCountTowardsStatistics() {
        // TODO
    }
}
