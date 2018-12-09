package com.kwons.qtwatcher.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.kwons.qtwatcher.event.EventHandler;

public class QtWatcherTest {

	@Test
	public void testError() {
		assertNotNull(EventHandler.getInstance());
	}

}
