package com.victorai60.facedetector;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.PointF;
import android.media.FaceDetector;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static com.victorai60.facedetector.R.drawable.yang;
import static org.junit.Assert.assertEquals;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.victorai60.facedetector", appContext.getPackageName());
    }

    @Test
    public void testFaceDetector() {
        Bitmap bitmap = BitmapFactory.decodeResource(InstrumentationRegistry.getTargetContext().getResources(), yang);
        FaceDetector faceDetector = new FaceDetector(bitmap.getWidth(), bitmap.getHeight(), 5);
        FaceDetector.Face[] faces = new FaceDetector.Face[5];
        faceDetector.findFaces(bitmap, faces);
        for (FaceDetector.Face face : faces) {
            if (face == null) {
                System.out.println("无法检测到人脸识别");
                return;
            }
            PointF pointF = new PointF();
            face.getMidPoint(pointF);
            System.out.println("已经检测到人脸: " + pointF);
        }
    }
}
