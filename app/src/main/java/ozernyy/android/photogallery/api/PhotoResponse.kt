package ozernyy.android.photogallery.api

import com.google.gson.annotations.SerializedName
import ozernyy.android.photogallery.GalleryItem

class PhotoResponse {
    @SerializedName("photo")
    lateinit var galleryItems: List<GalleryItem>
}