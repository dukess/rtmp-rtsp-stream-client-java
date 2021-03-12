package com.pedro.encoder.input.video;

import android.hardware.Camera;

public interface CameraCallbacks {
  void onCameraChanged(boolean isFrontCamera);
  void onCameraError(String error);
  void onPreviewFrame(byte[] data, Camera camera);
}
