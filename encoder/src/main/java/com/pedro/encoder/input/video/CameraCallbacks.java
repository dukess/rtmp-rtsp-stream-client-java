package com.pedro.encoder.input.video;

import android.hardware.Camera;

public interface CameraCallbacks {
  void onCameraChanged(CameraHelper.Facing facing);
  void onCameraError(String error);
  void onPreviewFrame(byte[] data, Camera camera);
}
