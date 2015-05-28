package ch07;

public class DeviceShutDownError extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public DeviceShutDownError(String message) {
    super(message);
  }
}
