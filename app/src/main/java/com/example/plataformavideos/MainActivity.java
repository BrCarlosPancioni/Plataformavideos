package com.example.plataformavideos;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerViewVideos;
    private VideoAdapter videoAdapter;
    private List<Video> videoList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewVideos = findViewById(R.id.recyclerViewVideos);
        recyclerViewVideos.setLayoutManager(new LinearLayoutManager(this));

        // Criar uma lista de vídeos
        videoList = new ArrayList<>();
        videoList.add(new Video("Alanzoka mama ao vivo 4k", R.drawable.video1_thumbnail));
        videoList.add(new Video("Alanzoka se desculpando pela mamada ao vivo 4k", R.drawable.video2_thumbnail));
        videoList.add(new Video("Testando a IA", R.drawable.video3_thumbnail));
        videoList.add(new Video("Aprenda a programar para android TV", R.drawable.video4_thumbnail));
        videoList.add(new Video("x1 das lendas", R.drawable.video5_thumbnail));
        videoList.add(new Video("Grande final de Mobile Legends", R.drawable.video6_thumbnail));

        videoAdapter = new VideoAdapter(videoList, this);
        recyclerViewVideos.setAdapter(videoAdapter);
    }
}
