package ch07;

public class DeviceController_72 {
  private static final String DEV1 = "/dev/dev1";

  private static final String DEVICE_SUSPENDED = null;

  private static final Logger logger = Logger.getLogger(DeviceController_72.class);

  private DeviceRecord record = null;

  public void sendShutDown() {
    try {
      tryToShutDown();
    } catch (DeviceShutDownError e) {
      logger.log(e);
    }
  }

  private void tryToShutDown() throws DeviceShutDownError {
    DeviceHandle handle = getHandle(DEV1);
    DeviceRecord record = retrieveDeviceRecord(handle);
    pauseDevice(handle);
    clearDeviceWorkQueue(handle);
    closeDevice(handle);
  }

  private void clearDeviceWorkQueue(DeviceHandle handle) {
  }

  private void closeDevice(DeviceHandle handle) {
  }

  private void pauseDevice(DeviceHandle handle) {
  }

  private DeviceRecord retrieveDeviceRecord(DeviceHandle handle) {
    return null;
  }

  private DeviceHandle getHandle(String dev12) {
    return null;
  }

  private DeviceHandle getHandle(DeviceID id) {
    throw new DeviceShutDownError("Invalid handle for: " + id.toString());
  }
}
