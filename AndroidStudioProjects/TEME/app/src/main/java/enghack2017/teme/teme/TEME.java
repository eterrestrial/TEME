package enghack2017.teme.teme;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import android.widget.Toast;

import com.squareup.picasso.Picasso;

import java.util.LinkedList;
import java.util.List;

public class TEME extends AppCompatActivity {

    private ImageView meme_frame;
    Button meme_button;
    //private TextView meme_imageError;

    private static final String memes = "http://firstpropics.com/wp-content/uploads/2017/05/I-brought-you-something.png," +
    "https://i.reddituploads.com/cf07343028c9442ba15e5919c308bbe9?fit=max&h=1536&w=1536&s=934471eea3a01a74a50cc56e47daaee1," +
    "http://i.imgur.com/Sa6dnVR.jpg," + "https://i.redd.it/x0n6y7pzf3yy.jpg," + "http://i.imgur.com/XGfVQ9M.jpg," +
    "https://i.imgur.com/4sUV5JG.png," +
    "https://i.reddituploads.com/7b5ee8d1be804ddc86fe3d30083d3bf4?fit=max&h=1536&w=1536&s=93cbd236d6d24c6ea4e4049939f073f9," +
    "http://imgur.com/NLgVf9v.jpg," + "https://i.redd.it/wxdgcq1hv38y.jpg," + "http://i.imgur.com/a23BO75.jpg," +
    "https://i.redd.it/36jfqo2hz68y.jpg," +
    "https://i.redd.it/hk8ezx2dm1wy.png," + "https://i.imgur.com/dSqDoR9.jpg," + "http://i.imgur.com/bTAVNRv.png," +
    "https://i.reddituploads.com/ce60946004954b9aa942bb13efe3ad0a?fit=max&h=1536&w=1536&s=372a65fa2fff13eadefd6270b6c3af77," +
    "http://i.imgur.com/qOZDNAX.jpg," +
    "https://i.reddituploads.com/30410a7a21894050946c8d78f30870e0?fit=max&h=1536&w=1536&s=281524e81a9f23fc688b59ad2f920d1b," +
    "http://i.imgur.com/DoDiXTx.jpg," +
    "https://i.reddituploads.com/a33603214913490fbf277046997a6154?fit=max&h=1536&w=1536&s=4f1c1334ddd2f035f314f1a1b4621018," +
    "https://i.redd.it/i5bn4qikvbcy.jpg," + "https://i.redd.it/ajqrk4hmexty.jpg";

    private String url = "https://i.reddituploads.com/b3e803fc658047498cbe3edf3ebf94cc?fit=max&h=1536&w=1536&s=53092f21c6f55674363fd06a4f633fc5";
    private String url2 = "http://www.clipartbest.com/cliparts/9i4/pME/9i4pME69T.png";

    private String[] memeArray = memes.split(",");

