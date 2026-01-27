package com.junittesting.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import com.junittesting.com.TaskUtils;

import static org.junit.jupiter.api.Assertions.*;

import java.util.concurrent.TimeUnit;

public class TaskUtilsTest {
	@Test
    @Timeout(value = 2, unit = TimeUnit.SECONDS)
    void testLongRunningTaskTimeout() {
        // This will fail because the task takes 3 seconds, timeout is 2 seconds
        String result = TaskUtils.longRunningTask();
        assertEquals("Task Completed", result);
    }
}
