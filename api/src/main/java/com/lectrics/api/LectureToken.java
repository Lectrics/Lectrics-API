package com.lectrics.api;

import java.time.ZonedDateTime;

public interface LectureToken {
  long getID();
  ZonedDateTime getTimeStamp();
}
