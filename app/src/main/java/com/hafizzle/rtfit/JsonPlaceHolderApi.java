package com.hafizzle.rtfit;

import com.hafizzle.rtfit.Resources.Comment;
import com.hafizzle.rtfit.Resources.Post;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface JsonPlaceHolderApi {

    /*
    @Query will automatically populate ?, &, =, etc.
     */
    @GET("posts")
    Call<List<Post>> getPosts(
            @Query("userId") int userId,
            @Query("_sort") String sort,
            @Query("_order") String order
            );

    //@Path("id") referencing path {id}, being populated by int postID.
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postID);

}
