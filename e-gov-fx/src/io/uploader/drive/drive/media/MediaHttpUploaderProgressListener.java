
package io.uploader.drive.drive.media;

import java.io.IOException;


/**
 * An interface for receiving progress notifications for uploads.
 *
 * <p>
 * Sample usage (if media content length is provided, else consider using
 * {@link MediaHttpUploader#getNumBytesUploaded} instead of {@link MediaHttpUploader#getProgress}:
 * </p>
 *
 * <pre>
  public static class MyUploadProgressListener implements MediaHttpUploaderProgressListener {

    public void progressChanged(MediaHttpUploader uploader) throws IOException {
      switch (uploader.getUploadState()) {
        case INITIATION_STARTED:
          System.out.println("Initiation Started");
          break;
        case INITIATION_COMPLETE:
          System.out.println("Initiation Completed");
          break;
        case MEDIA_IN_PROGRESS:
          System.out.println("Upload in progress");
          System.out.println("Upload percentage: " + uploader.getProgress());
          break;
        case MEDIA_COMPLETE:
          System.out.println("Upload Completed!");
          break;
      }
    }
  }
 * </pre>
 *
 * @since 1.9
 * @author rmistry@google.com (Ravi Mistry)
 */
public interface MediaHttpUploaderProgressListener {

  /**
   * Called to notify that progress has been changed.
   *
   * <p>
   * This method is called once before and after the initiation request. For media uploads it is
   * called multiple times depending on how many chunks are uploaded. Once the upload completes it
   * is called one final time.
   * </p>
   *
   * <p>
   * The upload state can be queried by calling {@link MediaHttpUploader#getUploadState} and the
   * progress by calling {@link MediaHttpUploader#getProgress}.
   * </p>
   *
   * @param uploader Media HTTP uploader
   */
  public void progressChanged(MediaHttpUploader uploader) throws IOException;
}
