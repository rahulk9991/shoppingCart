package com.example.partymontreal;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.storage.FileDownloadTask;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.File;
import java.io.IOException;


public class MainActivity extends AppCompatActivity {

    GridLayout mainGrid;
    FirebaseStorage storage = FirebaseStorage.getInstance();
    StorageReference mStorageREference;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);

        mStorageREference = FirebaseStorage.getInstance().getReference().child("balloons.jpg");

        try {
            final File localFile = File.createTempFile("balloons","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.rImage)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Retreive costumes


        mStorageREference = FirebaseStorage.getInstance().getReference().child("costumes.jpg");

        try {
            final File localFile = File.createTempFile("costumes","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.costumes)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }


        // retrieve tableware

        mStorageREference = FirebaseStorage.getInstance().getReference().child("tableware.jpg");

        try {
            final File localFile = File.createTempFile("tableware","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.tableware)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }


        mStorageREference = FirebaseStorage.getInstance().getReference().child("decorations.jpg");

        try {
            final File localFile = File.createTempFile("decorations","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.decorations)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }


        mStorageREference = FirebaseStorage.getInstance().getReference().child("bakingsupplies.jpg");

        try {
            final File localFile = File.createTempFile("bakingsupplies","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.bakingsupplies)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }



        mStorageREference = FirebaseStorage.getInstance().getReference().child("candles.jpg");

        try {
            final File localFile = File.createTempFile("candles","jpg");
            mStorageREference.getFile(localFile)
                    .addOnSuccessListener(new OnSuccessListener<FileDownloadTask.TaskSnapshot>() {
                        @Override
                        public void onSuccess(FileDownloadTask.TaskSnapshot taskSnapshot) {
                            Toast.makeText(MainActivity.this,"picture retrieved",Toast.LENGTH_SHORT).show();

                            Bitmap bitmap = BitmapFactory.decodeFile(localFile.getAbsolutePath());
                            ((ImageView)findViewById(R.id.candles)).setImageBitmap(bitmap);
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Toast.makeText(MainActivity.this,"picture Error",Toast.LENGTH_SHORT).show();
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }



    }


    public void logout(View view) {
        FirebaseAuth.getInstance().signOut();
        startActivity(new Intent(getApplicationContext(), Login.class));
        finish();
    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    if (finalI == 0) {
                        Intent intent = new Intent(MainActivity.this, GridViewActivity.class);
                        startActivity(intent);

                    } else if (finalI == 1) {
                        Intent intent = new Intent(MainActivity.this, GridViewActivity2.class);
                        startActivity(intent);

                    } else if (finalI == 2) {
                        Intent intent = new Intent(MainActivity.this, GridView3.class);
                        startActivity(intent);

                    } else if (finalI == 3) {
                        Intent intent = new Intent(MainActivity.this, GridView4.class);
                        startActivity(intent);

                    } else if (finalI == 4) {
                        Intent intent = new Intent(MainActivity.this, GridView5.class);
                        startActivity(intent);

                    } else if (finalI == 5) {
                        Intent intent = new Intent(MainActivity.this, GridView6.class);
                        startActivity(intent);

                    } else {
                        Toast.makeText(MainActivity.this, "activity is not set for this item", Toast.LENGTH_SHORT).show();
                    }

                }
            });
        }
    }

}