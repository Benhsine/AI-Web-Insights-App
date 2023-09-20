package com.yassine.aiwebinsights;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.util.AttributeSet;

    public class RoundedImageView extends androidx.appcompat.widget.AppCompatImageView {

        private Path path;
        private float radius = 50.0f; // Adjust this value to control the roundness of corners

        public RoundedImageView(Context context) {
            super(context);
            init();
        }

        public RoundedImageView(Context context, AttributeSet attrs) {
            super(context, attrs);
            init();
        }

        public RoundedImageView(Context context, AttributeSet attrs, int defStyle) {
            super(context, attrs, defStyle);
            init();
        }

        private void init() {
            path = new Path();
        }

        @Override
        protected void onDraw(Canvas canvas) {
            float width = getWidth();
            float height = getHeight();
            path.reset();
            path.addRoundRect(0, 0, width, height, radius, radius, Path.Direction.CW);
            canvas.clipPath(path);
            super.onDraw(canvas);
        }
    }
