/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.vathsav.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.vathsav.JokeFactory;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.vathsav.com",
                ownerName = "backend.builditbigger.vathsav.com",
                packagePath = ""
        )
)

public class MyEndpoint {
    @ApiMethod(name = "fetchJoke")
    public MyBean saySomethingFunny(@Named("joke") String joke) {
        MyBean response = new MyBean();
        response.setData(JokeFactory.getJoke());
        return response;
    }
}