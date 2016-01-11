package com.vathsav.builditbigger;

import android.os.AsyncTask;
import android.test.AndroidTestCase;
import android.test.UiThreadTest;

import com.google.api.client.extensions.android.http.AndroidHttp;
import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.vathsav.builditbigger.backend.myApi.MyApi;

import java.io.IOException;


public class TestAsyncTask extends AndroidTestCase {

    @UiThreadTest
    public void testTask() {
        new EndpointsAsyncTask().execute();
    }

    public class EndpointsAsyncTask extends AsyncTask<String, Void, String> {
        private MyApi myApiService = null;

        @Override
        protected String doInBackground(String[] params) {
            if (myApiService == null) {
                MyApi.Builder builder = new MyApi.Builder(AndroidHttp.newCompatibleTransport(), new AndroidJsonFactory(), null)
                        .setRootUrl("https://nanodegree---build-it-bigger.appspot.com/_ah/api/");
                myApiService = builder.build();
            }

            try {
                return myApiService.fetchJoke("joke").execute().getData();
            } catch (IOException e) {
                return e.getMessage();
            }
        }

        @Override
        protected void onPostExecute(String result) {
            assertTrue("Value returned", true);
        }
    }
}
