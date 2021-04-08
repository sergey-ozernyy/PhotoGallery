package ozernyy.android.photogallery.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi{

    @GET(   "services/rest/?method=flickr.interestingness.getList" +
                    "&api_key=50dc13aa0e300e43ac6f24b9f2a6f30f" +
                    "&format=json"+
                    "&nojsoncallback=1" +
                    "&extras=url_s")

    fun fetchPhotos(): Call<FlickrResponse>

}