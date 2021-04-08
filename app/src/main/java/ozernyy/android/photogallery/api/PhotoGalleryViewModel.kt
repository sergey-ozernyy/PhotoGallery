package ozernyy.android.photogallery.api

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import ozernyy.android.photogallery.FlickrFetchr
import ozernyy.android.photogallery.GalleryItem

class PhotoGalleryViewModel: ViewModel() {

    val galleryItemLiveData: LiveData<List<GalleryItem>> = FlickrFetchr().fetchPhotos()

}