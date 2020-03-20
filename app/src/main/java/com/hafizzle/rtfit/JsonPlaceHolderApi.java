package com.hafizzle.rtfit;

import com.hafizzle.rtfit.Resources.Comment;
import com.hafizzle.rtfit.Resources.Post;

import java.util.List;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;
import retrofit2.http.Url;

public interface JsonPlaceHolderApi {

    /*
    @Query will automatically populate ?, &, =, etc.
     */
    @GET("posts")
    Call<List<Post>> getPosts(
            //Integer is nullable, so you are able to pass both ints and nullable.
            @Query("userId") Integer[] userId,
            @Query("_sort") String sort,
            @Query("_order") String order
            );

    @GET("posts")
    Call<List<Post>> getPosts(
            @QueryMap Map<String, String> parameters
            );

    //@Path("id") referencing path {id}, being populated by int postID.
    @GET("posts/{id}/comments")
    Call<List<Comment>> getComments(@Path("id") int postID);

    @GET
    Call<List<Comment>> getComments(@Url String url);

}
