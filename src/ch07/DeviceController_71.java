package ch07;

public class DeviceController_71 {
  private static final String DEV1 = "/dev/dev1";

  private static final String DEVICE_SUSPENDED = null;

  private static final Logger logger = Logger.getLogger(DeviceController_71.class);

  private DeviceRecord record = null;

  public void sendShutDown() {
    DeviceHandle handle = getHandle(DEV1); // Check the state of the device
    if (handle != DeviceHandle.INVALID) {
      // Save the device status to the record field
      // retrieveDeviceRecord(handle);
      // If not suspended, shut down
      if (record.getStatus() != DEVICE_SUSPENDED) {
        pauseDevice(handle);
        clearDeviceWorkQueue(handle);
        pauseDevice(handle);
      } else {
        logger.log("Device suspended. Unable to shut down");
      }
    } else {
      logger.log("Invalid handle for: " + DEV1.toString());
    }
  }

  private void clearDeviceWorkQueue(DeviceHandle handle) {
  }

  private void pauseDevice(DeviceHandle handle) {
  }

  private DeviceHandle getHandle(String dev12) {
    return null;
  }
}
