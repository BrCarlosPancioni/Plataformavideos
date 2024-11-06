package com.example.plataformavideos;


import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class VideoDetailActivity extends AppCompatActivity {
    private ImageView imageViewThumbnail;
    private TextView textViewTitle;
    private RecyclerView recyclerViewComments;
    private CommentAdapter commentAdapter;
    private List<Comment> commentList;
    private EditText editTextComment;
    private Button buttonPostComment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_detail);

        imageViewThumbnail = findViewById(R.id.videoThumbnail);
        textViewTitle = findViewById(R.id.videoTitle);
        recyclerViewComments = findViewById(R.id.recyclerViewComments);
        editTextComment = findViewById(R.id.editTextComment);
        buttonPostComment = findViewById(R.id.buttonAddComment);
        textViewTitle.setText(getIntent().getStringExtra("VIDEO_TITLE"));
        imageViewThumbnail.setImageResource(getIntent().getIntExtra("VIDEO_THUMBNAIL", -1));

        // Inicializar lista de comentários
        commentList = new ArrayList<>();
        commentAdapter = new CommentAdapter(commentList);
        recyclerViewComments.setLayoutManager(new LinearLayoutManager(this));
        recyclerViewComments.setAdapter(commentAdapter);


        buttonPostComment.setOnClickListener(v -> {
            String commentText = editTextComment.getText().toString();
            if (!commentText.isEmpty()) {
                Comment comment = new Comment("Pancioni", commentText);
                commentList.add(comment);
                commentAdapter.notifyItemInserted(commentList.size() - 1);
                editTextComment.setText("");
            }
        });
    }
}