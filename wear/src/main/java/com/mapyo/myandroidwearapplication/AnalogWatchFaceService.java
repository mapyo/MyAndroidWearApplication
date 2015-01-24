package com.mapyo.myandroidwearapplication;

import android.os.Bundle;
import android.support.wearable.watchface.CanvasWatchFaceService;
import android.view.SurfaceHolder;

public class AnalogWatchFaceService extends CanvasWatchFaceService {

    public Engine onCreateEngin() {
        /* provide your watch face implementation */
        return new Engine();
    }

    /* implement service callback methods */
    private class Engine extends CanvasWatchFaceService.Engine {

        @Override
        public void onCreate(SurfaceHolder holder) {
            super.onCreate(holder);
            /* initialize your watch face */
        }

        @Override
        public void onPropertiesChanged(Bundle properties) {
            super.onPropertiesChanged(properties);
            /* get device features(burn-in, low-bit ambient */
        }

        @Override
        public void onTimeTick() {

        }
    }
}
