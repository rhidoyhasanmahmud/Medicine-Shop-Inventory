package com.learnwithhasan.medicineshopinventory.util;

import java.time.Instant;

public class DateTimeUtil {
	
	public long getCurrentTimeEpochMilli() {
		return Instant.now().toEpochMilli();
	}
}