    int currentMeme = 0;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teme);

        LinkedList<String> swipeRight;
        LinkedList<String> swipeLeft;

        meme_frame = (ImageView) findViewById(R.id.imageView);
        //meme_imageError = (TextView) findViewById(R.id.textView);


        displayMeme(memeArray[0]);

        meme_frame.setOnTouchListener(new OnSwipeTouchListener(TEME.this) {

            public void onSwipeRight() {

                Toast.makeText(TEME.this, "don't like", Toast.LENGTH_SHORT).show();

                if (currentMeme == 0) {
                    //swipeRight.add("0");
                }

                System.out.println(currentMeme);
                currentMeme++;
                System.out.println(currentMeme);

                switch (currentMeme) {
                    case 0:
                    case 1:
                        displayMeme(memeArray[1]);
                        //swipeRight.add("1");
                        break;
                    case 2:
                        displayMeme(memeArray[2]);
                        //swipeRight.add("2");
                        break;
                    case 3:
                        displayMeme(memeArray[3]);
                        //swipeRight.add("3");
                        break;
                    case 4:
                        displayMeme(memeArray[4]);
                        //swipeRight.add("4");
                        break;
                    case 5:
                        displayMeme(memeArray[5]);
                        //swipeRight.add("5");
                        break;
                    case 6:
                        displayMeme(memeArray[6]);
                        //swipeRight.add("6");
                        break;
                    case 7:
                        displayMeme(memeArray[7]);
                        //swipeRight.add("7");
                        break;
                    case 8:
                        displayMeme(memeArray[8]);
                        //swipeRight.add("8");
                        break;
                    case 9:
                        displayMeme(memeArray[9]);
                        //swipeRight.add("9");
                        break;
                    case 10:
                        displayMeme(memeArray[10]);
                        //swipeRight.add("10");
                        break;
                    case 11:
                        displayMeme(memeArray[11]);
                        //swipeRight.add("11");
                        break;
                    case 12:
                        displayMeme(memeArray[12]);
                        //swipeRight.add("12");
                        break;
                    case 13:
                        displayMeme(memeArray[13]);
                        //swipeRight.add("13");
                        break;
                    case 14:
                        displayMeme(memeArray[14]);
                        //swipeRight.add("14");
                        break;
                    case 15:
                        displayMeme(memeArray[15]);
                        //swipeRight.add("15");
                        break;
                    case 16:
                        displayMeme(memeArray[16]);
                        //swipeRight.add("16");
                        break;
                    case 17:
                        displayMeme(memeArray[17]);
                        //swipeRight.add("17");
                        break;
                    case 18:
                        displayMeme(memeArray[18]);
                        //swipeRight.add("18");
                        break;
                    case 19:
                        displayMeme(memeArray[19]);
                        //swipeRight.add("19");
                        break;
                    case 20:
                        displayMeme(memeArray[20]);
                        //swipeRight.add("20");
                        break;
                    case 21:
                        displayMeme(url);
                        break;

                    default:
                        displayMeme(url2);
                        break;
                }
            }

            public void onSwipeLeft() {
                Toast.makeText(TEME.this, "like", Toast.LENGTH_SHORT).show();

                if (currentMeme == 0) {
                    //swipeLeft.add("0");
                }

                currentMeme++;

                switch (currentMeme) {
                    case 0:
                    case 1:
                        displayMeme(memeArray[1]);
                        //swipeLeft.add("1");
                        break;
                    case 2:
                        displayMeme(memeArray[2]);
                        //swipeLeft.add("2");
                        break;
                    case 3:
                        displayMeme(memeArray[3]);
                        //swipeLeft.add("3");
                        break;
                    case 4:
                        displayMeme(memeArray[4]);
                        //swipeLeft.add("4");
                        break;
                    case 5:
                        displayMeme(memeArray[5]);
                        //swipeLeft.add("5");
                        break;
                    case 6:
                        displayMeme(memeArray[6]);
                        //swipeLeft.add("6");
                        break;
                    case 7:
                        displayMeme(memeArray[7]);
                        //swipeLeft.add("7");
                        break;
                    case 8:
                        displayMeme(memeArray[8]);
                        //swipeLeft.add("8");
                        break;
                    case 9:
                        displayMeme(memeArray[9]);
                        //swipeLeft.add("9");
                        break;
                    case 10:
                        displayMeme(memeArray[10]);
                        //swipeLeft.add("10");
                        break;
                    case 11:
                        displayMeme(memeArray[11]);
                        //swipeLeft.add("11");
                        break;
                    case 12:
                        displayMeme(memeArray[12]);
                        //swipeLeft.add("12");
                        break;
                    case 13:
                        displayMeme(memeArray[13]);
                        //swipeLeft.add("13");
                        break;
                    case 14:
                        displayMeme(memeArray[14]);
                        //swipeLeft.add("14");
                        break;
                    case 15:
                        displayMeme(memeArray[15]);
                        //swipeLeft.add("15");
                        break;
                    case 16:
                        displayMeme(memeArray[16]);
                        //swipeLeft.add("16");
                        break;
                    case 17:
                        displayMeme(memeArray[17]);
                        //swipeLeft.add("17");
                        break;
                    case 18:
                        displayMeme(memeArray[18]);
                        //swipeLeft.add("18");
                        break;
                    case 19:
                        displayMeme(memeArray[19]);
                        //swipeLeft.add("19");
                        break;
                    case 20:
                        displayMeme(memeArray[20]);
                        //swipeLeft.add("20");
                        break;
                    case 21:
                        displayMeme(url);
                        break;

                    default:
                        displayMeme(url2);
                        break;
                }
            }
        });

    }

    public void displayMeme(String url){
        Picasso.with(this).load(url).into(meme_frame);
    }

}

