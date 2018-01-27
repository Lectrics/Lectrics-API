package com.lectrics.api;

public interface LectricsClient {
  void receiveFeedback(Feedback feedback);
  void terminateSession();
}
