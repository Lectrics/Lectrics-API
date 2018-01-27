package com.lectrics.api;

import java.awt.image.BufferedImage;

public interface LectricsService {
  LectureToken startLecture();
  ImageProcessingToken processImage(BufferedImage image);
  void closeLecture();
}
