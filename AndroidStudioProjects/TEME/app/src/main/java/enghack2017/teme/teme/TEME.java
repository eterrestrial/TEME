package enghack2017.teme.teme;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class TEME extends AppCompatActivity {

    private ImageView meme_frame;
    private Button meme_button;
    private TextView meme_imageError;
//    private Bitmap bitmap;

    String url = "http://firstpropics.com/wp-content/uploads/2017/05/I-brought-you-something.png";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teme);

        meme_frame = (ImageView) findViewById(R.id.imageView);
        meme_imageError = (TextView) findViewById(R.id.textView);
        meme_button = (Button) findViewById(R.id.button);

        meme_button.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v){
                        displayMeme(url);
                    }
                }
        );


    }

    public void displayMeme(String url){
        Picasso.with(this).load(url).into(meme_frame);
    }



//    public Bitmap getBitmapFromURL(String url) {
//        try {
//            URL meme_url = new URL(url);
//            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
//            connection.setDoInput(true);
//            connection.connect();
//            InputStream input = connection.getInputStream();
//            Bitmap myBitmap = BitmapFactory.decodeStream(input);
//            return myBitmap;
//        }
//        catch(Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }

//    public void displayMeme(ImageView meme_frame){
//        try{
//            URL meme_url = new URL("http://firstpropics.com/wp-content/uploads/2017/05/I-brought-you-something.png");
//            Bitmap bmp = BitmapFactory.decodeStream(meme_url.openConnection().getInputStream());
//            meme_frame.setImageBitmap(bmp);
//        }
//        catch (MalformedURLException e){
//            System.out.println("Invalid Image URL");
//        }
//        catch (IOException e){
//            System.out.println("IOException");
//        }
//    }
}
