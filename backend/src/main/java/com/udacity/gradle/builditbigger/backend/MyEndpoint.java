package com.udacity.gradle.builditbigger.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.hussain.jokesproviderlib.JokesProvider;

@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.builditbigger.gradle.udacity.com",
                ownerName = "backend.builditbigger.gradle.udacity.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    @ApiMethod(name = "getJokeApiMethod")
    public MyJoke getJokeApiMethod() {
        JokesProvider jokesProvider = new JokesProvider();
        MyJoke joke = new MyJoke();
        joke.setJoke(jokesProvider.getRandomJoke());
        return joke;
    }

}
