package techknight.Vaibhav.Rest;
 
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import techknight.Vaibhav.model.JWTResponse;
import techknight.Vaibhav.model.MyResponse;

public interface Api {
 
    //the base URL for our API
    //make sure you are not using localhost
    //find the ip usinc ipconfig command 
    String BASE_URL = "http://handekart.pe.hu/eckovation/";
 
    //this is our multipart request
    //we have two parameters on is name and other one is description
    @Multipart
    @POST("Api.php")
    Call<MyResponse> uploadImage(@Header("Authorization") String authorization,@Part("image\"; filename=\"myfile.jpg\" ") RequestBody file, @Part("desc") RequestBody desc);

    @FormUrlEncoded
    @POST("jwt_token.php")
    Call<JWTResponse> fetchJWTToken(@Field("username") String username, @Field("password") String password);
}