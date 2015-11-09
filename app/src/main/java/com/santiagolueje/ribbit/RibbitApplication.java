package com.santiagolueje.ribbit;

import android.app.Application;

import com.parse.Parse;

import com.parse.ParseAnalytics;
import com.parse.ParseObject;


/**
 * Created by santiagolueje on 08/11/15.
 */
public class RibbitApplication extends Application {
    @Override
    public void onCreate(){
        // Enable Local Datastore.
        Parse.enableLocalDatastore(this);

        Parse.initialize(this, "HcI2m7OpUO5NopVxBh5R56MM1AaRAKDP0iRIm3BM", "GGmKc7OP4uCpYurOahRY7pWbRC3oIFkdBVsHWunj");



    }


}
