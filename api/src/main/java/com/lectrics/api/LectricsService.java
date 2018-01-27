package com.lectrics.api;

import java.awt.image.BufferedImage;

public interface LectricsService {
  LectureToken startLecutre();
  ImageProcessingToken processImage(BufferedImage image);
  void closeLecture();
}
